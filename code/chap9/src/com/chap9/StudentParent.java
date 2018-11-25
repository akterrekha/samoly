
package com.chap9;


public class StudentParent {
    int id;
    String name;
    public StudentParent(){
    
    }
    public static void main(String[] args){
        StudentParent s1 = new StudentParent ();
        s1.setId(1000);
        s1.setName("Mr.AAAAA");
        System.out.println(s1);
        
    
    }

    public StudentParent(int id) {
        this.id = id;
    }

    public StudentParent(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentParent{" + "id=" + id + ", name=" + name + '}';
    }

    
    
}
