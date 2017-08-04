/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Yusra Frouz
 */
public class Employee {
    private int EmployeeID;
    private String EmployeeName;
    private String EmployeeAddress;
    private String Username;
    private String Password;
    
    
    public int getID(){
        return EmployeeID;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public String checkPassword(){
        return Password;
    }
}
