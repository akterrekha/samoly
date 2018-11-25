package com.coderbd.hanoi;

public class TowerOfHanoi {

    public static void main(String[] args) {

    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("move disk :" + n + "from" + fromTower + "to" + toTower);

        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("move Disk " + n + "from" + fromTower + "to" + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
