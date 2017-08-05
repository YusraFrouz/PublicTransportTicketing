/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Account;
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
    ArrayList<Journey> journeyArr = new ArrayList<Journey>();
    ArrayList<Network> networkArr = new ArrayList<Network>();
    
    public token(){
    
    }
    public double getBalannce(){
        return account.getBalance();
    }
    public void getJourneys(){
        journeyArr = journeys.getJourneys();
    }
    public void getTodaysJourneys(){
        Date today = new Date();
        journeyArr = journeys.findJourneysByDate(today);
    }
    public boolean isValid(NetworkStopList stop){
        networkArr = networks.getNetworkStops();
        for (Network i : networkArr){
            if (i.equals(stop)){
                return true;
            }
        }
        return false;
    }
    public void recordJourney(NetworkStopList stop){
    
    }
    public void addJourney(Journey journey){
        journeys.addJourney(journey);
    }
    public void recordPayment(String option, float amount){
    
    }
    public boolean hasCredit(){
        double balance = account.getBalance();
        
        if (balance>0){
            return true;
        }
        else
            return false;
                    
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
    
    
    
    
}
