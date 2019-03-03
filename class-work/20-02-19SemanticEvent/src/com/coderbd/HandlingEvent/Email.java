
package com.coderbd.HandlingEvent;


public class Email {
      public boolean checkEmailValidatyNew(String email){
       int atpos = email.indexOf("@");
       int dotpos = email.lastIndexOf(".");
       if(atpos>1 && (dotpos-atpos) > 2 && dotpos<email.length()-2){
           System.out.println("Email is valid");
       return true;
       }else{
           System.out.println("Email is invalid");
       return false;
       }
       }
}
