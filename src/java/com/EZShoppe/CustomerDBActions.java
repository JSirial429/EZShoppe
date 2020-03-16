/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EZShoppe;
import java.sql.*;

/**
 *Java class that handles the business logic of our customer interacting with the database
 * @author Jorge Sirias
 */
public class CustomerDBActions {
    
   //Var that allows connection to database
    static Connection conn = null;
    //Global var that allows for SQL queries
    static PreparedStatement query = null;
    
    public static int insertCustomer(Customer cust)
    {
        
        int status = 0;
        
        try{
            
            conn = DBConnect.connectInit();
            query = conn.prepareStatement("");
            
            //query = conn.prepareStatement("Insert into customers values(?,?)");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return status;
        
 
   
    }
    
}
