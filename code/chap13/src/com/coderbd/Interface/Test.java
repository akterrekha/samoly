package com.coderbd.Interface;

public class Test {

    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (Object object : objects) {
            if (object instanceof Edible) {
                System.out.println(((Edible) object).howToEat());
            }
            if (object instanceof Animal) {
                System.out.println(((Animal) object).sound());
            }
        }
    }
}
