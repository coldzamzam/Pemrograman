import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LaundryService extends JFrame {
	private JTextField txtName, txtDate, txtWeight, txtItemQuantity;
	private JComboBox<String> cbServiceType, cbSingleItemType;
	private JTextArea txtReceipt;
	private JLabel lblTotalIncome, lblDiskon;
	private JCheckBox cbKiloan, cbSatuan;
	private double totalIncome = 0;

	public LaundryService() {
		setTitle("ANW Laundry Service");
		setSize(5000, 6000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(12, 2));

		panel.add(new JLabel("Nama Customer:"));
		txtName = new JTextField();
		panel.add(txtName);

		panel.add(new JLabel("Tanggal:"));
		txtDate = new JTextField();
		panel.add(txtDate);

		panel.add(new JLabel("Pilih Jenis Layanan:"));
		cbKiloan = new JCheckBox("Kiloan");
		cbSatuan = new JCheckBox("Satuan");
		JPanel panel3 = new JPanel();
		panel3.add(cbKiloan);
		panel3.add(cbSatuan);
		panel.add(panel3);

			panel.add(new JLabel("Layanan:"));
			cbServiceType = new JComboBox<>(new String[]{
					"Reguler 2 Hari - Cuci + Setrika (Rp 7000/Kg)",
					"Reguler 2 Hari- Setrika Saja (Rp 5000/Kg)",
					"Reguler 2 Hari- Cuci Saja (Rp 5000/Kg)",
					"Express 12 Jam - Cuci + Setrika (Rp 12000/Kg)",
					"Express 12 Jam - Setrika Saja (Rp 8000/Kg)",
					"Express 12 Jam - Cuci Saja (Rp 8000/Kg)",
					"Express 24 Jam - Cuci + Setrika (Rp 8000/Kg)",
					"Express 24 Jam - Setrika Saja (Rp 5000/Kg)",
					"Express 24 Jam - Cuci Saja (Rp 5000/Kg)",
					"Lainnya - Gorden (Rp 10000/Kg)",
					"Lainnya - Gorden Tipis (Dalam) (Rp 15000/Kg)",
					"Lainnya - Pakaian Bayi (Rp 10000/Kg)"
			});
			panel.add(cbServiceType);
			panel.add(new JLabel("Berat (Kg):"));
			txtWeight = new JTextField();
			panel.add(txtWeight);

		panel.add(new JLabel("Jenis Item Satuan:"));
		cbSingleItemType = new JComboBox<>(new String[]{
				"Selimut (Rp 15000)",
				"Bedcover (Rp 25000)",
				"Bedcover Besar (Rp 35000)",
				"Bedcover 1 Set (Rp 35000)",
				"Tas (Rp 15000)",
				"Sepatu (Rp 15000)",
				"Boneka (Rp 10000)",
				"Helm (Rp 15000)",
				"Jaket Tebal (Rp 20000)",
				"Jas (Rp 20000)",
				"Setelan Jas (Rp 40000)",
				"Blezzer (Rp 20000)",
				"Setelan Blezzer (Rp 40000)",
				"Kebaya/Gaun (Rp 20000)",
				"Kebaya Panjang/Gaun Panjang (Rp 40000)",
				"Karpet (Rp 15000 / M2)"
		});
		panel.add(cbSingleItemType);
		panel.add(new JLabel("Jumlah Item Satuan:"));
		txtItemQuantity = new JTextField();
		panel.add(txtItemQuantity);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtDate.setText("");
				txtWeight.setText("");
				txtItemQuantity.setText("");
				// txtReceipt.setText("");
			}
			
		});
		panel.add(btnClear);
		
		JButton btnCalculate = new JButton("Hitung Tagihan");
		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculateBill();
				txtName.setText("");
				txtDate.setText("");
				txtWeight.setText("");
				txtItemQuantity.setText("");
			}
		});
		panel.add(btnCalculate);

		lblDiskon = new JLabel("Member mendapat diskon 2%");
		panel.add(lblDiskon);

		lblTotalIncome = new JLabel("Total Pemasukan: Rp 0");
		panel.add(lblTotalIncome);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		txtReceipt = new JTextArea(500, 500);
		txtReceipt.setEditable(false);;
		panel2.add(txtReceipt);

		add(panel2,BorderLayout.CENTER);
		add(panel, BorderLayout.WEST);
		setVisible(true);
	}

	private void calculateBill() {
		try {
			if (cbKiloan.isSelected() && cbSatuan.isSelected()){
				String name = txtName.getText();
				String date = txtDate.getText();
				String[] options = {"Member", "Non-Member"};
				int memberStatus = JOptionPane.showOptionDialog(this,
						"Apakah customer adalah member?",
						"Status Member",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[1]);
				boolean isMember = (memberStatus == JOptionPane.YES_OPTION);
				String serviceType = (String) cbServiceType.getSelectedItem();
				double weight = Double.parseDouble(txtWeight.getText());
				String singleItemType = (String) cbSingleItemType.getSelectedItem();
				int itemQuantity = Integer.parseInt(txtItemQuantity.getText());
				
				double servicePrice = getServicePrice(serviceType);
				double singleItemPrice = getSingleItemPrice(singleItemType);
				double totalWeightPrice = servicePrice * weight;
				double totalItemPrice = singleItemPrice * itemQuantity;
				double totalPrice = totalWeightPrice + totalItemPrice;

				if (isMember) {
					totalPrice *= 0.98;
				}

				totalIncome += totalPrice;

				txtReceipt.append("Nama: " + name + "\n");
				txtReceipt.append("Tanggal: " + date + "\n");
				txtReceipt.append("Kategori: " + (isMember ? "Member" : "Non-Member") + "\n");
				txtReceipt.append("Layanan: " + serviceType +"\n                " + singleItemType + "\n");
				txtReceipt.append("Berat: " + weight + " Kg\n");
				txtReceipt.append("Jumlah Item Satuan: " + itemQuantity + "\n");
				txtReceipt.append("Total Harga: Rp " + totalPrice + "\n\n");
				lblTotalIncome.setText("Total Pemasukan: Rp " + totalIncome);
			}
			if (cbKiloan.isSelected() && !cbSatuan.isSelected()){
				String name = txtName.getText();
				String date = txtDate.getText();
				String[] options = {"Member", "Non-Member"};
				int memberStatus = JOptionPane.showOptionDialog(this,
						"Apakah customer adalah member?",
						"Status Member",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[1]);
				boolean isMember = (memberStatus == JOptionPane.YES_OPTION);
				String serviceType = (String) cbServiceType.getSelectedItem();
				double weight = Double.parseDouble(txtWeight.getText());
				
				double servicePrice = getServicePrice(serviceType);
				double totalWeightPrice = servicePrice * weight;
				double totalPrice = totalWeightPrice;

				if (isMember) {
					totalPrice *= 0.98;
				}

				totalIncome += totalPrice;

				txtReceipt.append("Nama: " + name + "\n");
				txtReceipt.append("Tanggal: " + date + "\n");
				txtReceipt.append("Kategori: " + (isMember ? "Member" : "Non-Member") + "\n");
				txtReceipt.append("Layanan: " + serviceType + "\n");
				txtReceipt.append("Berat: " + weight + " Kg\n");
				txtReceipt.append("Total Harga: Rp " + totalPrice + "\n\n");

				lblTotalIncome.setText("Total Pemasukan: Rp " + totalIncome);
			}
			if (!cbKiloan.isSelected() && cbSatuan.isSelected()){
				String name = txtName.getText();
				String date = txtDate.getText();
				String[] options = {"Member", "Non-Member"};
				int memberStatus = JOptionPane.showOptionDialog(this,
						"Apakah customer adalah member?",
						"Status Member",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[1]);
				boolean isMember = (memberStatus == JOptionPane.YES_OPTION);
				String singleItemType = (String) cbSingleItemType.getSelectedItem();
				int itemQuantity = Integer.parseInt(txtItemQuantity.getText());
				
				double singleItemPrice = getSingleItemPrice(singleItemType);
				double totalItemPrice = singleItemPrice * itemQuantity;
				double totalPrice = totalItemPrice;

				if (isMember) {
					totalPrice *= 0.98;
				}

				totalIncome += totalPrice;

				txtReceipt.append("Nama: " + name + "\n");
				txtReceipt.append("Tanggal: " + date + "\n");
				txtReceipt.append("Kategori: " + (isMember ? "Member" : "Non-Member") + "\n");
				txtReceipt.append("Layanan: " + singleItemType + "\n");
				txtReceipt.append("Jumlah Item Satuan: " + itemQuantity + "\n");
				txtReceipt.append("Total Harga: Rp " + totalPrice + "\n\n");

				lblTotalIncome.setText("Total Pemasukan: Rp " + totalIncome);
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan berat dan jumlah item dengan benar!", "Input Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private double getServicePrice(String serviceType) {
		switch (serviceType) {
			case "Reguler 2 Hari - Cuci + Setrika (Rp 7000/Kg)":
				return 7000;
			case "Reguler 2 Hari - Setrika Saja (Rp 5000/Kg)":
				return 5000;
			case "Reguler 2 Hari- Cuci Saja (Rp 5000/Kg)":
				return 5000;
			case "Express 12 Jam - Cuci + Setrika (Rp 12000/Kg)":
				return 12000;
			case "Express 12 Jam - Setrika Saja (Rp 8000/Kg)":
				return 8000;
			case "Express 12 Jam - Cuci Saja (Rp 8000/Kg)":
				return 8000;
			case "Express 24 Jam - Cuci + Setrika (Rp 8000/Kg)":
				return 8000;
			case "Express 24 Jam - Setrika Saja (Rp 5000/Kg)":
				return 5000;
			case "Express 24 Jam - Cuci Saja (Rp 5000/Kg)":
				return 5000;
			case "Gorden (Rp 10000/Kg)":
				return 10000;
			case "Gorden Tipis (Dalam) (Rp 15000/Kg)":
				return 15000;
			case "Pakaian Bayi (Rp 10000/Kg)":
				return 10000;
			default:
				return 0;
		}
	}

	private double getSingleItemPrice(String singleItemType) {
		switch (singleItemType) {
			case "Selimut (Rp 15000)":
				return 15000;
			case "Bedcover (Rp 25000)":
				return 25000;
			case "Bedcover Besar (Rp 35000)":
				return 35000;
			case "Bedcover 1 Set (Rp 35000)":
				return 35000;
			case "Tas (Rp 15000)":
				return 15000;
			case "Sepatu (Rp 15000)":
				return 15000; 
			case "Boneka (Rp 10000)":
				return 10000; 
			case "Helm (Rp 15000)":
				return 15000;
			case "Jaket Tebal (Rp 20000)":
				return 20000; 
			case "Jas (Rp 20000)":
				return 20000;
			case "Setelan Jas (Rp 40000)":
				return 40000;
			case "Blezzer (Rp 20000)":
				return 20000;
			case "Setelan Blezzer (Rp 40000)":
				return 40000;
			case "Kebaya/Gaun (Rp 20000)":
				return 20000;
			case "Kebaya Panjang/Gaun Panjang (Rp 40000)":
				return 40000;
			case "Karpet (Rp 15000 / M2)":
				return 15000; 
			default:
				return 0;
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LaundryService();
			}
		});
	}
}