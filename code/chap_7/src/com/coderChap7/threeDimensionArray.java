package com.coderChap7;

public class threeDimensionArray {

    public static void main(String[] args) {
        int threeD[][][] = {
            {
                {2, 3, 5},
                {7, 8, 9}
            },
            {
                {2, 3, 5},
                {7, 8, 9},
                {1, 4, 7, 9}
            },
            {
                {1, 2, 3, 7, 9},
                {4, 5, 6, 8}
            },
            {
                {1, 2, 3, 7, 9},
                {4, 5, 6, 8},
                {7, 8, 9,},
                {5, 9},
                {3}
            }

        };
        
        for(int twoD[][] : threeD){
        for(int oneD[]: twoD){
        for(int i : oneD){
            System.out.print( i + " ");
        }
            System.out.println(" ");
        }
            System.out.println(" ");
        }
    }
}
