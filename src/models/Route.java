/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Prarthana
 */
public class Route implements Serializable{
    private int routeID;
    private Network network;
    
    public Route(int pRouteID){
        this.routeID = pRouteID;
    }
    
    
    public Route(int pRouteID, Network pNetwork){
        this.routeID = pRouteID;
        this.network = pNetwork;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int pRouteID) {
        this.routeID = pRouteID;
    }
    
    public Network getNetwork(){
            return network;
    }
    

    public void setNetwork(Network pNetwork) {
        this.network = pNetwork;
    }
}
