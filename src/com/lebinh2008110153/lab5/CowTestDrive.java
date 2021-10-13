package com.lebinh2008110153.lab5;

public class CowTestDrive {
    public static void main(String[] args) {
        
    Cow cow;
    cow = new Cow();
    cow = new Cow(3.0);
    Cow newCow = new Cow(11.5);
    cow = new Cow(9.5,1);
    System.out.println("Can nang: "+cow.weight);
    System.out.println("Tuoi: "+cow.age);
    }
}

