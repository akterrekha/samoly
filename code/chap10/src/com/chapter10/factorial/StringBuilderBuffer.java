package com.chapter10.factorial;

public class StringBuilderBuffer {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to ");
        stringBuilder.append("java");
        System.out.println(stringBuilder);

        //stringBuilder.delete(8, 11);
        // stringBuilder.deleteCharAt(8);
        //  stringBuilder.reverse();
        System.out.println(stringBuilder.delete(8, 11));
        System.out.println(stringBuilder.deleteCharAt(8));

        System.out.println(stringBuilder.replace(11, 15, "HTML"));
        System.out.println(stringBuilder.reverse());

        stringBuilder.setCharAt(0, 'w');
        System.out.println(stringBuilder);
    }

}
