package com.eve.exam1;

import java.math.BigInteger;
import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any possitive number:");
        primeCh(sc.nextInt());
    }

    static void primeCh(int number) {
        if (BigInteger.valueOf(number).isProbablePrime(1)) {
            System.out.print(number + " is prime");
        }
        System.out.print(number + " is not prime");
    }
}
