/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import models.Journey;

/**
 *
 * @author bhagyaangelo
 */
public class JourneyList extends ArrayList<Journey>{
   
    private Journey Journey;
    ArrayList<Journey> journeyArr = new ArrayList<Journey>();
    ArrayList<Journey> journey2 = new ArrayList<Journey>();
    public static final File file = new File("Journey.txt");
    private JourneyList journeyList ;
    private int count;
    
    public JourneyList()  
{
    journeyArr = Deserialize(file);
    count  = journeyArr.size();
    Journey.setJourneyCount(count);
    
    //super();
}
    public void addJourney(Journey journey)
{
    //super.add(aBook);
    this.Journey = journey; 
    journeyArr = Deserialize(file);
    journeyArr.add(Journey);
    Serialize(journeyArr);
      
}
    public ArrayList findJourneysByDate (Date jdate)
 {
    //books2 = null;
    journeyArr = Deserialize(file);
    for (Journey i : journeyArr){
        if (i.getJourneyDate().equals(jdate)){
            journey2.add(i);
        }
    }
    return journey2;
}
    public int getTotalJourneys(){
        journeyArr = Deserialize(file);
        count  = journeyArr.size();
        return count;
    }
    public ArrayList getJourneys(){
        journeyArr = Deserialize(file);
        return journeyArr;
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
