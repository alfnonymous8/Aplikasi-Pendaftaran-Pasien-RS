/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.rumah.sakit.lekas.sehat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alfianda Syahrul
 */
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form Daftar
     */
    public Daftar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPonsel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdLaki = new javax.swing.JRadioButton();
        tglLahir = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtNRM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        txtConfirm = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 400));
        setResizable(false);

        jLabel1.setText("Silahkan masukkan data dengan benar");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtAlamat.setColumns(20);
        txtAlamat.setLineWrap(true);
        txtAlamat.setRows(5);
        txtAlamat.setWrapStyleWord(true);
        txtAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlamatKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtAlamat);

        jLabel5.setText("4. Tanggal lahir");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtPonsel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPonselKeyPressed(evt);
            }
        });

        jLabel6.setText("5. No. Ponsel");

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
        });

        jLabel3.setText("2. Nama Lengkap");

        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki-laki");
        rdLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLakiActionPerformed(evt);
            }
        });

        jLabel4.setText("3. Jenis Kelamin");

        jLabel7.setText("6. Alamat");

        jLabel2.setText("1. NRM");

        jLabel9.setText("8. Password");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtNRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNRMActionPerformed(evt);
            }
        });
        txtNRM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNRMKeyPressed(evt);
            }
        });

        jLabel8.setText("7. Email");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Perempuan");

        jLabel10.setText("9. Konfirmasi Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdLaki)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))
                                    .addComponent(txtNRM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPonsel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtConfirm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(rdLaki))
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPonsel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnSubmit)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(85, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNRMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNRMKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()>='A'&&evt.getKeyChar()<='Z' ||
            evt.getKeyChar()>='0'&&evt.getKeyChar()<='9' ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE){
            txtNRM.setEditable(true);
        } else {
            txtNRM.setEditable(false);
        }
    }//GEN-LAST:event_txtNRMKeyPressed

    private void txtNRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNRMActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        cekNrm();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void rdLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdLakiActionPerformed

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        // TODO add your handling code here:
        if( evt.getKeyChar()>='a'&&evt.getKeyChar()<='z' ||
            evt.getKeyChar()>='A'&&evt.getKeyChar()<='Z' ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE){
            txtNama.setEditable(true);
        } else {
            txtNama.setEditable(false);
        }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtPonselKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPonselKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9' ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE){
            txtPonsel.setEditable(true);
        } else {
            txtPonsel.setEditable(false);
        }
    }//GEN-LAST:event_txtPonselKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        if( evt.getKeyChar()>='a'&&evt.getKeyChar()<='z' ||
            evt.getKeyChar()>='A'&&evt.getKeyChar()<='Z' ||
            evt.getKeyChar()>='0'&&evt.getKeyChar()<='9' ||
            evt.getKeyChar()<='@' ||
            evt.getKeyChar()<='.' ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE){
            txtEmail.setEditable(true);
        } else {
            txtEmail.setEditable(false);
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtAlamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatKeyPressed
        // TODO add your handling code here:
        if( evt.getKeyChar()>='a'&&evt.getKeyChar()<='z' ||
            evt.getKeyChar()>='A'&&evt.getKeyChar()<='Z' ||
            evt.getKeyChar()>='0'&&evt.getKeyChar()<='9' ||
            evt.getKeyChar()<=':' ||
            evt.getKeyChar()<='/' ||
            evt.getKeyChar()<='.' ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ||
            evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE){
            txtAlamat.setEditable(true);
        } else {
            txtAlamat.setEditable(false);
        }
    }//GEN-LAST:event_txtAlamatKeyPressed

    Connection conn = Koneksi.connectDB();
    public void cekNrm(){
        String nrm = txtNRM.getText();
        
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM nrm WHERE id_nrm=?");
            stmt.setString(1, nrm);
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "NRM tidak terdaftar!!\nSilahkan lakukan pendaftaran awal pada RS Lekas Sembuh.", "Warning!", JOptionPane.PLAIN_MESSAGE);
            }else {
                cekNrm2();                
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void cekNrm2(){
        String nrm = txtNRM.getText();
        
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM data_pengguna WHERE nrm=?");
            stmt.setString(1, nrm);
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == false) {
                cekEmail();
            } else {
//                        JOptionPane.showMessageDialog(null, "Akun dengan NRM tersebut sudah ada!!!\n", "Warning!", JOptionPane.PLAIN_MESSAGE);
                Object[] opt = {"Masuk halaman login", "Periksa NRM"};
                int selesai = JOptionPane.showOptionDialog(null, "Akun dengan NRM tersebut sudah ada!!!", "Warning!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);
                if (selesai == JOptionPane.OK_OPTION){
                    Home depan = new Home();
                    dispose();
                    depan.setVisible(true);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cekEmail(){
        String email = txtEmail.getText();
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM data_pengguna WHERE email=?");
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == false) {
                cekPass();
            }else{
                JOptionPane.showMessageDialog(null, "Email sudah terdaftar!!\nSilahkan gunakan email lain.", "Warning!", JOptionPane.PLAIN_MESSAGE);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void cekPass(){
        String pass = txtPassword.getText();
        String konf = txtConfirm.getText();
        if (pass.equals(konf)) {
            inputData();
        } else {
            JOptionPane.showMessageDialog(null, "Password tidak cocok", "Warning!", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void inputData(){
        int result = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", "Warning!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION){
            try{
                String jk = "";
                String tgl = tglLahir.getDateStringOrEmptyString();
                
                if(rdLaki.isSelected()){
                   jk += "Laki - laki";
                } else {
                    jk += "Perempuan";
                }
                
                HashSHA256 sha256 = new HashSHA256();
                String hashedPass = sha256.hashSHA256(txtPassword.getText());
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO data_pengguna(nrm,nama,jenis,tanggal,ponsel,alamat,email,sandi)"
                        + " VALUES(?,?,?,?,?,?,?,?)");
                stmt.setString(1, txtNRM.getText());
                stmt.setString(2, txtNama.getText());
                stmt.setString(3, jk);
                stmt.setString(4, tgl);
                stmt.setString(5, txtPonsel.getText());
                stmt.setString(6, txtAlamat.getText());
                stmt.setString(7, txtEmail.getText());
                stmt.setString(8, hashedPass);

                stmt.executeUpdate();
                
                int selesai = JOptionPane.showConfirmDialog(null, "Selamat!! pendaftaran berhasil.", "Announcement", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (selesai == JOptionPane.OK_OPTION){
                    Home depan = new Home();
                    dispose();
                    depan.setVisible(true);
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdLaki;
    private com.github.lgooddatepicker.components.DatePicker tglLahir;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNRM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPonsel;
    // End of variables declaration//GEN-END:variables
}
