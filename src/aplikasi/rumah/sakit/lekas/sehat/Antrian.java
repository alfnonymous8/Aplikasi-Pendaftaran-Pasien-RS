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
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Alfianda Syahrul
 */
public class Antrian extends javax.swing.JFrame {
    String pol = "";
    String tgl = "";
    int noAntri = 0;
    String tahun = "";
    String usiaa = "";

    /**
     * Creates new form Antrian
     */
    public Antrian() {
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
        rdBidan = new javax.swing.JRadioButton();
        rdAnak = new javax.swing.JRadioButton();
        rdParu = new javax.swing.JRadioButton();
        rdJantung = new javax.swing.JRadioButton();
        rdTht = new javax.swing.JRadioButton();
        rdGigi = new javax.swing.JRadioButton();
        rdRadio = new javax.swing.JRadioButton();
        rdDalam = new javax.swing.JRadioButton();
        btnAmbil = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        tglAntri = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Silahkan Pilih Poli Yang Dituju");

        buttonGroup1.add(rdBidan);
        rdBidan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdBidan.setText("Poli Kebidanan");

        buttonGroup1.add(rdAnak);
        rdAnak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdAnak.setText("Poli Anak");

        buttonGroup1.add(rdParu);
        rdParu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdParu.setText("Poli Paru");

        buttonGroup1.add(rdJantung);
        rdJantung.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdJantung.setText("Poli Jantung");

        buttonGroup1.add(rdTht);
        rdTht.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdTht.setText("Poli THT");

        buttonGroup1.add(rdGigi);
        rdGigi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdGigi.setText("Poli Gigi");

        buttonGroup1.add(rdRadio);
        rdRadio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdRadio.setText("Radiologi");

        buttonGroup1.add(rdDalam);
        rdDalam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdDalam.setText("Poli Dalam");

        btnAmbil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAmbil.setText("Ambil Antrian");
        btnAmbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbilActionPerformed(evt);
            }
        });

        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel2.setText("Pilih Tanggal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdAnak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdRadio)
                                    .addComponent(rdDalam)
                                    .addComponent(rdTht)
                                    .addComponent(rdParu)
                                    .addComponent(rdJantung)
                                    .addComponent(rdGigi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAmbil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tglAntri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdBidan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(rdBidan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rdAnak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdJantung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdParu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdGigi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdTht)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdDalam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdRadio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglAntri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnAmbil)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbilActionPerformed
        // TODO add your handling code here:
        pol = "";
        tgl = "";
        noAntri = 0;
        ambil();
    }//GEN-LAST:event_btnAmbilActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    public void ambil(){
        String NRM = Utama.NRM;
        
        if (rdBidan.isSelected()) {
            pol += "Poli Kebidanan";
        } else if (rdAnak.isSelected()) {
            pol += "Poli Anak";
        } else if (rdDalam.isSelected()) {
            pol += "Poli Dalam";
        } else if (rdGigi.isSelected()) {
            pol += "Poli Gigi";
        } else if (rdJantung.isSelected()) {
            pol += "Poli Jantung";
        } else if (rdParu.isSelected()) {
            pol += "Poli Paru - paru";
        } else if (rdTht.isSelected()) {
            pol += "Poli THT";
        } else if (rdRadio.isSelected()) {
            pol += "Radiologi";
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih tujuan", "Warning!", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        tgl = tglAntri.getDateStringOrEmptyString();
        if (tgl == "") {
            JOptionPane.showMessageDialog(null, "Anda belum memilih tanggal", "Warning!", JOptionPane.PLAIN_MESSAGE);
            return;
        } else {
        }
        
        ambilNo();
    }
    
    Connection conn = Koneksi.connectDB();
    public void ambilNo(){
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT MAX(no_antri) FROM antrian WHERE spesialis=? AND tanggal like ?");
            stmt.setString(1, pol);
            stmt.setString(2, "%" + tgl + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == true) {
                noAntri = (rs.getInt("MAX(no_antri)")) + 1;
                input();
            }else{
                JOptionPane.showMessageDialog(null, "ERROR!!!", "ERROR!!!", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void input(){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO antrian(spesialis,tanggal,no_antri,nrm)"
                    + " VALUES(?,?,?,?)");
            stmt.setString(1, pol);
            stmt.setString(2, tgl);
            stmt.setInt(3, noAntri);
            stmt.setString(4, Utama.NRM);
            
            stmt.executeUpdate();
 
            usia();
            cetak();            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void usia() {
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT tanggal FROM data_pengguna WHERE nrm=?");
            stmt.setString(1, Utama.NRM);
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == true) {
                this.tahun = (rs.getString("tanggal"));                
            }else{
                JOptionPane.showMessageDialog(null, "ERROR!!!", "ERROR!!!", JOptionPane.PLAIN_MESSAGE);
                return;
            }            
        } catch (Exception e) {
        }
        LocalDate lahir = LocalDate.parse(tahun);
        LocalDate now = LocalDate.now();
        Period usia = Period.between(lahir, now);
        usiaa = String.valueOf(usia.getYears());
    }
    
    public void cetak(){
        String no = String.valueOf(noAntri);
        
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("NRM", Utama.NRM);
        parameters.put("NAMA", Utama.NAMA);
        parameters.put("USIA", usiaa);
        parameters.put("JENIS", Utama.JENIS);
        parameters.put("POLI", pol);
        parameters.put("NOMOR", no);
        parameters.put("TGL", tgl);
        try {
            JasperPrint jp = JasperFillManager.fillReport(getClass()
                    .getResourceAsStream("../../../../../cetak/cetakNomor.jasper"), 
                    parameters, conn);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        this.dispose();
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
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Antrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Antrian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmbil;
    private javax.swing.JButton btnBatal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rdAnak;
    private javax.swing.JRadioButton rdBidan;
    private javax.swing.JRadioButton rdDalam;
    private javax.swing.JRadioButton rdGigi;
    private javax.swing.JRadioButton rdJantung;
    private javax.swing.JRadioButton rdParu;
    private javax.swing.JRadioButton rdRadio;
    private javax.swing.JRadioButton rdTht;
    private com.github.lgooddatepicker.components.DatePicker tglAntri;
    // End of variables declaration//GEN-END:variables
}
