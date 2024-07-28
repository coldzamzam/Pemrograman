const orderSummary = document.getElementById('order-summary');
const incomingOrders = document.getElementById('incoming-orders');
const searchResult = document.getElementById('search-result');
const adminDashboard = document.getElementById('admin-dashboard');

// Modals
const orderConfirmationModal = document.getElementById('order-confirmation-modal');
const completeOrderModal = document.getElementById('complete-order-modal');

// Load orders from localStorage
let orders = JSON.parse(localStorage.getItem('orders')) || [];
let incoming = JSON.parse(localStorage.getItem('incoming')) || [];
let cart = [];

// Function to generate unique order code
function generateOrderCode() {
	return Math.random().toString(36).substr(2, 5);
}

// Function to add item to cart
function addToCart(menu, price) {
	const existingItem = cart.find(item => item.menu === menu);
	if (existingItem) {
		existingItem.quantity += 1;
	} else {
		cart.push({ menu, price, quantity: 1 });
	}
	displayCart();
}

// Function to display cart
function displayCart() {
	const cartDiv = document.getElementById('cart');
	if (cart.length === 0) {
		cartDiv.innerHTML = '<h2>Cart is empty</h2>';
		return;
	}
	cartDiv.innerHTML = `
		<h2>Cart</h2>
		<table>
			<tr>
				<th>Menu</th>
				<th>Quantity</th>
			</tr>
			${cart.map(item => `
				<tr>
					<td>${item.menu}</td>
					<td>${item.quantity}</td>
				</tr>
			`).join('')}
		</table>
		<button onclick="openOrderConfirmationModal()">Order</button>
	`;
}

// Function to open order confirmation modal
function openOrderConfirmationModal() {
	const name = document.getElementById('customer-name').value;
	const phone = document.getElementById('customer-phone').value;
	const orderCode = generateOrderCode();
	
	document.getElementById('customer-details').innerText = `Name: ${name}\nPhone: ${phone}`;
	document.getElementById('order-code-display').innerText = orderCode;
	
	const orderSummaryTable = document.getElementById('order-summary-table');
	orderSummaryTable.innerHTML = `
		<tr>
			<th>Menu</th>
			<th>Quantity</th>
		</tr>
		${cart.map(item => `
			<tr>
				<td>${item.menu}</td>
				<td>${item.quantity}</td>
			</tr>
		`).join('')}
	`;
	
	orderConfirmationModal.showModal();
}

// Function to place order
function placeOrder() {
	const name = document.getElementById('customer-name').value;
	const phone = document.getElementById('customer-phone').value;
	const orderCode = document.getElementById('order-code-display').innerText;
	const orderData = { code: orderCode, name, phone, items: cart, completed: false };
	incoming.push(orderData);
	localStorage.setItem('incoming', JSON.stringify(incoming));
	cart = [];
	displayCart();
	orderConfirmationModal.close();
	alert(`Order placed! Your order code is: ${orderCode}`);
}

// Function to show order summary
function showOrderSummary() {
	if (orders.length === 0) {
		orderSummary.innerHTML = '<h2>No orders yet</h2>';
		return;
	}
	orderSummary.innerHTML = `
		<h2>Order Summary</h2>
		<table>
			<tr>
				<th>Name</th>
				<th>Phone</th>
				<th>Items</th>
				<th>Order Code</th>
			</tr>
			${orders.map(order => `
				<tr>
					<td>${order.name}</td>
					<td>${order.phone}</td>
					<td>
						<ul>
							${order.items.map(item => `
								<li>${item.menu} x${item.quantity}</li>
							`).join('')}
						</ul>
					</td>
					<td>${order.code}</td>
				</tr>
			`).join('')}
		</table>
	`;
}

// Function to show incoming orders for admin
function showIncomingOrders() {
	const incomingOrdersSection = document.getElementById('incoming-orders-section');
	if (incoming.length === 0) {
		incomingOrdersSection.innerHTML = '<h2>No incoming orders</h2>';
		return;
	}
	incomingOrdersSection.innerHTML = `
		<h2>Incoming Orders</h2>
		<table>
			<tr>
				<th>Name</th>
				<th>Phone</th>
				<th>Items</th>
				<th>Order Code</th>
				<th>Action</th>
			</tr>
			${incoming.map(order => `
				<tr>
					<td>${order.name}</td>
					<td>${order.phone}</td>
					<td>
						<ul>
							${order.items.map(item => `
								<li>${item.menu} x${item.quantity}</li>
							`).join('')}
						</ul>
					</td>
					<td>${order.code}</td>
					<td><button onclick="openCompleteOrderModal('${order.code}')">Pesanan Selesai</button></td>
				</tr>
			`).join('')}
		</table>
	`;
}

// Function to open complete order modal
function openCompleteOrderModal(orderCode) {
	const order = incoming.find(o => o.code === orderCode);
	document.getElementById('complete-order-details').innerText = `Name: ${order.name}\nPhone: ${order.phone}`;
	const completeOrderSummaryTable = document.getElementById('complete-order-summary-table');
	completeOrderSummaryTable.innerHTML = `
		<tr>
			<th>Menu</th>
			<th>Quantity</th>
		</tr>
		${order.items.map(item => `
			<tr>
				<td>${item.menu}</td>
				<td>${item.quantity}</td>
			</tr>
		`).join('')}
	`;
	completeOrderModal.dataset.orderCode = orderCode;
	completeOrderModal.showModal();
}

// Function to complete order
function completeOrder() {
	const orderCode = completeOrderModal.dataset.orderCode;
	const orderIndex = incoming.findIndex(o => o.code === orderCode);
	const completedOrder = incoming.splice(orderIndex, 1)[0];
	completedOrder.completed = true;
	orders.push(completedOrder);
	localStorage.setItem('incoming', JSON.stringify(incoming));
	localStorage.setItem('orders', JSON.stringify(orders));
	showIncomingOrders();
	showOrderSummary();
	completeOrderModal.close();
}

// Function to search for an order by code
document.getElementById('search-form').addEventListener('submit', (e) => {
	e.preventDefault();
	const orderCode = document.getElementById('order-code').value;
	const order = orders.find(o => o.code === orderCode);
	if (order) {
		searchResult.innerHTML = `
			<h2>Order Found</h2>
			<p>Name: ${order.name}</p>
			<p>Phone: ${order.phone}</p>
			<ul>
				${order.items.map(item => `
					<li>${item.menu} x${item.quantity}</li>
				`).join('')}
			</ul>
			<p>Order Code: ${order.code}</p>
		`;
	} else {
		searchResult.innerHTML = '<h2>Order not found</h2>';
	}
});

// Function to handle admin login
document.getElementById('admin-login-form').addEventListener('submit', (e) => {
	e.preventDefault();
	const username = document.getElementById('username').value;
	const password = document.getElementById('password').value;
	if (username === 'admin' && password === 'admin') {
		alert('Login successful!');
		adminDashboard.innerHTML = `
			<h2>Admin Dashboard</h2>
			<div id="incoming-orders-section"></div>
		`;
		showIncomingOrders();
	} else {
		alert('Invalid credentials');
	}
});

// Initialize the page
showOrderSummary();
showIncomingOrders();
displayCart();

// Modal buttons event listeners
document.getElementById('confirm-order-btn').addEventListener('click', placeOrder);
document.getElementById('cancel-order-btn').addEventListener('click', () => orderConfirmationModal.close());
document.getElementById('complete-order-btn').addEventListener('click', completeOrder);
document.getElementById('cancel-complete-btn').addEventListener('click', () => completeOrderModal.close());
