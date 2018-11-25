package com.codeerbd.chap18;

import static java.lang.Double.sum;
import java.util.Arrays;
import java.util.Scanner;

public class OneDfromScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
