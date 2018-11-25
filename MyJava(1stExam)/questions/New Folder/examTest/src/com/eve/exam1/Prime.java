package com.eve.exam1;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner Rekha = new Scanner(System.in);
        System.out.println("Enter any possitive number: ");
        int num = Rekha.nextInt();

        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.print(num + " is prime");

        } else {
            System.out.println(num + " is not prime");
        }

    }

}
