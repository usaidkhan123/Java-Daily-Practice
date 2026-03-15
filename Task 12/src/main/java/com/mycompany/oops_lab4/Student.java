/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oops_lab4;

/**
 *
 * @author User
 */
public class Student {
    int rollNo;
    String contactNo;
    String name;
    
    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(contactNo);
    }
    
    Student() {
        System.out.println("Hello the new object is created!");
    }

}
