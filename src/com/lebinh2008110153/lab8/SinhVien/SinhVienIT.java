package com.lebinh2008110153.lab8.SinhVien;

public class SinhVienIT extends SinhVienGD {
    private double java;
    private double css;
    private double html;

    public SinhVienIT(String hoTen, double java, double css, double html) {
        super(hoTen, hoTen);
        this.java = java;
        this.css = css;
        this.html = html;
    }
    protected double getDiem() {
        return (2*java+css+html)/4;
    }
}
