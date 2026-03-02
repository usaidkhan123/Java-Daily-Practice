/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_2;
import java.util.Scanner;
public class Task_2 {

    public static void main(String[] args) {
               Calculator calc = new Calculator();
        double val1, val2;
        System.out.println("Provide the first value: ");
        Scanner reader = new Scanner(System.in);
        val1 = reader.nextDouble();
        System.out.println("Provide the second value: ");
        val2 = reader.nextDouble();

        System.out.println("========== Choose Operation ==========");
        System.out.println("1. Addition\n2.Subtraction\n3.Multiplication\n4. Division\n5. Modulus");
        System.out.println("Pick your option: ");
        int pick = reader.nextInt();
        switch(pick)
        {
            case 1:
                System.out.println(calc.add(val1, val2));
                break;
            case 2:
                System.out.println(calc.subtract(val1, val2));
                break;
            case 3:
                System.out.println(calc.multiply(val1, val2));
                break;
            case 4:
                if(val2==0)
                {
                    System.out.println("Cannot divide by zero!");
                    break;
                }
                else
                {
                    System.out.println(calc.divide(val1, val2));
                    break;
                }
            case 5:
                System.out.println(calc.remainder(val1, val2));
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }

        }
    }
