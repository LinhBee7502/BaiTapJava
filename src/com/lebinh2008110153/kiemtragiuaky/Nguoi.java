package com.lebinh2008110153.kiemtragiuaky;

public class Nguoi {
    protected String hoTen;
    protected String diaChi;

    public Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    @Override
    public String toString() {
        return hoTen + " " + diaChi;
    }
}  
