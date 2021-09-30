package com.lebinh2008110153.lab1;

import java.util.Scanner;

public class Lab1Bai4 {           
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        double delta = (Math.pow(b,2) - (4*a*c));
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.printf("x1 = %.1f ", x1);
        System.out.printf("x2 = %.1f ", x2);
    }
}