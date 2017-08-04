/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Network;
import models.NetworkStop;

/**
 *
 * @author bhagyaangelo
 */
public class NetworkStopList {
    
    private NetworkStop networkStop[];
    ArrayList<Network> networkArr = new ArrayList<Network>();
    
    public ArrayList getNetworkStops() {
        
        return networkArr;
    }
    
    
    
    
    
}
