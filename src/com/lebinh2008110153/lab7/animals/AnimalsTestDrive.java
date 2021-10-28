package com.lebinh2008110153.lab7.animals;

public class AnimalsTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
        cat.chaseButterfly();
        cat.sleep();
        cat.roam();

        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();
        dog.chaseCat();
        dog.sleep();
        dog.roam();

        Hippo hippo = new Hippo();
        hippo.makeNoise();
        hippo.eat();
        hippo.sleep();
        hippo.roam();

        Lion lion = new Lion();
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        lion.roam();

        Tiger tiger = new Tiger();
        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        tiger.roam();

        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        wolf.roam(); 
    }
}
