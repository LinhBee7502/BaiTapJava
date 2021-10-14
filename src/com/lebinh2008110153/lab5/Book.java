package com.lebinh2008110153.lab5;

import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);
    int gianhap,giaban,soluong,namxuatban;
    String nhaxuatban,theloai;
    void GiaNhap() {
        System.out.print("Gia nhap: ");
        gianhap = scanner.nextInt() ;
    }
    void GiaBan() {
        System.out.print("Gia ban: ");
        giaban = scanner.nextInt() ;
    }
    void theLoai() {
        System.out.print("The loai: ");
        theloai = scanner.nextLine()   ;
    }
    void SoLuong() {
        System.out.print("So luong: ");
        soluong = scanner.nextInt() ;
    }
    void NhaXuatBan() {
        System.out.print("Nha xuat ban: ");
        nhaxuatban = scanner.nextLine() ;
    }
    void NamXuatBan() {
        System.out.print("Nam xuat ban: ");
        namxuatban = scanner.nextInt() ;
    }
    void bookshow() {
        System.out.println("Nha xuat ban: "+nhaxuatban);
        System.out.println("Nam xuat ban: "+namxuatban); 
        System.out.println("Gia nhap: "+gianhap);
        System.out.println("Gia ban: "+giaban);
        System.out.println("The loai:  "+theloai);
        System.out.println("So luong: "+soluong);

    }
}
