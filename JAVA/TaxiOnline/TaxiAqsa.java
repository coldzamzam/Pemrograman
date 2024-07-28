/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package com.mycompany.taxiaqsa;
import java.awt.CardLayout;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author shaza
 */
public class TaxiAqsa extends javax.swing.JFrame {
    private String namaDriver;
    private String platNomor;
    private String jenis;
    public int pendapatan = 0;
    /**
     * Creates new form TaxiAqsa
     */
    public TaxiAqsa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelInduk = new javax.swing.JPanel();
        LoginForm = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        bannerLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        NamaApp = new javax.swing.JLabel();
        lbPeringatan = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        lbWelcome = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbPlat = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textPlat = new javax.swing.JTextField();
        lbPenumpang = new javax.swing.JLabel();
        lbLokasiAwal = new javax.swing.JLabel();
        lbLokasiAkhir = new javax.swing.JLabel();
        lbJarak = new javax.swing.JLabel();
        textPenumpang = new javax.swing.JTextField();
        textLokasiAwal = new javax.swing.JTextField();
        textLokasiAkhir = new javax.swing.JTextField();
        textJarak = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        textTotal = new javax.swing.JLabel();
        textJenis = new javax.swing.JTextField();
        lbJenis = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        textResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInduk.setLayout(new java.awt.CardLayout());

        LoginForm.setPreferredSize(new java.awt.Dimension(0, 0));

        lbUsername.setText("Username");

        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        bannerLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bannerLogin.setText("Login Driver");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        NamaApp.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        NamaApp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NamaApp.setText("TaxiAqsa");

        lbPeringatan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPeringatan.setForeground(java.awt.Color.red);
        lbPeringatan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPeringatan.setFocusable(false);
        lbPeringatan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout LoginFormLayout = new javax.swing.GroupLayout(LoginForm);
        LoginForm.setLayout(LoginFormLayout);
        LoginFormLayout.setHorizontalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFormLayout.createSequentialGroup()
                .addGap(0, 263, Short.MAX_VALUE)
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPeringatan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginFormLayout.createSequentialGroup()
                        .addComponent(lbUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(274, 274, 274))
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NamaApp))
                    .addGroup(LoginFormLayout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginFormLayout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(bannerLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginFormLayout.setVerticalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NamaApp)
                .addGap(88, 88, 88)
                .addComponent(bannerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPeringatan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        panelInduk.add(LoginForm, "LoginForm");

        lbWelcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbWelcome.setText("Selamat datang, ");

        lbID.setText("ID");

        lbPlat.setText("Plat Nomor");

        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });

        textPlat.setEditable(false);
        textPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPlatActionPerformed(evt);
            }
        });

        lbPenumpang.setText("Nama Penumpang");

        lbLokasiAwal.setText("Titik Jemput");

        lbLokasiAkhir.setText("Lokasi Tujuan");

        lbJarak.setText("Jarak");

        textLokasiAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLokasiAwalActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        lbTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTotal.setText("Total Pendapatan");
        lbTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textTotal.setText("Rp0");
        textTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        textJenis.setEditable(false);
        textJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJenisActionPerformed(evt);
            }
        });

        lbJenis.setText("Jenis");

        btnLogout.setText("Logout");
        btnLogout.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        textResult.setEditable(false);
        textResult.setToolTipText("");
        textResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPenumpang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbJarak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPlat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbLokasiAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbJenis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbLokasiAwal, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textLokasiAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textLokasiAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textJarak, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHitung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotal)
                            .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(278, 278, 278))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(textResult, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbWelcome)
                        .addGap(18, 18, 18)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPlat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJenis)
                            .addComponent(textJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPenumpang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLokasiAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textLokasiAwal))
                        .addGap(18, 32, Short.MAX_VALUE)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLokasiAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textLokasiAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbJarak, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textJarak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(textResult)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnHitung))
                .addGap(23, 23, 23)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(262, 262, 262))
        );

        panelInduk.add(Home, "Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInduk, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        
    
    
//    TaxiDriver driver1 = new TaxiDriver("Rudi Salim", "RS001", "B 4090 RTX", "Listrik");
//    TaxiDriver driver2 = new TaxiDriver("Andy Taher", "AT002", "B 7800 RX", "Reguler");
    
//    drivers.add(new TaxiDriver("Rudi Salim", "RS001", "B 4090 RTX", "Listrik"));
     
    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if (textUsername.getText().equals("RS001")){
            namaDriver = "Rudi Salim";
            platNomor = "B 4090 RTX";
            jenis = "Listrik";
        } else if (textUsername.getText().equals("AT002")){
            namaDriver = "Andy Taher";
            platNomor = "B 7800 RX";
            jenis = "Reguler";
        } else if (textUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong!");
            return;
        } else{
            JOptionPane.showMessageDialog(null, "Username Anda salah atau tidak terdaftar!");
            return;
        }
        textID.setText(textUsername.getText());
        textPlat.setText(platNomor);
        textJenis.setText("Mobil " + jenis);

        lbWelcome.setText("Selamat datang, " + namaDriver + ".");

        CardLayout layout = (CardLayout) panelInduk.getLayout();
        layout.show(panelInduk, "Home");
        
    }                                        

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Calendar calendar = Calendar.getInstance();
        String namaPenumpang = textPenumpang.getText();
        String lokasiAwal = textLokasiAwal.getText();
        String lokasiAkhir = textLokasiAkhir.getText();
        int jarak = Integer.parseInt(textJarak.getText());
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int harga;
        int hargaPerKM;
        int argoAwal;
        int total;
        String minutes;
        int hours = 0;
        
        if (jenis.equals("Listrik")){
            argoAwal = 10000;
            hargaPerKM = 6300;
        } else{
            argoAwal = 9000;
            if (jarak < 10){
                hargaPerKM = 6000;
            } else if (jarak > 30){
                hargaPerKM = 5000;
            } else{
                hargaPerKM = 5200;
            }
        }
        
        harga = argoAwal + (hargaPerKM * jarak);
        minute += (2 * jarak);
        
        while (minute > 60){
            minute -= 60;
            hours = hour + 1;
        }
        if (minute < 10){
            minutes = Integer.toString(minute);
            minutes = "0" + minutes;
        } else{
            minutes = Integer.toString(minute);
        }
        
