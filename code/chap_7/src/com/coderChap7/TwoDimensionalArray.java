package com.coderChap7;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        //int x[] = {2,3,5};
        // int y[] = {7,8,9};
        int twoD[][] = {
            {2, 3, 5},
            {7, 8, 9},
            {1, 4, 7, 9}
        };
        System.out.println("twoD[1][1]:" + twoD[1][1]);
        System.out.println("twoD[2][0]:" + twoD[2][0]);
        for (int oneD[] : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

}
