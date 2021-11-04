package com.lebinh2008110153.lab8.Shape;

public class ChuNhat {
    private double dai;
    private double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    protected double getChuVi() {
        return (dai+rong)*2;
    }
    protected double getDienTich() {
        return dai*rong;
    }
    protected double getDai() {
        return dai;
    }
    protected double getRong() {
        return rong;
    }
    void xuat() {
        System.out.println("Chieu dai: "+dai);
        System.out.println("Chieu rong: "+ rong);
        System.out.println("Chu vi: ("+ dai +"+"+rong+")*2 = "+getChuVi());
        System.out.println("Dien tich: "+dai +"*"+rong+"= "+getDienTich());
    }
}
