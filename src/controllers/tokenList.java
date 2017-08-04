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
import models.token;

/**
 *
 * @author Nadya Sirimanna
 */
public class tokenList extends ArrayList<token> {
    private token token;
    ArrayList<token> tokenArr = new ArrayList<token>();
    ArrayList<token> token2 = new ArrayList<token>();
    public static final File file = new File("token.txt");
    private JourneyList tokenList ;
    private int count; 
    
    public tokenList(){
        tokenArr = Deserialize(file);
        count  = tokenArr.size();
        token.setCount(count);
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
