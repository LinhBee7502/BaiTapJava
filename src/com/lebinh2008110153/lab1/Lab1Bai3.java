package com.lebinh2008110153.lab1;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh lap phuong: ");
        double canh = scanner.nextDouble();
        double theTich = canh*canh*canh;
        System.out.printf("The tich cua khoi lap phuong: %.1f \n", theTich);
    }  
}