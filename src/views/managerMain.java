/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Yusra Frouz
 */
public class managerMain extends javax.swing.JFrame {

    /**
     * Creates new form managerMain
     */
    public managerMain() {
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

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        selectnetwork = new javax.swing.JComboBox<>();
        selectroute = new javax.swing.JComboBox<>();
        selectStartTime = new javax.swing.JComboBox<>();
        selectdate = new javax.swing.JComboBox<>();
        selectEndTime = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        selectnetwork1 = new javax.swing.JComboBox<>();
        selectroute1 = new javax.swing.JComboBox<>();
        selectdate1 = new javax.swing.JComboBox<>();
        selectStartTime1 = new javax.swing.JComboBox<>();
        selectEndTime1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(700, 20, 30, 30);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(740, 20, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 0, 440, 140);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel2.setLayout(null);

        selectnetwork.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectnetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Network --" }));
        jPanel2.add(selectnetwork);
        selectnetwork.setBounds(20, 20, 190, 30);

        selectroute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectroute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Route --" }));
        jPanel2.add(selectroute);
        selectroute.setBounds(20, 70, 190, 30);

        selectStartTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectStartTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Start Time --" }));
        jPanel2.add(selectStartTime);
        selectStartTime.setBounds(20, 170, 190, 30);

        selectdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Date --" }));
        jPanel2.add(selectdate);
        selectdate.setBounds(20, 120, 190, 30);

        selectEndTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectEndTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select End Time --" }));
        jPanel2.add(selectEndTime);
        selectEndTime.setBounds(20, 220, 190, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Submit");
        jPanel2.add(jButton2);
        jButton2.setBounds(70, 270, 80, 30);

        jLabel2.setText("City Bus                                          // details");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(270, 40, 480, 14);

        jLabel4.setText("// graph");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(440, 80, 320, 220);

        jPanel4.setLayout(null);

        jLabel3.setText("Total Fares:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 20, 70, 14);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(270, 80, 150, 220);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(240, 20, 540, 300);

        jTabbedPane1.addTab("Netwok Statics", jPanel2);

        jPanel3.setLayout(null);

        selectnetwork1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectnetwork1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Network --" }));
        jPanel3.add(selectnetwork1);
        selectnetwork1.setBounds(20, 20, 190, 30);

        selectroute1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectroute1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Route --" }));
        jPanel3.add(selectroute1);
        selectroute1.setBounds(20, 70, 190, 30);

        selectdate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectdate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Date --" }));
        jPanel3.add(selectdate1);
        selectdate1.setBounds(20, 120, 190, 30);

        selectStartTime1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectStartTime1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Start Time --" }));
        jPanel3.add(selectStartTime1);
        selectStartTime1.setBounds(20, 170, 190, 30);

        selectEndTime1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selectEndTime1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select End Time --" }));
        jPanel3.add(selectEndTime1);
        selectEndTime1.setBounds(20, 220, 190, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Submit");
        jPanel3.add(jButton3);
        jButton3.setBounds(70, 270, 80, 30);

        jLabel5.setText("City Bus                                          // details");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(270, 40, 480, 14);

        jPanel6.setLayout(null);

        jLabel9.setText("Total Fares:");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(20, 20, 70, 14);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(270, 80, 150, 220);

        jLabel10.setText("// graph");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel10)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7);
        jPanel7.setBounds(440, 80, 320, 220);

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        jLabel8.setText("jLabel1");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(240, 20, 540, 300);

        jTabbedPane1.addTab("Fares", jPanel3);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 120, 800, 380);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(managerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JComboBox<String> selectEndTime;
    private javax.swing.JComboBox<String> selectEndTime1;
    private javax.swing.JComboBox<String> selectStartTime;
    private javax.swing.JComboBox<String> selectStartTime1;
    private javax.swing.JComboBox<String> selectdate;
    private javax.swing.JComboBox<String> selectdate1;
    private javax.swing.JComboBox<String> selectnetwork;
    private javax.swing.JComboBox<String> selectnetwork1;
    private javax.swing.JComboBox<String> selectroute;
    private javax.swing.JComboBox<String> selectroute1;
    // End of variables declaration//GEN-END:variables
}
