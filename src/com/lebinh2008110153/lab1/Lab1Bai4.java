package com.lebinh2008110153.lab1;

import java.util.Scanner;

public class Lab1Bai4 {           
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        if (a==0) {
            System.out.println("Phuong trinh co nghiem la: " + (-b/c));
        }
        else {
            double delta = b*b-4*a*c;
            if (delta < 0 ) {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if (delta==0) {
                double x = -b/2*a;
                System.out.println("Phuong trinh co nghiem kep: " + x);
            }
            else {
                double x1 = (-b - Math.sqrt(delta))/2*a;
                double x2 = (-b + Math.sqrt(delta))/2*a;
                System.out.println("\nPhuong trinh co 2 nghiem la: ");
                System.out.printf("\nx1= %.1f ", x1);
                System.out.printf("x2= %.1f\n ", x2);
            }
        }
    }
}
