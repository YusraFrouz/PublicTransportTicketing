/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author bhagyaangelo
 */
public class NetworkStop implements Serializable{
    
    private int networkStopID;
    private float minimumCharge;
    private Network network;
    private Route route;
    



 public NetworkStop(int networkStopID, Network network , Route route){
    
        this.networkStopID = networkStopID;
        this.network = network;
        this.route = route;
           
    }

    public int getNetworkStopID() {
        return networkStopID;
    }

    public void setNetworkStopID(int networkStopID) {
        this.networkStopID = networkStopID;
    }

    public float getMinimumCharge() {
        return minimumCharge;
    }

    public void setMinimumCharge(float minimumCharge) {
        this.minimumCharge = minimumCharge;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    
}