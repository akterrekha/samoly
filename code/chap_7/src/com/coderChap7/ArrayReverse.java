package com.coderChap7;

public class ArrayReverse {

    public static void main(String[] args) {
        int x[] = {5, 8, 7, 1, 6, 10, 12, 84, 96, 56, 48};

        int newArray[] = new int[x.length];
        int j = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            newArray[j] = x[i];
            j++;
        }
        for (int k : newArray) {
            System.out.print(k + " ,");
        }
    }
}
