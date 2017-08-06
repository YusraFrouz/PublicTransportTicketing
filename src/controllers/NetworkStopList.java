package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prarthana
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import models.NetworkStop;
import models.Route;

public class NetworkStopList extends ArrayList<NetworkStop>{
    
    private NetworkStop networkStop;
    ArrayList<NetworkStop> networkStopArr = new ArrayList<NetworkStop>();
    //ArrayList<NetworkStop> sortedArr = new ArrayList<NetworkStop>();
    public static final File file = new File("NetworkStops.txt");
    private int count;
    
    public NetworkStopList(){
       
    }
    
    
    public void addNetworkStop(NetworkStop pNetworkStop){
        this.networkStop = pNetworkStop; 
        networkStopArr = Deserialize(file);
        Route route = networkStop.getRoute();
        for(NetworkStop i : networkStopArr){
            if(i.getRoute().equals(route)){
                count++;
            }
           
        }
        networkStop.setNetworkStopID(count+1);
        networkStopArr.add(networkStop);
        Serialize(networkStopArr);
      
    }
    
    public ArrayList getNetworkStops ()
    {
        networkStopArr = Deserialize(file);
        return networkStopArr;
    }
    
    public void Serialize( ArrayList arraylist){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(arraylist);
            fos.close();
            System.out.println("Serialized");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
  public ArrayList Deserialize(File filename){
        
        ArrayList d_arraylist = null;
        try{
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            d_arraylist = (ArrayList)ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(d_arraylist);
            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
        
        return d_arraylist;
    }
}
