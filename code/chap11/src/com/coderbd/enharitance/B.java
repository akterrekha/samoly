
package com.coderbd.enharitance;

public class B extends A{

    public B() {
    }
    
    double salary;

    public B(double salary) {
        this.salary = salary;
    }

    public B(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }

 
    
}
