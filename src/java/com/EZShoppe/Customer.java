/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EZShoppe;

/**
 *The customer class creates an object that represents shoppers on our e-commerce site
 * @author Jorge Sirias
 */

public class Customer {
    
    //
    String fName, lName, phone, email, password;

    //Set Methods
    public void setFName(String fName){
        this.fName = fName;
    }
    
    public void setLName(String lName){
        this.lName = lName;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    //Get Methodes
    public String getFName(){
        return fName;
    }
    
    public String getlName(){
        return lName;
    }
    
    public String getEmail(){
        return email;
    }
      
    public String getPhone(){
        return phone;
    }
    
    public String getPassword(){
        return password;
    }
     
}
