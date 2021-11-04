package com.lebinh2008110153.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLy {
    private ArrayList <Object> list = new ArrayList<Object>();
    public void themNguoi(Object object) {
        list.add(object);
    }
    public void inDanhSach() {
        for (Object ob: list) {
            System.out.println(ob.toString());
        }
    }
}
