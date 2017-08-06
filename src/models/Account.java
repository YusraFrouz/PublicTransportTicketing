/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.TransactionList;
import java.io.Serializable;
import static views.CardPaymentUI.amount;

/**
 *
 * @author Yusra Frouz
 */
public class Account implements Serializable{
    private token tokenList[];
    private token token;
    private TransactionList transactions[];
    private String passengerName;
    private String passengerId;
    private double balance;
    
    private static int accountCount=0;
    
    public Account(token token, String name, double balance){
        this.passengerName = name;
        this.token = token;
        this.balance = balance;
        
        passengerId = Integer.toString(++accountCount);
        //this //ID thing in token and this class
    }

    public double updateBalance(double amount) {
        
        return amount;
    }
    
    public float recordPayment(String option, float amount){
           return amount;
    }
    
    public float deductBalance(float charge){
        return charge;
    }
    
    public token[] getTokenList() {
        return tokenList;
    }

    public void setTokenList(token[] tokenList) {
        this.tokenList = tokenList;
    }

    public TransactionList[] getTransactions() {
        return transactions;
    }

    public void setTransactions(TransactionList[] transactions) {
        this.transactions = transactions;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public static void setAccountCount(int accountCount) {
        Account.accountCount = accountCount;
    }
}
