/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops_3;
import java.util.Scanner;
public class Oops_3 {

 public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        System.out.println("Enter Your Date Of Birth:");
        int dob = si.nextInt();
        if (dob >= 1981 && dob <= 1996) {
            System.out.println("Millennials");
        }
        else if(dob >= 1997 && dob <= 2012){
            System.out.println("GenZ");
        }
        else if(dob >= 2013 && dob <= 2025){
            System.out.println("GenAlpha");
        }
    }
}
