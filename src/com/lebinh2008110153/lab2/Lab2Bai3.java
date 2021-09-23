package com.lebinh2008110153.lab2;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soDien;
        System.out.print("So dien = ");
        soDien = scanner.nextDouble();
        if (soDien>=50) {
            System.out.printf("So tien %.1f ", + (soDien*1000));
        }
        else {
            System.out.printf("So tien %.1f ", + ((50*1000+(soDien-50)*1200)));
        }
    }
}
