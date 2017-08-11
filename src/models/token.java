/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.Account;
import controllers.JourneyList;
import controllers.NetworkStopList;
import java.io.Serializable;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nadya Sirimanna
 */
public class token implements Serializable {
    private String tokenID;
    private JourneyList journeys;
    private NetworkStopList networks;
    private Account account;
    
    int count = 0;
    
    public token(){
        tokenID = Integer.toString(count);
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTokenID() {
        return tokenID;
    }

    public void setTokenID(String tokenID) {
        this.tokenID = tokenID;
    }

    public boolean equalsIgnoreCase(token token) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

    
    
}
