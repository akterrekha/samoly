package com.eve.exam1;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        System.out.println("Enter any possitive numer: ");
        evenOdd(rc.nextInt());
    }

    static void evenOdd(int num) {
        if (num == 0) {
            System.out.println(num + " is Zero");
        } else if (num %2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
