package com.lebinh2008110153.lab7.shape;

public class Circle extends Shape{
    Circle(String s) {
        System.out.println("- Hinh tron");
        sound = s;
    }
    protected void playSound() {
        System.out.println("Them am thanh.AIF: "+sound);
    }
}