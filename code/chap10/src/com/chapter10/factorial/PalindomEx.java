package com.chapter10.factorial;

public class PalindomEx {

    public static void main(String[] args) {
        String[] arrs = {"mom", "abc", "madam", "bye", "mim", "eye"};
        System.out.println(countPalindom(arrs));
        String s1 = "Mom";
        String s2 = "mom";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }

    public static boolean isPalindom(String s) {

        boolean status = false;
        StringBuilder str = new StringBuilder(s);
        String newStr = String.valueOf(str.reverse());
        if (newStr.equalsIgnoreCase(s)) {
            status = true;
        }
        return status;
    }

    public static int countPalindom(String[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPalindom(s[i])) {
                count++;
            }
        }
        return count;

    }

}
