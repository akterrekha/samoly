package com.coderbd.Interface.Ex2;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.kill();

        Animal dog2 = new Dog();
        Animal cat2 = new Cat();
        Object o = new Dog();
        Animal dooog = (Animal) o;

        Object[] objes = {new Dog(), new Cat()};
        for (int i = 0; i < objes.length; i++) {
            if (objes[i] instanceof Animal) {
                System.out.println(((Animal) objes[i]).eat());
                System.out.println(((Animal) objes[i]).kill());
            }
        }
    }

}
