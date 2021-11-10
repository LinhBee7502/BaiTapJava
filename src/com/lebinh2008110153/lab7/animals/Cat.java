package com.lebinh2008110153.lab7.animals;

public class Cat extends Feline {
    private String color;
    @Override
    public void makeNoise() {
        System.out.println("Meo meo");
    }
    protected void catchMouse() {
        System.out.println("Bat duoc may roi Jerry");
    }
    public Cat(String giong, int tuoi, String mau) {
        setBreed(giong);
        setAge(tuoi);
        color = mau;
    }
    public Cat() {
    }
}