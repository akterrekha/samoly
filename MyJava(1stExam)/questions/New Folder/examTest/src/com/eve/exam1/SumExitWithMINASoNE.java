package com.eve.exam1;

import java.util.Scanner;

public class SumExitWithMINASoNE {

    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        System.out.println("Enter a number: ");
        do {
            num = rc.nextInt();
            sum += num;

        } while (num != -1);
        System.out.println("sum = " + sum);
    }

}
