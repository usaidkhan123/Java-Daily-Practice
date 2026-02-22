/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops_1;
import java.util.Scanner;
public class Oops_1 {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        Scanner sf=new Scanner(System.in);
        Scanner sr=new Scanner(System.in);        
        Scanner sgp=new Scanner(System.in);
        Scanner sg=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sn.nextLine();
        System.out.println("Enter FatherName: ");
        String fathername = sf.nextLine();
        System.out.println("Enter RollNo: ");
        int rollno=sr.nextInt();
        System.out.println("Enter Gpa: ");
        double gpa=sgp.nextDouble();
        System.out.println("Enter Your Gender:");
        String gender=sg.nextLine();
        System.out.println("Print User Name:" + " " + name);
        System.out.println("print User FatherName:" + " " + fathername);
        System.out.println("Print User RollNo:" + " " + rollno);
        System.out.println("Print User Gpa:" + " " + gpa);
        System.out.println("Print User Gender:" + " " + gender);
    }
}