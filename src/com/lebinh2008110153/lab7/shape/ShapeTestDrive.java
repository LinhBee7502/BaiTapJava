package com.lebinh2008110153.lab7.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle("kit kit");
        circle.Rotate();
        circle.playSound();

        Triangle triangle = new Triangle("dum dum");
        triangle.Rotate();
        triangle.playSound();

        Square square = new Square("ton ton");
        square.Rotate();
        square.playSound();

        Amoeba amoeba = new Amoeba(5,5,"coc coc");
        amoeba.Rotate();
        amoeba.playSound();
    }
}
