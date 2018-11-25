
package com.codderbd.abstraction;


 public class StackOfIntegers {
     private int[] elements;
     private int size;
     
     public static final int default_capacity = 16;
     public StackOfIntegers(){
     this(default_capacity);
     }

    public StackOfIntegers(int capacity) {
        elements = new int [capacity];
    }
    public void push(int value){
    
    }
    
    
}
