package com.coderChap7;

public class ArrayDeclarationEx {

    public static void main(String[] args) {
        int[] x = new int[2];
        x[0] = 10;
        x[1] = 25;
        //x[2] = 15;//Wrong
        System.out.println("x[0]: " + x[0]);
        System.out.println("x[1]: " + x[1]);
        for (int i : x) {
            System.out.println(i);
        }
/////////////////////alternative way////////////////////////
int p[] = {10,20,30,40,50,60,70,80,90,10,40,78,45,12,56,43};
        System.out.println("p[5]: " + p[5]);
        for (int j : p){
            System.out.println(j);
        }
    }

}
