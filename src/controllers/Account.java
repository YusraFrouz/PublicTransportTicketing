/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.token;
import models.TransactionLIst;

/**
 *
 * @author Yusra Frouz
 */
public class Account {
    private token tokens[]; 
    private TransactionLIst transactions[];
    private float Balance;
    private float balance; //added by nadya

    public float getBalance() {
        //Nadya
        return balance;
    }

    public void setBalance(float balance) {
        //Nadya
        this.balance = balance;
    }
    
    
    public token[] getToken(tokens) {
        return tokens;
    }
    
    public token[] addtken(){
        return tokens;
    }
    
    public token[] getBalace(){
        return balance;
    }
    
    public token[] updateBalance(){
        return ammount;
    }
    
    public float recordPayment(String option, float amount){
           return amount;
    }
    
    public float deductBalance(float charge){
        return charge;
    }
    
    
    
    
}
