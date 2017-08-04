
package models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Siri@MnS
 */
public class Journey implements Serializable  {
    
    private token tokenObj;
    private float charge;
    private NetworkStop startStop;
    private Date startTime;
    private NetworkStop stopStop;
    private Date stopTime;
    private Network networkType;
    //private Route route;
      
    public Journey( Float charge,NetworkStop startStop, Date startTime, NetworkStop stopstop, Date stoptime){
    
        //this.tokenID = tokenID;
        this.charge = charge;
        this.startStop = startStop;
        this.startTime = startTime;
        this.stopStop = stopStop;
        this.stopTime = stopTime;
        //this.networkType = networkType;
        //this.route = route;
           
    }

    
}
