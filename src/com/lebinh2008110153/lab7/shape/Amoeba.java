package com.lebinh2008110153.lab7.shape;

public class Amoeba extends Shape {
    protected int a;
    protected int b;

    protected Amoeba(int aa, int bb, String s) {
        a = aa;
        b = bb;
        sound = s;
    }
    protected void Rotate() {
        System.out.println("\nDa xoay 360 voi a = " + a + " va b = "+b);
    }
    protected void playSound() {
        System.out.println("Them am thanh.HIF: "+sound);
    }
}