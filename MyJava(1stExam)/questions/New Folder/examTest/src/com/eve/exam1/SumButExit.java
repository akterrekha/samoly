package com.eve.exam1;

import java.util.Scanner;

public class SumButExit {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number: ");
        do {
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum: " + sum);

    }

}
