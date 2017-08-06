/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.token;
import controllers.TransactionList;

/**
 *
 * @author Yusra Frouz
 */
public class Account {
    private token tokens[]; 
    private TransactionList transactions[];
    private float amount;
    private float balance; //added by nadya

    public float getBalance() {
        //Nadya
        return balance;
    }

    public void setBalance(float balance) {
        //Nadya
        this.balance = balance;
    }
    
    
//    public token[] getToken(tokens) {
//        return tokens;
//    }
    
    public token[] addtken(){
        return tokens;
    }
    //nadya commented them
    
    
//    public token[] getBalace(){
//        return balance;
//    }
//    
//    public token[] updateBalance(){
//        return amount;
//    }
    
    public float recordPayment(String option, float amount){
           return amount;
    }
    
    public float deductBalance(float charge){
        return charge;
    }
    
    
    
    
}