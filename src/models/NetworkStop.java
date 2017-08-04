/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author bhagyaangelo
 */
public class NetworkStop {
    
    private int networkStopID;
    private Float minimumCharge;
    private Network network;
    private Route route;
    



 public NetworkStop(int networkStopID,Float minimumCharge, Network network, Route route){
    
        this.networkStopID = networkStopID;
        this.minimumCharge = minimumCharge;
        this.network = network;
        this.route = route;
           
    }

    public Float getMinimumCharge() {
        return minimumCharge;
    }
 
 
}