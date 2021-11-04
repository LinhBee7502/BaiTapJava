package com.lebinh2008110153.lab8.SinhVien;

public class SinhVienGD {
    private String hoTen;
    private String nganh;

    public SinhVienGD(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    protected double getDiem() {
        return getDiem();
    }
    protected void getHocLuc() {
        if (getDiem()<5)
            System.out.println("Hoc luc yeu");
        else 
                if (getDiem()>=5 && getDiem() <=6.5)
                    System.out.println("Hoc luc trung binh");
                else 
                    if (getDiem() >= 6.5 && getDiem() <= 7.5)
                        System.out.println("Hoc luc kha");
                    else
                        if (getDiem()>= 7.5 && getDiem() <= 9)
                            System.out.println("Hoc sinh gioi");
                        else 
                            if (getDiem() > 9 )
                                System.out.println("Hoc sinh xuat sac");
    }
}
