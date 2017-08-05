
package models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author bhagyaangelo
 */
public class Journey implements Serializable  {
    
    private token tokenObj;
    private String tokenID;
    private float charge;
    private NetworkStop startStop;
    private Date startTime;
    private NetworkStop stopStop;
    private Date stopTime;
    private Network networkType;
    private Route route;
    
    private Date journeyDate;
    private static int journeyCount=0;
      
    public Journey( String tokenID, float charge, NetworkStop startStop, Date startTime, NetworkStop stopstop, Date stoptime, Network networkType, Route route){
    
        this.tokenID = tokenID;
        this.charge = charge;
        this.startStop = startStop;
        this.startTime = startTime;
        this.stopStop = stopStop;
        this.stopTime = stopTime;
        this.networkType = networkType;
        this.route = route;
           
    }
    
    public void endJourney(NetworkStop networkStop, float charge){
    //reduce the amount from account balance.. check if this is to be implemented in another class
    }
    
    public void hasEnded(){
    
    }

    public static int getJourneyCount() {
        return journeyCount;
    }

    public static void setJourneyCount(int journeyCount) {
        Journey.journeyCount = journeyCount;
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate) {
        this.journeyDate = journeyDate;
    }
    
    public String getTokenID() {
        return tokenID;
    }

    public void setTokenID(String tokenID) {
        this.tokenID = tokenID;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public NetworkStop getStartStop() {
        return startStop;
    }

    public void setStartStop(NetworkStop startStop) {
        this.startStop = startStop;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public NetworkStop getStopStop() {
        return stopStop;
    }

    public void setStopStop(NetworkStop stopStop) {
        this.stopStop = stopStop;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Network getNetworkType() {
        return networkType;
    }

    public void setNetworkType(Network networkType) {
        this.networkType = networkType;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
    
    

    
}
