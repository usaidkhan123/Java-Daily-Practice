/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops_5;
import java.util.Scanner;
public class Oops_5 {

    public static void main(String[] args) {
          Scanner sq = new Scanner(System.in);
        int points = 0;
        System.out.println("========Quiz=======");
        System.out.println("Enter a for english quiz");
        System.out.println("Enter b for mathematics quiz");

        char quiz = sq.next().charAt(0);

        switch(quiz){

            case 'a':
                System.out.println("Starting English quiz!");
                System.out.println("Is cat a noun?");
                System.out.println("A: yes");
                System.out.println("B: No");

                char ansE = sq.next().charAt(0);

                if(ansE == 'A' || ansE == 'a'){
                    System.out.println("Correct Answer!");
                    points++; 
                }
                else {
                    System.out.println("Wrong Answer!");
                }
                break;

            case 'b':
                System.out.println("Starting Mathematics quiz!");
                System.out.println("What is 2+2=?");
                System.out.println("A: 4");
                System.out.println("B: 6");
                System.out.println("C: 8");
                System.out.println("D: 1");

                char ansM = sq.next().charAt(0);

                if(ansM == 'A' || ansM == 'a'){
                    System.out.println("Correct Answer!");
                    points++; 
                }
                else {
                    System.out.println("Wrong Answer!");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Your Total Points = " + points);
    }
    }
