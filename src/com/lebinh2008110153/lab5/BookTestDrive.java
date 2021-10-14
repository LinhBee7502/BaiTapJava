package com.lebinh2008110153.lab5;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book1 = new Book(200);
        book1.GiaBan(10000);
        book1.GiaNhap(7000);
        book1.Loai("Sach giao khoa");
        book1.NhaXuatBan("Bo GD&DT");
        book1.NamXuatBan(2021);
        book1.SoLuong(100);
        book1.bookshow();
    }
}
