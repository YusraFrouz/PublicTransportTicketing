/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.payment;
import java.io.Serializable;

/**
 *
 * @author bhagyaangelo
 */
public class Transaction implements Serializable {

    private float amount;
    private payment type;
    private token token;
    
    private static int transactionCount=0;
    
    public Transaction(float amount, payment type, token token){
        this.amount = amount;
        this.type = type;
        this.token = token;
    }

    public static int getTransactionCount() {
        return transactionCount;
    }

    public static void setTransactionCount(int transactionCount) {
        Transaction.transactionCount = transactionCount;
    }
    
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public payment getType() {
        return type;
    }

    public void setType(payment type) {
        this.type = type;
    }

    public token getToken() {
        return token;
    }

    public void setToken(token token) {
        this.token = token;
    }
    
}
