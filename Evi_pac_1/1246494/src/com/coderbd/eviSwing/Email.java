/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.eviSwing;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Email {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Email check for valid");
        String email = input.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        if (atpos > 1 && (dotpos - atpos) > 2 && dotpos < email.length()) {
            System.out.println(" valid email");
        } else {
            System.out.println("Not valid");
        }

    }
}
