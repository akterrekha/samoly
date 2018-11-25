package com.Exam1.my;

public class ArrayDisplatAndSum {

    public static void main(String[] args) {
        int[] array = {4, 5, 7, 2, 9, 6, 10, 20};
        int sum = 0;
        for (int i : array) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println("Sum: "+ sum);

    }
}
