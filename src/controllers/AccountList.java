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
import models.Account;
import models.token;

/**
 *
 * @author bhagyaangelo
 */
public class AccountList extends ArrayList<Account> {

    private Account account;
    ArrayList<Account> accArr = new ArrayList<Account>();
    ArrayList<Account> accArr2 = new ArrayList<Account>();
    public static final File file = new File("account.txt");
    private JourneyList tokenList;
    private int count;

    public AccountList() {
        accArr = Deserialize(file);
        count = accArr.size();
        account.setAccountCount(count);
    }

    public void addAccount(Account account) {
        accArr = Deserialize(file);
        accArr.add(account);
        Serialize(accArr);
    }
<<<<<<< HEAD

    public ArrayList getAllAccounts() {
        accArr = Deserialize(file);
        return accArr;
=======
    
    public void updateBalance(double newAmount,String tokenID){
        accArr = Deserialize(file);
        for (Account i : accArr){
            if (i.getToken().getTokenID().equalsIgnoreCase(tokenID)){
                double currentBalance = i.getBalance();
                i.setBalance(newAmount+currentBalance);
                Serialize(accArr);
            }
        }
        
    }
    
    public ArrayList getAllAccounts(){
       accArr = Deserialize(file);
       return accArr;
>>>>>>> d3702ce612f71740135f7f56da705e38d3239d13
    }

    public boolean findAccountByID(String passengerId) {
        //books2 = null;
        accArr = Deserialize(file);
        for (Account i : accArr) {
            if (i.getPassengerId().equalsIgnoreCase(passengerId)) {
                return true;
            }
        }
        return false;
    }
<<<<<<< HEAD

    public ArrayList getAccountByID(String ID) {
=======
    
    public boolean findAccountByTokenID (String ID)
    {
        //books2 = null;
        accArr = Deserialize(file);
        for (Account i : accArr){
            if (i.getToken().getTokenID().equalsIgnoreCase(ID)){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList getAccountByTokenID (String ID)
    {
        accArr2 = null;
        accArr = Deserialize(file);
        for (Account i : accArr){
            if (i.getToken().getTokenID().equalsIgnoreCase(ID)){
                accArr2.add(i);
                return accArr2;
            }
        }
        return accArr2;
    }
    
    public ArrayList getAccountByID (String ID)
    {
>>>>>>> d3702ce612f71740135f7f56da705e38d3239d13
        accArr2 = null;
        accArr = Deserialize(file);
        for (Account i : accArr) {
            if (i.getPassengerId().equalsIgnoreCase(ID)) {
                accArr2.add(i);
                return accArr2;
            }
        }
        return accArr2;
    }

    public void Serialize(ArrayList arraylist) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(arraylist);
            fos.close();
            System.out.println("Serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList Deserialize(File filename) {

        ArrayList d_arraylist = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            d_arraylist = (ArrayList) ois.readObject();
            fis.close();
            System.out.println("Deserialized");
            System.out.println(d_arraylist);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return d_arraylist;
    }

}
