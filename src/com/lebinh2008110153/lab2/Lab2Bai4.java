package com.lebinh2008110153.lab2;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giaTriNhap;
        do {
        System.out.println("======================MENU======================");
        System.out.println("1.Giai phuong trinh bac 1");
        System.out.println("2.Giai phuong trinh bac 2");
        System.out.println("3.Tinh tien dien");
        System.out.println("====================END MENU=====================");
        System.out.println("Hay chon chuc nang: ");
        giaTriNhap = scanner.nextInt();       
        switch(giaTriNhap) {
            case 1: Lab2Bai1.main(args) ; break;
            case 2: Lab2Bai2.main(args)  ; break;
            case 3: Lab2Bai3.main(args) ; break;
            default: System.out.println("Chon chuc nang khac: ");
            }
        } while (giaTriNhap !=4);
    }
}
 