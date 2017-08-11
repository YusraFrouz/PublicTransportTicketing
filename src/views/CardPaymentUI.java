/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadya Sirimanna
 */
public class CardPaymentUI extends javax.swing.JFrame {

    /**
     * Creates new form CardPaymentUI
     */
    
    public static float amount = 0;
    private static String user_tokenID;
    public CardPaymentUI(String tokenID) {
        initComponents();
        this.user_tokenID = tokenID;
        EnterAmount.setVisible(true);
        InsertCard.setVisible(false);
        EnterPIN.setVisible(false);
    }

    public static String getUser_tokenID() {
        return user_tokenID;
    }

    public static void setUser_tokenID(String user_tokenID) {
        CardPaymentUI.user_tokenID = user_tokenID;
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
        EnterAmount = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cardp_amount = new javax.swing.JTextField();
        cardp_4 = new javax.swing.JButton();
        cardp_7 = new javax.swing.JButton();
        cardp_dot = new javax.swing.JButton();
        cardp_10 = new javax.swing.JButton();
        cardp_del = new javax.swing.JButton();
        cardp_9 = new javax.swing.JButton();
        cardp_8 = new javax.swing.JButton();
        cardp_5 = new javax.swing.JButton();
        cardp_2 = new javax.swing.JButton();
        cardp_3 = new javax.swing.JButton();
        cardp_6 = new javax.swing.JButton();
        cardp_btnEnterAmountBack = new javax.swing.JButton();
        cardp_btnProceed = new javax.swing.JButton();
        cardp_1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        InsertCard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cardp_btnInsertCardProceed = new javax.swing.JButton();
        cashp_btnInsertCardCancel = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cardp_btnEnterAmountBack1 = new javax.swing.JButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        EnterPIN = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cardp_btnEnterPINProceed = new javax.swing.JButton();
        cardp_btnEnterPINCancel = new javax.swing.JButton();
        cardp_p1 = new javax.swing.JButton();
        cardp_p2 = new javax.swing.JButton();
        cardp_p3 = new javax.swing.JButton();
        cardp_p0 = new javax.swing.JButton();
        cardp_p8 = new javax.swing.JButton();
        cardp_p5 = new javax.swing.JButton();
        cardp_p4 = new javax.swing.JButton();
        cardp_p7 = new javax.swing.JButton();
        cardp_p9 = new javax.swing.JButton();
        cardp_p6 = new javax.swing.JButton();
        cardp_pdel = new javax.swing.JButton();
        cardp_pin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cardp_btnEnterAmountBack2 = new javax.swing.JButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EnterAmount.setMaximumSize(new java.awt.Dimension(800, 500));
        EnterAmount.setMinimumSize(new java.awt.Dimension(800, 500));
        EnterAmount.setPreferredSize(new java.awt.Dimension(800, 500));
        EnterAmount.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CARD PAYMENT");
        EnterAmount.add(jLabel2);
        jLabel2.setBounds(350, 160, 180, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter Amount :");
        EnterAmount.add(jLabel3);
        jLabel3.setBounds(290, 197, 120, 30);
        EnterAmount.add(cardp_amount);
        cardp_amount.setBounds(410, 200, 159, 30);

        cardp_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_4.setText("4");
        cardp_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_4ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_4);
        cardp_4.setBounds(330, 290, 49, 44);

        cardp_7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_7.setText("7");
        cardp_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_7ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_7);
        cardp_7.setBounds(330, 340, 49, 44);

