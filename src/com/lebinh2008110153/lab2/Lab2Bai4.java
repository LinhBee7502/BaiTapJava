package com.lebinh2008110153.lab2;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        System.out.println("======================MENU======================");
        System.out.println("1.Giai PT Bac 1");
        System.out.println("2.Giai PT Bac 2");
        System.out.println("3.Tinh tien dien");
        System.out.println("====================END MENU=====================");
        System.out.println("Hay chon chuc nang: ");
        int giaTriNhap = bienNhap.nextInt();
        switch(giaTriNhap) {
            case 1: giaiPTBac1() ; break;
            case 2: giaiPTBac2()  ; break;
            case 3: tinhTienDien() ; break;
            default: System.out.println("Chon chuc nang khac: ");
        }
    }
static void giaiPTBac1() {
    int a,b;
        float x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        if (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem ");
            }
            else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        }
        else
        {
        x = -b/a;
        System.out.printf("Phuong trinh co nghiem x = %.1f\n",x);
        }
    }

static void giaiPTBac2() {
    int a,b,c;
        float x,x1,x2,delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        System.out.print("Nhap c: ");
        c = scanner.nextInt();
        if (a==0) {
            if (b==0) {
                if (c==0)
                    System.out.println("PT Vo so nghiem");
                    else System.out.println("PT vo nghiem");
                }
                else {
                    x= (float)(-b)/c;
                    System.out.printf("Nghiem Pt x= %.1f",x);
                }
            }
            else {
                delta = b*b-4*a*c;
                if (delta<0) {
                    System.out.println("PT Vo nghiem");
                }
                else if(delta==0) {
                    System.out.printf("PT co nghiem kep x = %.1f ",-b/2*a);
                }
                else {
                    x1 =(float)((-b) + Math.sqrt(delta))/(2*a);
                    x2 =(float)((-b) - Math.sqrt(delta))/(2*a);
                    System.out.printf("Nghiem x1 = %.1f ",x1);
                    System.out.printf("Nghiem x2 = %.1f ",x2);
                }
            }
        }
static void tinhTienDien() {
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
 