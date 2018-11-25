
package com.coderbd.Interface;


public class Chicken extends Animal implements Edible{

  

    @Override
    public String howToEat() {
        return "chicken: fry it";
       }
    
    @Override
    public String sound() {
    return "chicken: cock_a_double_doo";   
    }
    
}
