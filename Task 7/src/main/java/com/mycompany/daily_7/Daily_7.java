/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.daily_7;

import java.util.ArrayList;
public class Daily_7 {

    public static void main(String[] args) {
         ArrayList<String> namesList = new ArrayList<String>();
        namesList.add("Usaid");
        namesList.add("Ayaan");
        namesList.add("Shayanullah");
        namesList.add("Asad");
        namesList.add("Aatik");
        System.out.println(namesList);

        namesList.add(1, "Usman");
        System.out.println(namesList);
        namesList.remove("Asad");
        System.out.println(namesList);
        if(namesList.contains("Usaid")){
            System.out.println("exist");
        }
        namesList.remove(1);
        System.out.println(namesList);
        System.out.println(namesList.size());
        System.out.println(namesList);
    }
}
