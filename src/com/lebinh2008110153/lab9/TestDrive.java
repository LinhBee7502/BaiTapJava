package com.lebinh2008110153.lab9;

import com.lebinh2008110153.lab7.animals.Cat;
import com.lebinh2008110153.lab7.animals.Dog;

public class TestDrive {
    public static void main(String[] args) {
        AnimalsManager list = new AnimalsManager();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setAge(10);
        dog.setName("Milu");

        cat.setAge(10);
        cat.setName("Mon leo");

        list.add(cat);
        list.add(dog);
        list.Introduce();
        list.roam();
        list.makeNoise();

        if (list.searchNameCat("Mon leo")!=null) {
            System.out.println("Da tim ra");
        } else System.out.println("Ko tim thay");
        if (list.searchNameDog("Milu")!=null) {
            System.out.println("Da tim ra");
        } else System.out.println("Ko tim thay");
    }
}
