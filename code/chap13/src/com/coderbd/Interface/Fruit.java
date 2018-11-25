package com.coderbd.Interface;

public class Fruit implements Edible {

    String nameofFruit;

    public Fruit() {
    }

    public Fruit(String nameofFruit) {
        this.nameofFruit = nameofFruit;
    }

    @Override
    public String howToEat() {
        return null;
    }
}
