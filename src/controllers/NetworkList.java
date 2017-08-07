package controllers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import models.Network;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prarthana
 */
public class NetworkList extends ArrayList<Network>{
    private Network network;
    ArrayList<Network> networkArr = new ArrayList<Network>();
    ArrayList<String> networkArr1 = new ArrayList<String>();
    public static final File file = new File("Networks.txt");
    private int count;
    private String type;
    
    public NetworkList(){
       
    }
    
    
    public void addNetwork(Network pNetwork){
        this.network = pNetwork; 
        networkArr = Deserialize(file);
        type = network.getNetworkType();
        
        for(Network i : networkArr){
           if(type.equals(i.getNetworkType()))
           {
               DisplayMessage.display("Network already exists!");
               System.out.println("exists");
               break;
              
           } 
           else
           {
               network.setNetworkID(count+1);
               networkArr.add(network);
               DisplayMessage.display("Network added successfully!");
               System.out.println("added");
               break;
           }    
        }
               
        Serialize(networkArr);
      
    }
    
    
    
    public ArrayList getNetworks ()
    {
        networkArr = Deserialize(file);
        return networkArr;
    }
    
    
    public ArrayList getNetworkTypes (){
    networkArr = Deserialize(file);
    for (Network i : networkArr){
        networkArr1.add(i.getNetworkType());
        System.out.println(i.getNetworkType());
        
    }
    return networkArr1;
        
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
