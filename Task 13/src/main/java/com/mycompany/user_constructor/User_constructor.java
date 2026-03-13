/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user_constructor;

/**
 *
 * @author User
 */
public class User_constructor {

    public static void main(String[] args) {
        User u1 = new User("usaid1232gmail.com","usaid123");
        User u2 = new User("mahinder132gmail.com","mahinder123");
        User u3 = new User(u1);
        u1.display();
        u2.display();
        u3.display();
    }
}
