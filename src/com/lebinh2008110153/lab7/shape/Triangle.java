package com.lebinh2008110153.lab7.shape;

public class Triangle extends Shape {
    Triangle(String s) {
        System.out.println("- Hinh tam giac");
        sound = s;
    }
    protected void playSound() {
        System.out.println("Them am thanh.AIF: "+sound);
    }
}
