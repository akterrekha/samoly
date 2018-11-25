package com.chap9;

public class ClassRoom {

    int id;
    String Location;

    public int getId() {
        return id;
    }

    public String getLocation() {
        return Location;
    }

    public ClassRoom(int id, String Location) {
        this.id = id;
        this.Location = Location;
    }

    public static void main(String[] args) {
        ClassRoom Room1 = new ClassRoom(302, " 5th Floor");
        System.out.println("ID: " + Room1.getId());
        System.out.println("Location: " + Room1.getLocation());
    }

}
