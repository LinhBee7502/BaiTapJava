package com.lebinh2008110153.lab9;

import java.util.ArrayList;

import com.lebinh2008110153.lab7.animals.Animals;
import com.lebinh2008110153.lab7.animals.Dog;
import com.lebinh2008110153.lab7.animals.Cat;


public class AnimalsManager {
    ArrayList<Animals> list = new ArrayList<Animals>();
    public void add(Animals animals) {
        list.add(animals);
    }
    public void makeNoise() {
        for (Animals animals : list) {
            animals.makeNoise();
        }
    }
    public void roam() {
        for (Animals animals : list) {
            animals.roam();
        }
    }
    public void Introduce(){
        for (Animals animals : list) {
            animals.Introduce();
        }
    }
    public Animals searchNameCat(String name) {
        Cat c = null;
        for (Animals animals : list) {
            if (animals instanceof Cat) {
                Cat cat = (Cat)animals;
                if (cat.getName().equalsIgnoreCase(name)) {
                    c = cat;
                }
            }
        }
        return c;
    }
    public Animals searchNameDog(String name) {
        Dog d = null;
        for (Animals animals : list) {
            if (animals instanceof Cat) {
                Dog dog = (Dog)animals;
                if (dog.getName().equalsIgnoreCase(name)) {
                    d = dog;
                }
            }
        }
        return d;
    }
}