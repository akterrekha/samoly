package com.coderbd.Interface.Ex2;

public class Dog implements Animal {

    @Override
    public String eat() {
        return "Dog:Dog can eat";
    }

    @Override
    public String kill() {
        return "dog:dog can kill";
    }

}
