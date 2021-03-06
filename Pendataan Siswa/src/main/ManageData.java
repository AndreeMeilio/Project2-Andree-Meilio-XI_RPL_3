/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import plugin.DatabaseConnection;

/**
 *
 * @author andreemeilio
 */
public class ManageData extends javax.swing.JDialog {

    /**
     * Creates new form ManageData
     */
    Connection koneksi;
    String action;
    
    public ManageData(java.awt.Frame parent, boolean modal, String act, String nis) {
        super(parent, modal);
        initComponents();
        koneksi = DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_sekolah");
        
        action = act;
        if (action.equals("Edit")){
            txtNis.setEnabled(false);
            showData(nis);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelNis = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelKelas = new javax.swing.JLabel();
        labelJurusan = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNis = new javax.swing.JTextField();
        cmbKelas = new javax.swing.JComboBox<>();
        cmbJurusan = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setText("Tambah Data");
        lblTitle.setToolTipText("");

        labelNis.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        labelNis.setText("NIS");

        labelNama.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        labelNama.setText("Nama Lengkap");

        labelKelas.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        labelKelas.setText("Kelas");

        labelJurusan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        labelJurusan.setText("Jurusan");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNisActionPerformed(evt);
            }
        });

        cmbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI TKJ 1", "XI TKJ 2", "XI TKJ 3", "XI MM", "XI TITL 1", "XI TITL 2", "XI TITL 3", "XI AV 1", "XI AV 2", "XI AV 3", "XI AV 4", "XI TOI 1", "XI TOI 2", "XI TOI 3" }));
        cmbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKelasActionPerformed(evt);
            }
        });

        cmbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak", "Teknik Komputer dan Jaringan", "Multimedia", "Teknik Instalasi Tenaga Listrik", "Audio Video", "Teknik Otomasi Industri" }));
        cmbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJurusanActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSimpan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNama)
                                    .addComponent(labelKelas)
                                    .addComponent(labelJurusan)
                                    .addComponent(labelNis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama)
                                    .addComponent(txtNis, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbJurusan, 0, 238, Short.MAX_VALUE))))
                        .addGap(24, 24, 24)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNis)
                    .addComponent(txtNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKelas)
                    .addComponent(cmbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJurusan)
                    .addComponent(cmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnSimpan)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNisActionPerformed

    private void cmbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKelasActionPerformed

    private void cmbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJurusanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (action.equals("Edit")) editData();
        else simpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }
    
    public void simpanData(){
        String nis = txtNis.getText();
        String nama = txtNama.getText();
        String kelas = cmbKelas.getSelectedItem().toString();
        String jurusan = cmbJurusan.getSelectedItem().toString();
        
        try {
            Statement stmt = koneksi.createStatement();
            String query = "INSERT INTO t_siswa(nis, nama, kelas, jurusan) " 
                    + "VALUES('"+nis+"', '"+nama+"', '"+kelas+"', '"+jurusan+"')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan");
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Database");
        }
    }

    void showData(String nis){
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM t_siswa WHERE nis = " + nis + ";";
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            
            txtNis.setText(rs.getString("nis"));
            txtNama.setText(rs.getString("nama"));
            cmbKelas.setSelectedItem(rs.getString("kelas"));
            cmbJurusan.setSelectedItem(rs.getString("jurusan"));
        } catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan di Query");
        }
    }
    
    public void editData(){
        String nis = txtNis.getText();
        String nama = txtNama.getText();
        String kelas = cmbKelas.getSelectedItem().toString();
        String jurusan = cmbJurusan.getSelectedItem().toString();
        
        try{
            Statement stmt = koneksi.createStatement();
            String query = "UPDATE t_siswa SET nama = '" + nama +"',"
                            + "kelas = '" + kelas +"',"
                            + "jurusan = '" + jurusan + "' WHERE nis = '" + nis +"';";
            
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Query");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbJurusan;
    private javax.swing.JComboBox<String> cmbKelas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelJurusan;
    private javax.swing.JLabel labelKelas;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNis;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNis;
    // End of variables declaration//GEN-END:variables
}
