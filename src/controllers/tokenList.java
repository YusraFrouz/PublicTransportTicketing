/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.JourneyList.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import models.Account;
import models.Journey;
import models.Network;
import models.token;

/**
 *
 * @author Nadya Sirimanna
 */
public class tokenList extends ArrayList<token> {
    private token token;
    private JourneyList journeys;
    private NetworkStopList networks;
    private Account account;
    
    ArrayList<token> tokenArr = new ArrayList<token>();
    ArrayList<token> token2 = new ArrayList<token>();
    ArrayList<Account> accountArr = new ArrayList<Account>();
    
    public static final File file = new File("token.txt");
    public static final File Accfile = new File("account.txt");
    
    private JourneyList tokenList ;
    private int count; 
    
    ArrayList<Journey> journeyArr = new ArrayList<Journey>();
    ArrayList<Network> networkArr = new ArrayList<Network>();
    
    
    public tokenList(){
        tokenArr = Deserialize(file);
        count  = tokenArr.size();
        token.setCount(count + 1);
    }
    
    public void addToken(token token){
        tokenArr = Deserialize(file);
        tokenArr.add(token);
        Serialize(tokenArr);
    }
    
    public boolean findTokenByID (String ID)
    {
        //books2 = null;
        tokenArr = Deserialize(file);
        for (token i : tokenArr){
            if (i.getTokenID().equalsIgnoreCase(ID)){
                return true;
            }
        }
        return false;
    }
    public ArrayList getTokenByID (String ID)
    {
        token2 = null;
        tokenArr = Deserialize(file);
        for (token i : tokenArr){
            if (i.getTokenID().equalsIgnoreCase(ID)){
                token2.add(i);
                return token2;
            }
        }
        return token2;
    }
    
    public double getBalannce(String ID){
        accountArr = Deserialize(Accfile);
        for (Account i : accountArr){
            for (token j : i.getTokenList()){
                if (j.getTokenID().equalsIgnoreCase(ID)){
                return i.getBalance();
                }
            }
        }
        return 0;
    }
    
    public boolean hasCredit(String ID){
        double balance = account.getBalance();
        
        accountArr = Deserialize(Accfile);
        for (Account i : accountArr){
            for (token j : i.getTokenList()){
                if (j.getTokenID().equalsIgnoreCase(ID)){
                    if (balance>0){
                        return true;
                    }
                }
            }
        }
        return false;
                    
    }
    //Not sure about the implementations
    public void getJourneys(String ID){
        journeyArr = journeys.getJourneys();
    }
    
    public void getTodaysJourneys(){
        Date today = new Date();
        journeyArr = journeys.findJourneysByDate(today);
    }
    
    public boolean isValid(NetworkStopList stop){
        networkArr = networks.getNetworkStops();
        for (Network i : networkArr){
            if (i.equals(stop)){
                return true;
            }
        }
        return false;
    }
    public void recordJourney(NetworkStopList stop){
    
    }
    
    public void addJourney(Journey journey){
        journeys.addJourney(journey);
    }
    
    public void recordPayment(String option, float amount){
    
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
