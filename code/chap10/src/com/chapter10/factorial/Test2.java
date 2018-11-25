package com.chapter10.factorial;

public class Test2 {

    public static void main(String[] args) {
        String s = "Hi,good morning";
        System.out.println(m(s));
    }

    public static int m(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }

        }

        return count;

    }
}
