
package com.coderbd.Interface.Ex2;


public class Cat implements Animal{

    @Override
    public String kill() {
   return "cat:cat can kill mouse";
    }

    @Override
    public String eat() {
       return "cat:cat can eat ";
    }
    
}
