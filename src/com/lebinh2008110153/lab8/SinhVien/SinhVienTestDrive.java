package com.lebinh2008110153.lab8.SinhVien;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVienIT it = new SinhVienIT("Le Binh",7,8,9);
        it.getDiem();
        it.getHocLuc();

        SinhVienKT kt = new SinhVienKT("Crush em",9,9);
        kt.getDiem();
        kt.getHocLuc();
    }
}