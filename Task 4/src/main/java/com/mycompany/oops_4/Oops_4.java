/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops_4;

import java.util.Scanner;
public class Oops_4 {

    public static void main(String[] args) {
         Scanner si=new Scanner(System.in);
        System.out.println("Enter A Number:");
        int num = si.nextInt();
        for(int i=1;i<=10;i++){
            int tab = num*i;
            System.out.println(" " + num + " * " + i + " = " + tab );
        }
    }
}
