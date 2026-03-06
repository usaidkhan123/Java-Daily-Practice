/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops_lab3p;

/**
 *
 * @author User
 */
public class Oops_lab3p {

    public static void main(String[] args) {
       Car car1=new Car();
        Car car2=new Car();
        car1.name = "Yaris";
        car1.regNo = 76125;
        car1.colour = "Grey";
        
        System.out.println(car1.name);
        System.out.println(car1.colour);
        car1.startCar();
        
        car2.name = "cultus";
        car2.regNo = 675822;
        car2.colour = "Silver";
        
        System.out.println(car2.regNo);
        System.out.println(car2.name);
        car2.stopCar();

    }
}
