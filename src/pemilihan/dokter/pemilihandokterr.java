/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihan.dokter;

/**
 *
 * @author ASUS
 */
public class pemilihandokterr extends javax.swing.JFrame {

    /**
     * Creates new form pemilihandokterr
     */
    public pemilihandokterr() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dokter = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        jekel = new javax.swing.JTextField();
        goldar = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        warganegara = new javax.swing.JTextField();
        praktek = new javax.swing.JTextField();
        spesial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("DOKTER SPESIALIS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 610, 140, 20);

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setText("PILIH DOKTER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 130, 30);

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 204));
        jLabel5.setText("NAMA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 210, 130, 20);

        jLabel6.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setText("ALAMAT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 260, 130, 20);

        jLabel7.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("USIA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 310, 130, 20);

        jLabel8.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 204));
        jLabel8.setText("JENIS KELAMIN");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 360, 130, 20);

        jLabel9.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 204));
        jLabel9.setText("GOLONGAN DARAH");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 410, 140, 20);

        jLabel10.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 204));
        jLabel10.setText("STATUS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 460, 130, 20);

        jLabel11.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 204));
        jLabel11.setText("KEWARGANEGARAAN");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 510, 160, 20);

        jLabel12.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 204));
        jLabel12.setText("WAKTU PRAKTEK");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 560, 130, 20);

        dokter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dokter.setForeground(new java.awt.Color(255, 0, 102));
        dokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "DR. MAGHRISYA AMALIA", "DR. MADE ELVINA", "DR. GILANG OKTAVERINO", "DR. MONICA BRILLIANE" }));
        dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterActionPerformed(evt);
            }
        });
        getContentPane().add(dokter);
        dokter.setBounds(170, 90, 370, 50);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("IDENTITAS"));
        jPanel1.setToolTipText("IDENTITAS");
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IDENTITAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 204, 204))); // NOI18N
        jPanel1.setLayout(null);

        nama.setEditable(false);
        nama.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(nama);
        nama.setBounds(180, 40, 460, 40);

        alamat.setEditable(false);
        alamat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        alamat.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(alamat);
        alamat.setBounds(180, 90, 460, 40);

        usia.setEditable(false);
        usia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        usia.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(usia);
        usia.setBounds(180, 140, 460, 40);

        jekel.setEditable(false);
        jekel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jekel.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(jekel);
        jekel.setBounds(180, 190, 460, 40);

        goldar.setEditable(false);
        goldar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        goldar.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(goldar);
        goldar.setBounds(180, 240, 460, 40);

        status.setEditable(false);
        status.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(status);
        status.setBounds(180, 290, 460, 40);

        warganegara.setEditable(false);
        warganegara.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        warganegara.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(warganegara);
        warganegara.setBounds(180, 340, 460, 40);

        praktek.setEditable(false);
        praktek.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        praktek.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(praktek);
        praktek.setBounds(180, 390, 460, 40);

        spesial.setEditable(false);
        spesial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        spesial.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(spesial);
        spesial.setBounds(180, 440, 460, 40);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 160, 650, 490);

        jLabel3.setFont(new java.awt.Font("Futura Bk BT", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("PEMILIHAN DOKTER");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(140, 0, 340, 80);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 670, 690);

        setBounds(0, 0, 679, 725);
    }// </editor-fold>//GEN-END:initComponents

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        // TODO add your handling code here:
        if(dokter.getSelectedItem().equals("DR. MAGHRISYA AMALIA")){
            nama.setText("DR. MAGHRISYA AMALIA WARDANA");
            alamat.setText("JL. DANAU RANAU I G2B9 MALANG");
            usia.setText("19 TAHUN");
            jekel.setText("PEREMPUAN");
            goldar.setText("AB");
            status.setText("Belum Menikah");
            warganegara.setText("INDONESIA");
            spesial.setText("DOKTER ANAK");
            praktek.setText("SENIN-JUM'AT");
        }
        else if(dokter.getSelectedItem().equals("DR. GILANG OKTAVERINO")){
            nama.setText("DR. GILANG OKTAVERINO AKBAR");
            alamat.setText("JL. ABDURRAHMAN SALEH NO. 11 MALANG");
            usia.setText("19 TAHUN");
            jekel.setText("LAKI-LAKI");
            goldar.setText("O");
            status.setText("Belum Menikah");
            warganegara.setText("INDONESIA");
            spesial.setText("DOKTER GIGI");
            praktek.setText("SENIN-JUM'AT");
        }
        else if(dokter.getSelectedItem().equals("DR. MONICA BRILLIANE")){
            nama.setText("DR. MONICA BRILLIANE PUTRI");
            alamat.setText("JL. DANAU POSO G2C4 MALANG");
            usia.setText("19 TAHUN");
            jekel.setText("PEREMPUAN");
            goldar.setText("A");
            status.setText("Belum Menikah");
            warganegara.setText("INDONESIA");
            spesial.setText("DOKTER BEDAH");
            praktek.setText("SENIN-JUM'AT");
        }
        else if(dokter.getSelectedItem().equals("DR. MADE ELVINA")){
            nama.setText("DR. NI MADE ELVINA ARYADHIKA");
            alamat.setText("JL. RAYA WENDIT 31 MALANG");
            usia.setText("19 TAHUN");
            jekel.setText("PEREMPUAN");
            goldar.setText("O");
            status.setText("Belum Menikah");
            warganegara.setText("INDONESIA");
            spesial.setText("DOKTER JANTUNG");
            praktek.setText("SENIN-JUM'AT");
        }
    }//GEN-LAST:event_dokterActionPerformed

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
            java.util.logging.Logger.getLogger(pemilihandokterr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemilihandokterr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemilihandokterr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemilihandokterr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pemilihandokterr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> dokter;
    private javax.swing.JTextField goldar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jekel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField praktek;
    private javax.swing.JTextField spesial;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField warganegara;
    // End of variables declaration//GEN-END:variables
}
