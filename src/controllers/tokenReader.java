/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.NetworkStop;
import models.token;

/**
 *
 * @author Nadya Sirimanna
 */
public class tokenReader {
    private NetworkStop networkstop;
    private tokenList tokenlist;
    ArrayList<token> tokenArr = new ArrayList<token>();
    
    public ArrayList readToken(String ID){
        tokenArr = tokenlist.getTokenByID(ID);
        return tokenArr;
    }
    
    public void giveConfirmation(){
        int input = JOptionPane.showConfirmDialog(null,"Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(input);
    }
    public void displayConfirmationMessage(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
