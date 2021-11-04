package com.lebinh2008110153.lab8.Shape;

public class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }
    protected double getChuVi() {
        return getDai() * 4;
    }
    protected double getDienTich() {
        return Math.pow(2, getDai());
    }
    protected void xuat() {
        System.out.println("Canh: "+ getDai());
        System.out.println("Chu vi : "+ getDai()+"* 4 = "+ getChuVi());
        System.out.println("Dien tich: " + getDai() + getDai() +" = "+ getDienTich());
    }
}
