package GUI.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrySwing extends JFrame {
		final private Font mainFont = new Font("Times New Roman", Font.BOLD, 16);
		JTextField NIM, nama, nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS;
		JLabel lbHasil;
		String nilaiHuruf, keterangan;
		int nilaiBobot;

		public void initialize() {
				// Label and Text Field
				JLabel lbNIM = new JLabel("NIM");
				lbNIM.setFont(mainFont);

				NIM = new JTextField();
				NIM.setFont(mainFont);

				JLabel lbNama = new JLabel("Nama");
				lbNama.setFont(mainFont);

				nama = new JTextField();
				nama.setFont(mainFont);

				JLabel lbNilaiAbsen = new JLabel("Nilai Absen");
				lbNilaiAbsen.setFont(mainFont);

				nilaiAbsen = new JTextField();
				nilaiAbsen.setFont(mainFont);

				JLabel lbNilaiTugas = new JLabel("Nilai Tugas");
				lbNilaiTugas.setFont(mainFont);

				nilaiTugas = new JTextField();
				nilaiTugas.setFont(mainFont);

				JLabel lbNilaiUTS = new JLabel("Nilai UTS");
				lbNilaiUTS.setFont(mainFont);

				nilaiUTS = new JTextField();
				nilaiUTS.setFont(mainFont);

				JLabel lbNilaiUAS = new JLabel("Nilai UAS");
				lbNilaiUAS.setFont(mainFont);

				nilaiUAS = new JTextField();
				nilaiUAS.setFont(mainFont);

				// Add margin to label and text field
				JPanel formPanel = new JPanel();
				formPanel.setLayout(new GridLayout(6, 2, 5, 5));
				formPanel.add(lbNIM);
				formPanel.add(NIM);
				formPanel.add(lbNama);
				formPanel.add(nama);
				formPanel.add(lbNilaiAbsen);
				formPanel.add(nilaiAbsen);
				formPanel.add(lbNilaiTugas);
				formPanel.add(nilaiTugas);
				formPanel.add(lbNilaiUTS);
				formPanel.add(nilaiUTS);
				formPanel.add(lbNilaiUAS);
				formPanel.add(nilaiUAS);

				// Add button and its function
				JButton btnHitung = new JButton("Hitung");
				btnHitung.setFont(mainFont);
				btnHitung.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
								try {
										int absen = Integer.parseInt(nilaiAbsen.getText());
										int tugas = Integer.parseInt(nilaiTugas.getText());
										int uts = Integer.parseInt(nilaiUTS.getText());
										int uas = Integer.parseInt(nilaiUAS.getText());

										double angka = (0.1 * absen) + (0.1 * tugas) + (0.3 * uts) + (0.5 * uas);
										if (angka > 81) {
												nilaiHuruf = "A";
												nilaiBobot = 4;
												keterangan = "Sangat Memuaskan";
										} else if (angka > 76) {
												nilaiHuruf = "B";
												nilaiBobot = 3;
												keterangan = "Memuaskan";
										} else if (angka > 72) {
												nilaiHuruf = "C";
												nilaiBobot = 2;
												keterangan = "Cukup Memuaskan";
										} else if (angka > 65) {
												nilaiHuruf = "D";
												nilaiBobot = 1;
												keterangan = "Kurang Memuaskan";
										} else {
												nilaiHuruf = "E";
												nilaiBobot = 0;
												keterangan = "Gagal";
										}

										lbHasil.setText("<html>Nilai Angka: " + angka + "<br>Nilai Huruf: " + nilaiHuruf + "<br>Nilai Bobot: " + nilaiBobot + "<br>Keterangan: " + keterangan + "</html>");
								} catch (NumberFormatException ex) {
										JOptionPane.showMessageDialog(TrySwing.this, "Please enter valid numbers in all fields.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
								}
						}
				});

				// Display the results
				lbHasil = new JLabel();
				lbHasil.setFont(mainFont);

				JPanel buttonPanel = new JPanel();
				buttonPanel.setLayout(new GridLayout(1, 1, 5, 5));
				buttonPanel.add(btnHitung);

				// Display main panel
				JPanel mainPanel = new JPanel();
				mainPanel.setLayout(new BorderLayout());
				mainPanel.setBackground(new Color(128, 128, 255));
				mainPanel.add(formPanel, BorderLayout.NORTH);
				mainPanel.add(lbHasil, BorderLayout.CENTER);
				mainPanel.add(buttonPanel, BorderLayout.SOUTH);

				add(mainPanel);

				setTitle("Nilai Huruf Demo");
				setSize(500, 800);
				setMinimumSize(new Dimension(250, 400));
				setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				setVisible(true);
		}

		public static void main(String[] args) {
				TrySwing myFrame = new TrySwing();
				myFrame.initialize();
		}
}

