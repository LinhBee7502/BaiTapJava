package com.lebinh2008110153.lab1;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner hcn = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double dai = hcn.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = hcn.nextDouble();
        double chuVi = (dai+rong)*2;
        double dienTich = dai*rong;
        var canhNho = Math.min(dai,rong);
        System.out.printf("\nChu vi cua hinh chu nhat: %.1f ", chuVi); 
        System.out.printf("\nDien tich cua hinh chu nhat: %.1f ", dienTich);
        System.out.printf("\nCanh nho nhat cua hinh chu nhat: %.1f \n", canhNho);
        
    }
}