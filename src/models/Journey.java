
package models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Siri@MnS
 */
public class Journey implements Serializable  {
    
    private Token tokenID;
    private Float charge;
    private NetworkStop startStop;
    private Date startTime;
    private NetworkStop stopStop;
    private Date stopTime;
    private Network networkType;
    private Route route;
      
    public Journey(Token tokentID, Float charge,NetworkStop startStop, Date startTime, NetworkStop stopstop, Date stoptime, Network networkType, Route route){
    
        this.tokenID = tokenID;
        this.charge = charge;
        this.startStop = startStop;
        this.startTime = startTime;
        this.stopStop = stopStop;
        this.stopTime = stopTime;
        this.networkType = networkType;
        this.route = route;
           
    }

    public Token getTokenID() {
        return tokenID;
    }

    public Float getCharge() {
        return charge;
    }

    public NetworkStop getStartStop() {
        return startStop;
    }

    public Date getStartTime() {
        return startTime;
    }

    public NetworkStop getStopStop() {
        return stopStop;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public Network getNetworkType() {
        return networkType;
    }

    public Route getRoute() {
        return route;
    }
 
   
    
}
