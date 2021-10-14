package com.lebinh2008110153.lab5;

import java.util.Scanner;

public class Book {
    Scanner scanner = new Scanner(System.in);
    int gianhap,giaban,soluong,namxuatban;
    String nhaxuatban,loai;
    void GiaNhap(int x) {
        gianhap = x;
    }
    void GiaBan(int x) {
        giaban = x;
    }
    void Loai(String type) {
        loai = type ;
    }
    void SoLuong(int x) {
        soluong = x;
    }
    void NhaXuatBan(String publisher) {
        nhaxuatban = publisher ;
    }
    void NamXuatBan(int x) {
        namxuatban = x;
    }
    void bookshow() {
        System.out.println("Nha xuat ban: "+nhaxuatban);
        System.out.println("Nam xuat ban: "+namxuatban); 
        System.out.println("Gia nhap: "+gianhap);
        System.out.println("Gia ban: "+giaban);
        System.out.println("The loai:  "+loai);
        System.out.println("So luong: "+soluong);

    }
    Book(int amount) {
        soluong = amount;
    }
}
