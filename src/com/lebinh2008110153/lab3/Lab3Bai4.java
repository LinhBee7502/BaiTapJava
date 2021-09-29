package com.lebinh2008110153.lab3;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i=0;i<n;i++) {
            System.out.println("- Nhap thong tin sinh vien thu "+ i +" : ");
            System.out.print("Ho va ten sinh vien: ");
            scanner.nextLine();
            a[i] = scanner.nextLine();
        }
        int b[] = new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("- Nhap thong tin sinh vien thu "+ i +" : ");
            System.out.print("Diem: ");
            b[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(b[i]<5) {
                System.out.println("Ten : "+a[i]+"\n Diem: "+b[i]+"\nHoc Luc: yeu");
            }
            if(b[i]>5 && b[i]<6.5) {

                System.out.println("Ten : "+a[i]+"\n Diem: "+b[i]+"\nHoc Luc: trung binh");
            }
            if(b[i]>=6.5 && b[i]<7.5) {

                System.out.println("Ten : "+a[i]+"\n Diem: "+b[i]+"\nHoc Luc: kha");
            }
            if(b[i]>=7.5 && b[i]<9) {

                System.out.println("Ten : "+a[i]+"\n Diem: "+b[i]+"\nHoc Luc: gioi");
            }
            if(b[i ]>=9) {

                System.out.println("Ten : "+a[i]+"\n Diem: "+b[i]+"\nHoc Luc: xuat sac");
            }
        }
    }
}


