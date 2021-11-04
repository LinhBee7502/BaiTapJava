package com.lebinh2008110153.lab8.SinhVien;

public class SinhVienKT extends SinhVienGD {
    private double marketing;
    private double sales;

    public SinhVienKT(String hoTen, double marketing, double sales) {
        super(hoTen, hoTen);
        this.marketing = marketing;
        this.sales = sales;
    }
    protected double getDiem() {
        return (2*marketing+sales)/3;
    }
}
