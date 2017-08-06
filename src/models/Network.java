package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prarthana
 */

import java.io.Serializable;



public class Network implements Serializable{

    private int networkID;
    private String networkType;

     public Network(String networkType) {
        this.networkType = networkType;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }
    
    
    
}
