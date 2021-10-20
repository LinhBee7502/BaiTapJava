package com.lebinh2008110153.lab6;

public class TestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        circle.xoay();
        circle.playSound();
        triangle.xoay();
        triangle.playSound();
        square.xoay();
        square.playSound();
    }
}
