/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.AccountList;
import controllers.tokenList;
import controllers.tokenReader;
import java.util.ArrayList;
import models.Account;
import models.token;

/**
 *
 * @author Nadya Sirimanna
 */
public class PayStationUI extends javax.swing.JFrame {

    /**
     * Creates new form ScanTicket
     */
    private static String user_tokenID;
    public PayStationUI() {
        initComponents();
        main.setVisible(true);
        NewAccount.setVisible(false);
        readToken.setVisible(false);
        readBalance.setVisible(false);
        
    }

    public String getUser_tokenID() {
        return user_tokenID;
    }

    public void setUser_tokenID(String user_tokenID) {
        this.user_tokenID = user_tokenID;
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
        jLabel9 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        readBalance = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ps_currentBalance = new javax.swing.JTextField();
        ps_btnPayWithCash = new javax.swing.JButton();
        ps_btnPayWithCard = new javax.swing.JButton();
        ps_btnExitAccount = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        ps_btnMainNewUser = new javax.swing.JButton();
        ps_mainAddPayment = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        NewAccount = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ps_na_UserID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ps_na_username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ps_na_TokenID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ps_na_amount = new javax.swing.JTextField();
        ps_na_btnproceed = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jLabel1.setText("Transit Authority");

        readToken.setPreferredSize(new java.awt.Dimension(527, 406));
        readToken.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Scan Your Token Here");
        readToken.add(jLabel2);
        jLabel2.setBounds(330, 200, 190, 30);

        ps_tokenID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        readToken.add(ps_tokenID);
        ps_tokenID.setBounds(290, 260, 270, 40);

        ps_btnScanToken.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_btnScanToken.setText("Proceed");
        ps_btnScanToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnScanTokenActionPerformed(evt);
            }
        });
        readToken.add(ps_btnScanToken);
        ps_btnScanToken.setBounds(360, 330, 140, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        readToken.add(jLabel9);
        jLabel9.setBounds(200, 10, 440, 140);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        readToken.add(jToggleButton1);
        jToggleButton1.setBounds(700, 20, 30, 30);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        readToken.add(jToggleButton2);
        jToggleButton2.setBounds(740, 20, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        readToken.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 500);

        readBalance.setPreferredSize(new java.awt.Dimension(527, 358));
        readBalance.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Current Balance");
        readBalance.add(jLabel3);
        jLabel3.setBounds(350, 170, 190, 40);

        ps_currentBalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        readBalance.add(ps_currentBalance);
        ps_currentBalance.setBounds(330, 220, 170, 30);

        ps_btnPayWithCash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_btnPayWithCash.setText("Pay With Cash");
        ps_btnPayWithCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnPayWithCashActionPerformed(evt);
            }
        });
        readBalance.add(ps_btnPayWithCash);
        ps_btnPayWithCash.setBounds(180, 290, 150, 50);

        ps_btnPayWithCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_btnPayWithCard.setText("Pay With Card");
        ps_btnPayWithCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnPayWithCardActionPerformed(evt);
            }
        });
        readBalance.add(ps_btnPayWithCard);
        ps_btnPayWithCard.setBounds(340, 290, 150, 50);

        ps_btnExitAccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_btnExitAccount.setText("Exit Account");
        ps_btnExitAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnExitAccountActionPerformed(evt);
            }
        });
        readBalance.add(ps_btnExitAccount);
        ps_btnExitAccount.setBounds(500, 290, 150, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        readBalance.add(jLabel12);
        jLabel12.setBounds(200, 10, 440, 140);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        readBalance.add(jToggleButton3);
        jToggleButton3.setBounds(700, 20, 30, 30);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        readBalance.add(jToggleButton4);
        jToggleButton4.setBounds(740, 20, 30, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        readBalance.add(jLabel11);
        jLabel11.setBounds(0, 0, 800, 500);

        main.setMinimumSize(new java.awt.Dimension(527, 406));
        main.setLayout(null);

        ps_btnMainNewUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_btnMainNewUser.setText("Register as a New User");
        ps_btnMainNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_btnMainNewUserActionPerformed(evt);
            }
        });
        main.add(ps_btnMainNewUser);
        ps_btnMainNewUser.setBounds(290, 200, 230, 70);

        ps_mainAddPayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_mainAddPayment.setText("Top Up Account");
        ps_mainAddPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_mainAddPaymentActionPerformed(evt);
            }
        });
        main.add(ps_mainAddPayment);
        ps_mainAddPayment.setBounds(310, 300, 200, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        main.add(jLabel14);
        jLabel14.setBounds(200, 10, 440, 140);

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        main.add(jToggleButton5);
        jToggleButton5.setBounds(700, 20, 30, 30);

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        main.add(jToggleButton6);
        jToggleButton6.setBounds(740, 20, 30, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        main.add(jLabel13);
        jLabel13.setBounds(0, 0, 800, 500);

        NewAccount.setMinimumSize(new java.awt.Dimension(527, 406));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("User ID         :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 170, 130, 22);

        ps_na_UserID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_na_UserID.setText("User ID");
        jPanel1.add(ps_na_UserID);
        ps_na_UserID.setBounds(440, 170, 60, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("User Name     :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 210, 140, 22);

        ps_na_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_na_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_na_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(ps_na_username);
        ps_na_username.setBounds(440, 210, 130, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Token ID       :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 290, 140, 22);

        ps_na_TokenID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_na_TokenID.setText("Token ID");
        jPanel1.add(ps_na_TokenID);
        ps_na_TokenID.setBounds(440, 290, 74, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Amount         :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 330, 130, 22);

        ps_na_amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(ps_na_amount);
        ps_na_amount.setBounds(440, 320, 130, 28);

        ps_na_btnproceed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ps_na_btnproceed.setText("Proceed");
        ps_na_btnproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_na_btnproceedActionPerformed(evt);
            }
        });
        jPanel1.add(ps_na_btnproceed);
        ps_na_btnproceed.setBounds(370, 380, 95, 31);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(200, 10, 440, 140);

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton7);
        jToggleButton7.setBounds(700, 20, 30, 30);

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton8);
        jToggleButton8.setBounds(740, 20, 30, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password       :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 250, 140, 22);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 250, 130, 28);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout NewAccountLayout = new javax.swing.GroupLayout(NewAccount);
        NewAccount.setLayout(NewAccountLayout);
        NewAccountLayout.setHorizontalGroup(
            NewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        NewAccountLayout.setVerticalGroup(
            NewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewAccountLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(readToken, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(readBalance, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(main, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NewAccount, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(readToken, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(221, 221, 221))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(readBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(213, 213, 213)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(213, 213, 213)
                    .addComponent(NewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 144, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 52, Short.MAX_VALUE)
                    .addComponent(readBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(153, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(NewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(153, Short.MAX_VALUE)))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ps_btnExitAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnExitAccountActionPerformed
        login loginUI = new login();
        loginUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ps_btnExitAccountActionPerformed

    private void ps_btnScanTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnScanTokenActionPerformed
        
        String tokenID = ps_tokenID.getText();
        tokenList tokens = new tokenList();
        //tokenList tokenlist = new tokenList();
        tokenReader tknRead = new tokenReader();
        ArrayList<token> token = new ArrayList<token>();
        token token1 = new token();
        String infomsg;
        String Titlebar;
        
        if ( tokens.findTokenByID(tokenID) ){
            user_tokenID = tokenID;
            infomsg = "Valid token ID";
            Titlebar = "Success";
            tknRead.displayConfirmationMessage(infomsg, Titlebar);
            String accBalance = Double.toString(tokens.getBalannce(tokenID));
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
        CashPaymentUI cashpayment = new CashPaymentUI(user_tokenID);
        cashpayment.setUser_tokenID(user_tokenID);
        cashpayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ps_btnPayWithCashActionPerformed

    private void ps_btnPayWithCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnPayWithCardActionPerformed
        // TODO add your handling code here:
        CardPaymentUI cardpayment = new CardPaymentUI(user_tokenID);
        cardpayment.setUser_tokenID(user_tokenID);
        cardpayment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ps_btnPayWithCardActionPerformed

    private void ps_btnMainNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_btnMainNewUserActionPerformed
        // TODO add your handling code here:
        
        main.setVisible(false);
        NewAccount.setVisible(true);
        readToken.setVisible(false);
        readBalance.setVisible(false);
        
    }//GEN-LAST:event_ps_btnMainNewUserActionPerformed

    private void ps_mainAddPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_mainAddPaymentActionPerformed
        // TODO add your handling code here:
        main.setVisible(false);
        NewAccount.setVisible(false);
        readToken.setVisible(true);
        readBalance.setVisible(false);
    }//GEN-LAST:event_ps_mainAddPaymentActionPerformed

    private void ps_na_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_na_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps_na_usernameActionPerformed

    private void ps_na_btnproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_na_btnproceedActionPerformed
        // TODO add your handling code here:
        token token1 = new token();
        int usercount = Account.getAccountCount() + 1;
        ps_na_UserID.setText(Integer.toString(usercount));
        String userName = ps_na_username.getText();
        int tokencount = token1.getCount();
        ps_na_TokenID.setText(Integer.toString(tokencount));
        Double amount = Double.parseDouble(ps_na_amount.getText());
        
        Account account = new Account(token1,userName,amount);
        
        AccountList accountlist = new AccountList();
        tokenList tokenlist = new tokenList();
        tokenlist.add(token1);
        accountlist.addAccount(account);
    }//GEN-LAST:event_ps_na_btnproceedActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jToggleButton8ActionPerformed

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
    private javax.swing.JPanel NewAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JPanel main;
    private javax.swing.JButton ps_btnExitAccount;
    private javax.swing.JButton ps_btnMainNewUser;
    private javax.swing.JButton ps_btnPayWithCard;
    private javax.swing.JButton ps_btnPayWithCash;
    private javax.swing.JButton ps_btnScanToken;
    private javax.swing.JTextField ps_currentBalance;
    private javax.swing.JButton ps_mainAddPayment;
    private javax.swing.JLabel ps_na_TokenID;
    private javax.swing.JLabel ps_na_UserID;
    private javax.swing.JTextField ps_na_amount;
    private javax.swing.JButton ps_na_btnproceed;
    private javax.swing.JTextField ps_na_username;
    private javax.swing.JTextField ps_tokenID;
    private javax.swing.JPanel readBalance;
    private javax.swing.JPanel readToken;
    // End of variables declaration//GEN-END:variables
}
