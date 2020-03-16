/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EZShoppe;
import java.sql.*;


/**
 *
 * @author jslun
 */
public class DBConnect implements ConnectProvider{
    
    //Global variable that holds status of connection
    static Connection connect = null;
    
    public static Connection connectInit(){
        
        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(urlConn,dbUser,dbPassword);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return connect;
    }
    
}
