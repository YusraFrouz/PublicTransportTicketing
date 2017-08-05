/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.tokenList;
import controllers.tokenReader;
import models.token;

/**
 *
 * @author Nadya Sirimanna
 */
public class PayStationUI extends javax.swing.JFrame {

    /**
     * Creates new form ScanTicket
     */
    public PayStationUI() {
        initComponents();
        readToken.setVisible(true);
        readBalance.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        readToken = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ps_tokenID = new javax.swing.JTextField();
        ps_btnScanToken = new javax.swing.JButton();
        readBalance = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ps_currentBalance = new javax.swing.JTextField();
        ps_btnPayWithCash = new javax.swing.JButton();
        ps_btnPayWithCard = new javax.swing.JButton();
        ps_btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Transit Authority");

        jLabel2.setText("Scan Your Token Here");

        ps_btnScanToken.setText("Proceed");
        ps_btnScanToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnScanTokenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout readTokenLayout = new javax.swing.GroupLayout(readToken);
        readToken.setLayout(readTokenLayout);
        readTokenLayout.setHorizontalGroup(
            readTokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readTokenLayout.createSequentialGroup()
                .addGroup(readTokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(readTokenLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel2))
                    .addGroup(readTokenLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(ps_tokenID, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(readTokenLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(ps_btnScanToken)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        readTokenLayout.setVerticalGroup(
            readTokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readTokenLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(ps_tokenID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(ps_btnScanToken)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        readBalance.setPreferredSize(new java.awt.Dimension(527, 358));

        jLabel3.setText("Current Balance");

        ps_btnPayWithCash.setText("Pay With Cash");
        ps_btnPayWithCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnPayWithCashActionPerformed(evt);
            }
        });

        ps_btnPayWithCard.setText("Pay With Card");
        ps_btnPayWithCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnPayWithCardActionPerformed(evt);
            }
        });

        ps_btnExit.setText("Exit");
        ps_btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout readBalanceLayout = new javax.swing.GroupLayout(readBalance);
        readBalance.setLayout(readBalanceLayout);
        readBalanceLayout.setHorizontalGroup(
            readBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readBalanceLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(ps_btnPayWithCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(ps_btnPayWithCard)
                .addGap(74, 74, 74)
                .addComponent(ps_btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readBalanceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(readBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readBalanceLayout.createSequentialGroup()
                        .addComponent(ps_currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readBalanceLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(224, 224, 224))))
        );
        readBalanceLayout.setVerticalGroup(
            readBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readBalanceLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(ps_currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(readBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ps_btnPayWithCard)
                    .addComponent(ps_btnPayWithCash)
                    .addComponent(ps_btnExit))
                .addGap(117, 117, 117))
        );

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(readToken, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(readBalance, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(readToken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(221, 221, 221))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(readBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 52, Short.MAX_VALUE)
                    .addComponent(readBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ps_btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnExitActionPerformed
        readToken.setVisible(true);
        readBalance.setVisible(false);
    }//GEN-LAST:event_ps_btnExitActionPerformed

    private void ps_btnScanTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnScanTokenActionPerformed
        
        String tokenID = ps_tokenID.getText();
        tokenList tokens = new tokenList();
        tokenReader tknRead = new tokenReader();
        token token1 = new token();
        String infomsg;
        String Titlebar;
        if ( tokens.findTokenByID(tokenID) ){
            infomsg = "Valid token ID";
            Titlebar = "Success";
            tknRead.displayConfirmationMessage(infomsg, Titlebar);
            String accBalance = Double.toString(token1.getBalannce());
            ps_currentBalance.setText(accBalance);
            
            readToken.setVisible(false);
            readBalance.setVisible(true);
        }
        else {
            infomsg = "Invalid token ID";
            Titlebar = "Unsuccessful";
            tknRead.displayConfirmationMessage(infomsg, Titlebar);
        }
    }//GEN-LAST:event_ps_btnScanTokenActionPerformed

    private void ps_btnPayWithCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnPayWithCashActionPerformed
        // TODO add your handling code here:
        CashPaymentUI cashpayment = new CashPaymentUI();
        cashpayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ps_btnPayWithCashActionPerformed

    private void ps_btnPayWithCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnPayWithCardActionPerformed
        // TODO add your handling code here:
        CardPaymentUI cardpayment = new CardPaymentUI();
        cardpayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ps_btnPayWithCardActionPerformed

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
            java.util.logging.Logger.getLogger(PayStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayStationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayStationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton ps_btnExit;
    private javax.swing.JButton ps_btnPayWithCard;
    private javax.swing.JButton ps_btnPayWithCash;
    private javax.swing.JButton ps_btnScanToken;
    private javax.swing.JTextField ps_currentBalance;
    private javax.swing.JTextField ps_tokenID;
    private javax.swing.JPanel readBalance;
    private javax.swing.JPanel readToken;
    // End of variables declaration//GEN-END:variables
}
