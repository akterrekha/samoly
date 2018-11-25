package com.chap9;

public class Computure {

    int serialNum;
    String Brand;

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    @Override
    public String toString() {
        return "Computure{" + "serialNum=" + serialNum + ", Brand=" + Brand + '}';
    }

    public static void main(String[] args) {
        Computure pc = new Computure();
        pc.setSerialNum(1589);
        pc.setBrand("HP");
        int x = pc.getSerialNum();
        String b = pc.getBrand();

        System.out.println(x);
        System.out.println(b);
        //System.out.println(pc);

    }
}
