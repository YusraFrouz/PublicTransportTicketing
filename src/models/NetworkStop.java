package models;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prarthana
 */
public class NetworkStop implements Serializable{
    
    private int networkStopID;
    private float minimumCharge;
    private Route route;
    



 public NetworkStop(float pMinimumCharge,  Route route){
    
        this.minimumCharge = pMinimumCharge;
        this.route = route;
           
    }

    public void setNetworkStopID(int pNetworkStopID) {
        this.networkStopID = pNetworkStopID;
    }

    public float getMinimumCharge() {
        return minimumCharge;
    }

    public void setMinimumCharge(float pMinimumCharge) {
        this.minimumCharge = pMinimumCharge;
    }

    
    public Route getRoute() {
        return route;
    }

    public void setRoute(Route pRoute) {
        this.route = pRoute;
    }

    
}