// script.js
const orderForm = document.getElementById('order-form');
const searchForm = document.getElementById('search-form');
const adminLoginForm = document.getElementById('admin-login-form');
const orderSummary = document.getElementById('order-summary');
const searchResult = document.getElementById('search-result');
const adminDashboard = document.getElementById('admin-dashboard');

// Load orders from localStorage
let orders = JSON.parse(localStorage.getItem('orders')) || [];

// Function to generate unique order code
function generateOrderCode() {
    return Math.random().toString(36).substr(2, 5);
}

// Event listeners
orderForm.addEventListener('submit', (e) => {
    e.preventDefault();
    const menu = document.getElementById('menu').value;
    const quantity = document.getElementById('quantity').value;
    const orderCode = generateOrderCode();
    const orderData = { code: orderCode, menu, quantity };
    orders.push(orderData);
    localStorage.setItem('orders', JSON.stringify(orders));
    orderSummary.innerHTML = `
        <h2>Order Summary</h2>
        <table>
            <tr>
                <th>Menu</th>
                <th>Quantity</th>
                <th>Order Code</th>
            </tr>
            <tr>
                <td>${menu}</td>
                <td>${quantity}</td>
                <td>${orderCode}</td>
            </tr>
        </table>
    `;
});

searchForm.addEventListener('submit', (e) => {
    e.preventDefault();
    const orderCode = document.getElementById('order-code').value;
    const foundOrder = orders.find((order) => order.code === orderCode);
    if (foundOrder) {
        searchResult.innerHTML = `
            <h2>Order Found</h2>
            <table>
                <tr>
                    <th>Menu</th>
                    <th>Quantity</th>
                </tr>
                <tr>
                    <td>${foundOrder.menu}</td>
                    <td>${foundOrder.quantity}</td>
                </tr>
            </table>
        `;
    } else {
        searchResult.innerHTML = '<h2>Order Not Found</h2>';
    }
});

adminLoginForm.addEventListener('submit', (e) => {
    e.preventDefault();
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    if (username === 'admin' && password === 'password') {
        adminDashboard.innerHTML = `
            <h2>Admin Dashboard</h2>
            <ul>
                <li><a href="#" onclick="showOrders()">Show Orders</a></li>
                <li><a href="#" onclick="deleteOrder()">Delete Order</a></li>
                <li><a href="#" onclick="editOrder()">Edit Order</a></li>
            </ul>
        `;
    } else {
        adminDashboard.innerHTML = '<h2>Invalid Credentials</h2>';
    }
});

// Function to show orders
function showOrders() {
    adminDashboard.innerHTML = `
        <h2>Orders</h2>
        <ul>
            ${orders.map((order) => `<li>Code: ${order.code}, Menu: ${order.menu}, Quantity: ${order.quantity}</li>`).join('')}
        </ul>
    `;
}

// Function to delete order
function deleteOrder() {
    const orderCode = prompt('Enter order code to delete:');
    const index = orders.findIndex((order) => order.code === orderCode);
    if (index !== -1) {
        orders.splice(index, 1);
        localStorage.setItem('orders', JSON.stringify(orders));
        alert('Order deleted successfully!');
    } else {
        alert('Order not found!');
    }
}

// Function to edit order
function editOrder() {
    const orderCode = prompt('Enter order code to edit:');
    const index = orders.findIndex((order) => order.code === orderCode);
    if (index !== -1) {
        const order = orders[index];
        const newMenu = prompt('Enter new menu:', order.menu);
        const newQuantity = prompt('Enter new quantity:', order.quantity);
        orders[index] = { code: orderCode, menu: newMenu, quantity: newQuantity };
        localStorage.setItem('orders', JSON.stringify(orders));
        alert('Order updated successfully!');
    } else {
        alert('Order not found!');
    }
}