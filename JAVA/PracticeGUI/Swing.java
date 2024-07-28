package PracticeGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame {
  JTextField NIM, nama, nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAngka, nilaiHuruf, nilaiBobot, keterangan;
  JLabel lbHasil;
  String huruf, ket;
  int bobot;

  public void intialize(){
    // Label and Text Field
    // NIM
    JLabel lbNIM = new JLabel("NIM");
    NIM = new JTextField();

    //Nama
    JLabel lbNama = new JLabel("Nama");
    nama = new JTextField();

    // Nilai Absen
    JLabel lbNilaiAbsen = new JLabel("Nilai Absen");
    nilaiAbsen = new JTextField();
    
    // Nilai Tugas
    JLabel lbNilaiTugas = new JLabel("Nilai Tugas");
    nilaiTugas = new JTextField();

    // Nilai UTS
    JLabel lbNilaiUTS = new JLabel("Nilai UTS");
    nilaiUTS = new JTextField();

    // Nilai UAS
    JLabel lbNilaiUAS = new JLabel("NIlai UAS");
    nilaiUAS = new JTextField();

    //Nilai Angka
    JLabel lbNilaiAngka = new JLabel("Nilai Angka");
    nilaiAngka = new JTextField();
    nilaiAngka.setEditable(false);

    // Nilai Huruf
    JLabel lbNilaiHuruf = new JLabel("NIlai Huruf");
    nilaiHuruf = new JTextField();
    nilaiHuruf.setEditable(false);

    // Nilai Bobot
    JLabel lbNilaiBobot = new JLabel("NIlai Bobot");
    nilaiBobot = new JTextField();
    nilaiBobot.setEditable(false);

    // Keterangan    
    JLabel lbKet = new JLabel("Keterangan");
    keterangan = new JTextField();
    keterangan.setEditable(false);

    // Add form to panel
    // Add margin to label and text field
    JPanel formPanel = new JPanel();
    formPanel.setLayout(new GridLayout(6, 1, 5, 5));
    formPanel.setOpaque(false);
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

    JPanel resultPanel = new JPanel();
    resultPanel.setLayout(new GridLayout(6, 1, 5, 5));
    resultPanel.setOpaque(false);
    resultPanel.add(lbNilaiAngka);
    resultPanel.add(nilaiAngka);
    resultPanel.add(lbNilaiHuruf);
    resultPanel.add(nilaiHuruf);
    resultPanel.add(lbNilaiBobot);
    resultPanel.add(nilaiBobot);
    resultPanel.add(lbKet);
    resultPanel.add(keterangan);

    // Add button and its function
    JButton btnHitung = new JButton("Hitung");
    btnHitung.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        int absen = Integer.parseInt(nilaiAbsen.getText());
        int tugas = Integer.parseInt(nilaiTugas.getText());
        int uts = Integer.parseInt(nilaiUTS.getText());
        int uas = Integer.parseInt(nilaiUAS.getText());

        double angka = (0.1 * absen) + (0.1 * tugas) + (0.3 * uts) + (0.5 * uas);
        if (angka > 81) {
          huruf = "A";
          bobot = 4;
          ket = "Sangat Memuaskan";
        } else if (angka > 76) {
          huruf = "B";
          bobot = 3;
          ket = "Memuaskan";
        } else if (angka > 72) {
          huruf = "C";
          bobot = 2;
          ket = "Cukup Memuaskan";
        } else if (angka > 65) {
          huruf = "D";
          bobot = 1;
          ket = "Kurang Memuaskan";
        } else {
          huruf = "E";
          bobot = 0;
          ket = "Gagal";
        }

        nilaiAngka.setText(Double.toString(angka));
        nilaiHuruf.setText(huruf);
        nilaiBobot.setText(Integer.toString(bobot));
        keterangan.setText(ket);
      }
    });

    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        NIM.setText("");
        nama.setText("");
        nilaiAbsen.setText("");
        nilaiTugas.setText("");
        nilaiUTS.setText("");
        nilaiUAS.setText("");
        nilaiAngka.setText("");
        nilaiHuruf.setText("");
        nilaiBobot.setText("");
        keterangan.setText("");        
      }
      
    });

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
    buttonPanel.setOpaque(false);
    buttonPanel.add(btnHitung);
    buttonPanel.add(btnClear);

    // Display main panel
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(128, 128, 255));
    mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    mainPanel.add(formPanel, BorderLayout.NORTH);
    mainPanel.add(resultPanel, BorderLayout.EAST);
    mainPanel.add(buttonPanel, BorderLayout.SOUTH);

    add(mainPanel);

    setTitle("Nilai Huruf Demo");
    setSize(400, 400);
    setMinimumSize(new Dimension(200, 400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    Swing myFrame = new Swing();
    myFrame.intialize();
  }
}
