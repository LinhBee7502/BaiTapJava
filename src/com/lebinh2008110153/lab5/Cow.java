package com.lebinh2008110153.lab5;

public class Cow {
    double weight;
    int age;
    Cow() {
        age = 1;
    }
    Cow(double w) {
        weight = w;
    }
    Cow(double w, int a) {
        weight = w;
        age = a;
    }
    void moo() {
        System.out.println("Be be...");
    }
}
