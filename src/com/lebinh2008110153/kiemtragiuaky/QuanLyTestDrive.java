package com.lebinh2008110153.kiemtragiuaky;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        
    DanhSachQuanLy ql = new DanhSachQuanLy();
    HocVien hv = new HocVien("Le Binh", "Quan Binh Thanh", 10, 10, 100);
    NhanVien nv = new NhanVien("Phan Thi Ngoc Thi", "Duc Linh", 100);
    KhachHang kh = new KhachHang("Con gai sau nay", "Quan 1", "Streamer ", 1000000000);
    list.themNguoi(hv);
    list.themNguoi(nv);
    list.themNguoi(kh);
    list.inDanhSach();
    }
}