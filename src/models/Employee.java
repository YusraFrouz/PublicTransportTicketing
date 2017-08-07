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
    private static String Username;
    private String Password;
    private String EmployeeType;
    private static int EmployeeCount = 0;
    
    
    private static int id = 0;       
        
    public Employee(String empType, String name, String address, String username, String pwd){
            EmployeeType = empType;
            EmployeeName = name;
            EmployeeAddress = address;
            Username = username;
            Password = pwd; 
            EmployeeID=EmployeeCount++;
         }
        
        public int getID(){
            return EmployeeID;
        }

        public String getName(){
            return EmployeeName;
        }

        public static int getEmployeeCount() {
            return EmployeeCount;
        }

        public static void setEmployeeCount(int EmployeeCount) {
            Employee.EmployeeCount = EmployeeCount;
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
        
        public static void getUsername(String Username){
            Employee.Username = Username;
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
    }

