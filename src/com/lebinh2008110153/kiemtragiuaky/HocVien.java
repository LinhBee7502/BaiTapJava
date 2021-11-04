package com.lebinh2008110153.kiemtragiuaky;

public class HocVien extends Nguoi {
    protected float diemMonhoc1;
    protected float diemMonhoc2;
    protected static int soLuongHV;

    public HocVien(String hoTen, String diaChi, float diemMonhoc1, float diemMonhoc2,int soLuongHV) {
        super(hoTen, diaChi);
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
        this.soLuongHV = soLuongHV;   
    }
    protected float diemTB() {
        return (diemMonhoc1+diemMonhoc2)/2;
    }
    @Override
    public String toString() {
        return super.toString() + " " +diemMonhoc1 + " " + diemMonhoc2 + "Diem trung binh mon: " + diemTB();
    }
}
