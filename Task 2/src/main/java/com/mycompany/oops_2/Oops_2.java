/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops_2;

import java.util.Scanner;
public class Oops_2 {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Scanner si = new  Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = ss.nextLine();
        System.out.println("Enter Your Course Name:");
        String courseName = ss.nextLine();
        System.out.println("Enter Your RollNo:");
        int rollNo=si.nextInt();
        si.nextLine();
        System.out.println("Enter your Age:");
        int age = si.nextInt();
        System.out.println("Name :" + " " + name);
        System.out.println("CourseName :" + " " + courseName);
        System.out.println("RollNo :" + " " + rollNo);
        System.out.println("Age :" + " " + age);
    }
}
