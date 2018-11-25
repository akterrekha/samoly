package com.Exam1.my;

import java.util.Scanner;

public class EmailValid {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Email");

        String email = r.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        if(atpos > 0 && dotpos < email.length() -1 && atpos < dotpos -1){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is invalid");
        }
       
    }
}
