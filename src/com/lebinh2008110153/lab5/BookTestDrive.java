package com.lebinh2008110153.lab5;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book1 = new Book(200);
        book1.getGiaBan(10000);
        book1.getGiaNhap(7000);
        book1.getLoai("Sach giao khoa");
        book1.getNhaXuatBan("Bo GD&DT");
        book1.getNamXuatBan(2021);
        book1.getSoLuong(100);
        book1.bookshow();
    }
}