//        textResult.setText("STRUK PEMBAYARAN"
//                + "Nama Driver\t: " + namaDriver + "\n"
//                + "ID\t: " + textUsername.getText() + "\n"
//                + "Plat Nomor\t: " + platNomor + "\n"
//                + "Jenis\t: Mobil " + jenis + "\n"
//                + "\n"
//                + "Nama Penumpang\t: " + namaPenumpang + "\n"
//                + "Titik Jemput\t: " + lokasiAwal + "\n"
//                + "Lokasi Tujuan\t: " + lokasiAkhir +"\n"
//                + "Jarak\t: " + jarak + " KM\n"
//                + "Waktu Penjemputan\t: " + hour + ":" + minute + "\n"
//                + "Waktu Sampai\t: " + hours + ":" + minutes + "\n"
//                + "Total\t: " + harga);
//        textResult.append("Nama Driver\t: " + namaDriver + "\n");
        
    }                                         

    private void textLokasiAwalActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void textPlatActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void textJenisActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        textUsername.setText("");
        lbPeringatan.setText("");
        CardLayout layout = (CardLayout) panelInduk.getLayout();
        layout.show(panelInduk, "LoginForm");
    }                                         

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
//        textResult.setText("");
        textPenumpang.setText("");
        textLokasiAwal.setText("");
        textLokasiAkhir.setText("");
        textJarak.setText("");
    }                                        

    private void textResultActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaxiAqsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaxiAqsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaxiAqsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaxiAqsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxiAqsa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Home;
    private javax.swing.JPanel LoginForm;
    private javax.swing.JLabel NamaApp;
    private javax.swing.JLabel bannerLogin;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbJarak;
    private javax.swing.JLabel lbJenis;
    private javax.swing.JLabel lbLokasiAkhir;
    private javax.swing.JLabel lbLokasiAwal;
    private javax.swing.JLabel lbPenumpang;
    private javax.swing.JLabel lbPeringatan;
    private javax.swing.JLabel lbPlat;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JPanel panelInduk;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textJarak;
    private javax.swing.JTextField textJenis;
    private javax.swing.JTextField textLokasiAkhir;
    private javax.swing.JTextField textLokasiAwal;
    private javax.swing.JTextField textPenumpang;
    private javax.swing.JTextField textPlat;
    private javax.swing.JTextField textResult;
    private javax.swing.JLabel textTotal;
    private javax.swing.JTextField textUsername;
    // End of variables declaration                   
}