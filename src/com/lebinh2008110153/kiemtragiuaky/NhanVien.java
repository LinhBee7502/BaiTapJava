package com.lebinh2008110153.kiemtragiuaky;

public class NhanVien extends Nguoi {
    private float heSoLuong;
    
    public NhanVien(String hoTen, String diaChi, float heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }
    public float tinhLuong() {
        return heSoLuong*1500000;
    }
    @Override
    public String toString() {
        return super.toString() + " " + tinhLuong() + "Dong";
    }
}
