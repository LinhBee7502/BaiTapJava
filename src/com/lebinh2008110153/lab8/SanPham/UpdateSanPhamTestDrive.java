package com.lebinh2008110153.lab8.SanPham;

import java.util.ArrayList;

import java.util.List;

public class UpdateSanPhamTestDrive {
    public static void main(String[] args) {
        List<UpdateSanPham> list;
        list = new ArrayList<>();
        UpdateSanPham sp = new UpdateSanPham("Crush",100);
        list.add(sp);
        for (int i = 0; i<list.size();i++) {
            UpdateSanPham up = list.get(i);
            sp.Xuat();
        }
    }
}