        cardp_dot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_dot.setText(".");
        cardp_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_dotActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_dot);
        cardp_dot.setBounds(330, 400, 49, 44);

        cardp_10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_10.setText("0");
        cardp_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_10ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_10);
        cardp_10.setBounds(400, 400, 49, 44);

        cardp_del.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_del.setText("del");
        cardp_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_delActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_del);
        cardp_del.setBounds(470, 400, 49, 44);

        cardp_9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_9.setText("9");
        cardp_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_9ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_9);
        cardp_9.setBounds(470, 340, 49, 44);

        cardp_8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_8.setText("8");
        cardp_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_8ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_8);
        cardp_8.setBounds(400, 340, 49, 44);

        cardp_5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_5.setText("5");
        cardp_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_5ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_5);
        cardp_5.setBounds(400, 290, 49, 44);

        cardp_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_2.setText("2");
        cardp_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_2ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_2);
        cardp_2.setBounds(400, 240, 49, 44);

        cardp_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_3.setText("3");
        cardp_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_3ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_3);
        cardp_3.setBounds(470, 240, 49, 44);

        cardp_6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_6.setText("6");
        cardp_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_6ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_6);
        cardp_6.setBounds(470, 290, 49, 44);

        cardp_btnEnterAmountBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        cardp_btnEnterAmountBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_btnEnterAmountBackActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_btnEnterAmountBack);
        cardp_btnEnterAmountBack.setBounds(690, 20, 30, 30);

        cardp_btnProceed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_btnProceed.setText("Proceed");
        cardp_btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_btnProceedActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_btnProceed);
        cardp_btnProceed.setBounds(380, 460, 100, 30);

        cardp_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_1.setText("1");
        cardp_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_1ActionPerformed(evt);
            }
        });
        EnterAmount.add(cardp_1);
        cardp_1.setBounds(330, 240, 49, 44);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        EnterAmount.add(jLabel11);
        jLabel11.setBounds(200, 10, 440, 140);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        EnterAmount.add(jToggleButton2);
        jToggleButton2.setBounds(740, 20, 30, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        EnterAmount.add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 520);

        InsertCard.setMinimumSize(new java.awt.Dimension(800, 500));
        InsertCard.setPreferredSize(new java.awt.Dimension(800, 500));
        InsertCard.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CARD PAYMENT");
        InsertCard.add(jLabel5);
        jLabel5.setBounds(340, 190, 130, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("PLEASE INSERT CARD");
        InsertCard.add(jLabel6);
        jLabel6.setBounds(310, 240, 180, 40);

        cardp_btnInsertCardProceed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardp_btnInsertCardProceed.setText("Proceed");
        cardp_btnInsertCardProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_btnInsertCardProceedActionPerformed(evt);
            }
        });
        InsertCard.add(cardp_btnInsertCardProceed);
        cardp_btnInsertCardProceed.setBounds(280, 300, 130, 50);

        cashp_btnInsertCardCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cashp_btnInsertCardCancel.setText("Cancel");
        cashp_btnInsertCardCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashp_btnInsertCardCancelActionPerformed(evt);
            }
        });
        InsertCard.add(cashp_btnInsertCardCancel);
        cashp_btnInsertCardCancel.setBounds(430, 300, 130, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        InsertCard.add(jLabel13);
        jLabel13.setBounds(200, 10, 440, 140);

        cardp_btnEnterAmountBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        cardp_btnEnterAmountBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_btnEnterAmountBack1ActionPerformed(evt);
            }
        });
        InsertCard.add(cardp_btnEnterAmountBack1);
        cardp_btnEnterAmountBack1.setBounds(700, 20, 30, 30);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        InsertCard.add(jToggleButton3);
        jToggleButton3.setBounds(740, 20, 30, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        InsertCard.add(jLabel12);
        jLabel12.setBounds(0, 0, 800, 520);

        EnterPIN.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CARD PAYMENT");
        EnterPIN.add(jLabel8);
        jLabel8.setBounds(350, 170, 140, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Enter PIN   :");
        EnterPIN.add(jLabel9);
        jLabel9.setBounds(310, 210, 90, 17);

        cardp_btnEnterPINProceed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_btnEnterPINProceed.setText("Proceed");
        cardp_btnEnterPINProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_btnEnterPINProceedActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_btnEnterPINProceed);
        cardp_btnEnterPINProceed.setBounds(330, 460, 83, 30);

        cardp_btnEnterPINCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_btnEnterPINCancel.setText("Cancel");
        cardp_btnEnterPINCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_btnEnterPINCancelActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_btnEnterPINCancel);
        cardp_btnEnterPINCancel.setBounds(420, 460, 80, 30);

        cardp_p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p1.setText("1");
        cardp_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p1ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p1);
        cardp_p1.setBounds(330, 250, 49, 44);

        cardp_p2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p2.setText("2");
        cardp_p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p2ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p2);
        cardp_p2.setBounds(390, 250, 49, 44);

        cardp_p3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p3.setText("3");
        cardp_p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p3ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p3);
        cardp_p3.setBounds(450, 250, 49, 44);

        cardp_p0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p0.setText("0");
        cardp_p0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p0ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p0);
        cardp_p0.setBounds(390, 400, 49, 44);

        cardp_p8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p8.setText("8");
        cardp_p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p8ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p8);
        cardp_p8.setBounds(390, 350, 49, 44);

        cardp_p5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p5.setText("5");
        cardp_p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p5ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p5);
        cardp_p5.setBounds(390, 300, 49, 44);

        cardp_p4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p4.setText("4");
        cardp_p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p4ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p4);
        cardp_p4.setBounds(330, 300, 49, 44);

        cardp_p7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p7.setText("7");
        cardp_p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p7ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p7);
        cardp_p7.setBounds(330, 350, 49, 44);

        cardp_p9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p9.setText("9");
        cardp_p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p9ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p9);
        cardp_p9.setBounds(450, 350, 49, 44);

        cardp_p6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_p6.setText("6");
        cardp_p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_p6ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_p6);
        cardp_p6.setBounds(450, 300, 49, 44);

        cardp_pdel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardp_pdel.setText("del");
        cardp_pdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_pdelActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_pdel);
        cardp_pdel.setBounds(450, 400, 49, 44);

        cardp_pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EnterPIN.add(cardp_pin);
        cardp_pin.setBounds(410, 203, 159, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/Logo_1.png"))); // NOI18N
        EnterPIN.add(jLabel15);
        jLabel15.setBounds(200, 0, 440, 140);

        cardp_btnEnterAmountBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/back.png"))); // NOI18N
        cardp_btnEnterAmountBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardp_btnEnterAmountBack2ActionPerformed(evt);
            }
        });
        EnterPIN.add(cardp_btnEnterAmountBack2);
        cardp_btnEnterAmountBack2.setBounds(690, 20, 30, 30);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/close.png"))); // NOI18N
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        EnterPIN.add(jToggleButton4);
        jToggleButton4.setBounds(740, 20, 30, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/extra/background.png"))); // NOI18N
        EnterPIN.add(jLabel14);
        jLabel14.setBounds(0, 0, 800, 520);

        jLayeredPane1.setLayer(EnterAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(InsertCard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EnterPIN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(EnterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InsertCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EnterPIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EnterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InsertCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(EnterPIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cardp_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_5ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "5");
    }//GEN-LAST:event_cardp_5ActionPerformed

    private void cardp_p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p5ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "5");
    }//GEN-LAST:event_cardp_p5ActionPerformed

    private void cardp_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_4ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "4");
    }//GEN-LAST:event_cardp_4ActionPerformed

    private void cardp_btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_btnProceedActionPerformed
        
        if("".equals(cardp_amount.getText())){
            JOptionPane.showMessageDialog(null,"Please enter an amout to proceed.","Warning",JOptionPane.WARNING_MESSAGE);
   
        } 
            else{
            amount = Float.parseFloat(cardp_amount.getText());
            InsertCard.setVisible(true);
            EnterAmount.setVisible(false);
            EnterPIN.setVisible(false);
            }
        
        
    }//GEN-LAST:event_cardp_btnProceedActionPerformed

    private void cardp_btnEnterAmountBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_btnEnterAmountBackActionPerformed
        
        PayStationUI paystation = new PayStationUI();
        paystation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cardp_btnEnterAmountBackActionPerformed

    private void cardp_btnInsertCardProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_btnInsertCardProceedActionPerformed
        EnterPIN.setVisible(true);
        InsertCard.setVisible(false);
        EnterAmount.setVisible(false);
    }//GEN-LAST:event_cardp_btnInsertCardProceedActionPerformed

    private void cashp_btnInsertCardCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashp_btnInsertCardCancelActionPerformed
        // TODO add your handling code here:
        EnterPIN.setVisible(false);
        InsertCard.setVisible(false);
        EnterAmount.setVisible(true);
    }//GEN-LAST:event_cashp_btnInsertCardCancelActionPerformed

    private void cardp_btnEnterPINProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_btnEnterPINProceedActionPerformed
        
        
        
    }//GEN-LAST:event_cardp_btnEnterPINProceedActionPerformed

    private void cardp_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_1ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "1");
    }//GEN-LAST:event_cardp_1ActionPerformed

    private void cardp_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_2ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "2");
    }//GEN-LAST:event_cardp_2ActionPerformed

    private void cardp_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_3ActionPerformed
       cardp_amount.setText(cardp_amount.getText() + "3");
    }//GEN-LAST:event_cardp_3ActionPerformed

    private void cardp_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_6ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "6");
    }//GEN-LAST:event_cardp_6ActionPerformed

    private void cardp_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_7ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "7");
    }//GEN-LAST:event_cardp_7ActionPerformed

    private void cardp_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_8ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "8");
    }//GEN-LAST:event_cardp_8ActionPerformed

    private void cardp_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_9ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "9");
    }//GEN-LAST:event_cardp_9ActionPerformed

    private void cardp_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_dotActionPerformed
        cardp_amount.setText(cardp_amount.getText() + ".");
    }//GEN-LAST:event_cardp_dotActionPerformed

    private void cardp_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_10ActionPerformed
        cardp_amount.setText(cardp_amount.getText() + "0");
    }//GEN-LAST:event_cardp_10ActionPerformed

    private void cardp_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_delActionPerformed
        
        int length = cardp_amount.getText().length();
        int amount = cardp_amount.getText().length() - 1;
        String store;
        if(length > 0){
            StringBuilder back = new StringBuilder(cardp_amount.getText());
            back.deleteCharAt(amount);
            store = back.toString();
            cardp_amount.setText(store);
            
        }
    }//GEN-LAST:event_cardp_delActionPerformed

    private void cardp_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p1ActionPerformed
        //i added
         cardp_pin.setText(cardp_pin.getText() + "1");
    }//GEN-LAST:event_cardp_p1ActionPerformed

    private void cardp_p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p2ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "2");
    }//GEN-LAST:event_cardp_p2ActionPerformed

    private void cardp_p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p3ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "3");
    }//GEN-LAST:event_cardp_p3ActionPerformed

    private void cardp_p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p4ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "4");
    }//GEN-LAST:event_cardp_p4ActionPerformed

    private void cardp_p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p6ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "6");
    }//GEN-LAST:event_cardp_p6ActionPerformed

    private void cardp_p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p7ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "7");
    }//GEN-LAST:event_cardp_p7ActionPerformed

    private void cardp_p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p8ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "8");
    }//GEN-LAST:event_cardp_p8ActionPerformed

    private void cardp_p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p9ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "9");
    }//GEN-LAST:event_cardp_p9ActionPerformed

    private void cardp_p0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_p0ActionPerformed
        cardp_pin.setText(cardp_pin.getText() + "0");
    }//GEN-LAST:event_cardp_p0ActionPerformed

    private void cardp_pdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_pdelActionPerformed
       
        int length = cardp_pin.getText().length();
        int amountx = cardp_pin.getText().length() - 1;
        String store;
        if(length > 0){
            StringBuilder back = new StringBuilder(cardp_pin.getText());
            back.deleteCharAt(amountx);
            store = back.toString();
            cardp_pin.setText(store);
            
        }
        
        
        
    }//GEN-LAST:event_cardp_pdelActionPerformed

    private void cardp_btnEnterPINCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_btnEnterPINCancelActionPerformed
        // TODO add your handling code here:
        PayStationUI paystation = new PayStationUI();
        paystation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cardp_btnEnterPINCancelActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void cardp_btnEnterAmountBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_btnEnterAmountBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardp_btnEnterAmountBack1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void cardp_btnEnterAmountBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardp_btnEnterAmountBack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardp_btnEnterAmountBack2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CardPaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardPaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardPaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardPaymentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardPaymentUI(user_tokenID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EnterAmount;
    private javax.swing.JPanel EnterPIN;
    private javax.swing.JPanel InsertCard;
    private javax.swing.JButton cardp_1;
    private javax.swing.JButton cardp_10;
    private javax.swing.JButton cardp_2;
    private javax.swing.JButton cardp_3;
    private javax.swing.JButton cardp_4;
    private javax.swing.JButton cardp_5;
    private javax.swing.JButton cardp_6;
    private javax.swing.JButton cardp_7;
    private javax.swing.JButton cardp_8;
    private javax.swing.JButton cardp_9;
    private javax.swing.JTextField cardp_amount;
    private javax.swing.JButton cardp_btnEnterAmountBack;
    private javax.swing.JButton cardp_btnEnterAmountBack1;
    private javax.swing.JButton cardp_btnEnterAmountBack2;
    private javax.swing.JButton cardp_btnEnterPINCancel;
    private javax.swing.JButton cardp_btnEnterPINProceed;
    private javax.swing.JButton cardp_btnInsertCardProceed;
    private javax.swing.JButton cardp_btnProceed;
    private javax.swing.JButton cardp_del;
    private javax.swing.JButton cardp_dot;
    private javax.swing.JButton cardp_p0;
    private javax.swing.JButton cardp_p1;
    private javax.swing.JButton cardp_p2;
    private javax.swing.JButton cardp_p3;
    private javax.swing.JButton cardp_p4;
    private javax.swing.JButton cardp_p5;
    private javax.swing.JButton cardp_p6;
    private javax.swing.JButton cardp_p7;
    private javax.swing.JButton cardp_p8;
    private javax.swing.JButton cardp_p9;
    private javax.swing.JButton cardp_pdel;
    private javax.swing.JTextField cardp_pin;
    private javax.swing.JButton cashp_btnInsertCardCancel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
