package com.lebinh2008110153.lab8.SanPham;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public double getThueNhapKhau() {
        double thue;
        thue = (donGia*10)/100;
        return thue;
    }
    protected void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap so tien giam: ");
        giamGia = scanner.nextDouble();
    }
    protected void Xuat() {
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Don gia: "+donGia);
        System.out.println("Giam gia: "+giamGia);
        System.out.println("Thue nhap khau: "+getThueNhapKhau()+"$");
    }
}
