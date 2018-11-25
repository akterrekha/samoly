package com.coderChap7;

public class TwoDimensionArray2 {

    public static void main(String[] args) {
        int twoD[][] = {
            {1, 2, 3, 7, 9},
            {4, 5, 6, 8},
            {7, 8, 9,},
            {5, 9},
            {3}
        };
        for (int oneD[] : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
        // for (int oneD[] : twoD) {
        //for (int i : oneD) {
        // System.out.print(i + " ");
        // }
        //System.out.println(" ");
    }

}
