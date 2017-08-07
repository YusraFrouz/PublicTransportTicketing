/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Nadya Sirimanna
 */
public abstract class payment {
    
    public double amount;
    
    public double displayAmount(double Amount){
        return Amount;
    }
    public boolean confirmAmount(){
        
        return true;
    }
    public void refundAmount(){
    
    }
}



