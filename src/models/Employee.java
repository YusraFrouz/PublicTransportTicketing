/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yusra Frouz
 */
public class Employee implements Serializable{
    private static final long serialVersionUID = 1;
    private int EmployeeID;
    private String EmployeeName;
    private String EmployeeAddress;
    private String Username;
    private String Password;
    private String EmployeeType;
    
    
    private static int id = 0;       
        
    public void Empoyee(String empType, String name, String add, String username, String pwd){
            EmployeeType = empType;
            EmployeeName = name;
            EmployeeAddress = add;
            Username = username;
            Password = pwd;   
            EmployeeID = id++;
         }
        
        public int getID(){
            return EmployeeID;
        }

        public String getName(){
            return EmployeeName;
        }

        public void setName(String EmployeeName){
            this.EmployeeName = EmployeeName;
        }
        
        public String getAddress(){
            return EmployeeName;
        }

        public void setAddress(String EmployeeAddress){
            this.EmployeeAddress = EmployeeAddress;
        }
        
        public String getUsername(){
            return Username;
        }

        public void setUsername(String Username){
            this.Username = Username;
        }
        
        public String getPassword(){
            return Password;
        }
        
        public void setPassword(String Password){
            this.Password = Password;
        }
        
        
        
        public void serializeEmployee(List <Employee> emp, String employeeFile){
            
            try(ObjectOutputStream out = 
                    new ObjectOutputStream(new FileOutputStream(employeeFile))){
                out.writeObject(emp);
            } catch (IOException ex) {
                System.out.println("Error");
                System.err.println(ex.getMessage());
            }
        }
    }

