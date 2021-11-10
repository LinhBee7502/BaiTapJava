package com.lebinh2008110153.lab7.animals;

public class Dog extends Canine {
    private String color;
    public Dog(String giong, int tuoi, String maulong) {
        setBreed(giong);
        setAge(tuoi);
        color = maulong;
    }
    protected void chaseCat() {
        System.out.println("Gau gau con meo");
    }
    protected void bark() {
        System.out.println("Cut di ko t can m ak");
    }
    public Dog() {
        
    }
}    
