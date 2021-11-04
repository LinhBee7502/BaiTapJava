package com.lebinh2008110153.kiemtragiuaky;

public class KhachHang extends Nguoi {
    protected String tenCongTy;
    protected double triGiaHoaDon;

    public KhachHang(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
    @Override
    public String toString() {
        return super.toString() + " " + tenCongTy + " " + triGiaHoaDon + "Dong";
    }

}
