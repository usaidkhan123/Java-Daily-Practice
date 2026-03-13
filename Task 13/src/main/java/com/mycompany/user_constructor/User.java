/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user_constructor;

/**
 *
 * @author User
 */
public class User {
    String email;
    String pass;
    
    User(String email,String pass){
        this.email = email;
        this.pass = pass;
    }
    User(User anotherU){
        this.email = anotherU.email;
        this.pass = anotherU.pass;
    }
    public void display(){
        System.out.println("Email :" + email);
        System.out.println("Password :" + pass);
    }
}
