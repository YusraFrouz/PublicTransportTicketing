package controllers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import models.Route;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prarthana
 */
public class RouteList extends ArrayList<Route>{
    private Route route;
    ArrayList<Route> routeArr = new ArrayList<Route>();
    public static final File file = new File("Routes.txt");
    
    public RouteList(){
       
    }
    
    
    public void addRoute(Route pRoute){
        this.route = pRoute; 
        routeArr = Deserialize(file);
        int id = route.getRouteID();
        for(Route i : routeArr){
            if(i.getRouteID() == id)
            {
                DisplayMessage.display("Network already exists!");
                System.out.println("exists");
                break;  
            }
            else
            {
                routeArr.add(route);
                System.out.println("added");
            }    
        }
        Serialize(routeArr);
      
    }
    
    public ArrayList getRoutes ()
    {
        routeArr = Deserialize(file);
        return routeArr;
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
