package com.coderChap7;

import java.util.Scanner;

public class makeSum {
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int in = sc.nextInt();
    System.out.println("Enter second number");
    int in2 = sc.nextInt();
    //System.out.println("sum: "+ (makeSum));
}
    int n1 = 1;
    int n2 = 10;

    public static int makeSum(int n1, int n2) {
        int sum = 0;
        for (int i = n1; i >=n2; i--) {
            System.out.println("sum: " + sum);
        }
        if (n1 > 0 || n2 > 0) {
            if (n1 > n2) {

            } else if (n1 < n2) {

            } else if (n1 == n2) {
                sum = n1;
            }
        } else {
            sum = -1;
        }
        return sum;

    }
}
