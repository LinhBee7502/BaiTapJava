package com.lebinh2008110153.lab7.shape;

public class Square extends Shape {
    Square(String s) {
        System.out.println("- Hinh vuong");
        sound = s;
    }
    protected void playSound() {
        System.out.println("Them am thanh.AIF: "+sound);
    }
}
