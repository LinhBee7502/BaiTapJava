package com.lebinh2008110153.lab7.animals;

public class Animals {
    protected String breed;
    protected String name;
    protected float weight;
    protected String picture;
    protected String food;
    protected int hunger;
    protected int location;
    protected int age;    
    public void makeNoise() {
        System.out.println("Tieng keu");
    }
    protected void eat() {
        System.out.println("An");
    }
    protected void sleep() {
        System.out.println("Ngu");
    }
    public void roam() {
        System.out.println("Di chuyen");
    }
    public Animals() {
        System.out.println("Tao animal.");
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void Introduce() {
        makeNoise();
        System.out.println("Tao la "+getName()+ " " + getAge() + " tuoi");
    }
}
