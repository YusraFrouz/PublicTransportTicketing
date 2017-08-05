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
import models.Transaction;

/**
 *
 * @author bhagyaangelo
 */
public class TransactionList extends ArrayList<Transaction>{
    private Transaction Transaction;
    ArrayList<Transaction> transactionArr = new ArrayList<Transaction>();
    ArrayList<Transaction> transaction2 = new ArrayList<Transaction>();
    public static final File file = new File("Transaction.txt");
    private TransactionList transactionList ;
    private int count;
    
    public TransactionList(){
        transactionArr = Deserialize(file);
        count  = transactionArr.size();
        Transaction.setTransactionCount(count);
    }
    
    public void addTransaction(Transaction Transaction)
    {
        //super.add(aBook);
        this.Transaction = Transaction; 
        transactionArr = Deserialize(file);
        transactionArr.add(Transaction);
        Serialize(transactionArr);
      
    }
    
    public ArrayList getTransactions ()
    {
        //books2 = null;
        transactionArr = Deserialize(file);
        return transactionArr;
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
