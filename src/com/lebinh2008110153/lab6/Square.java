package com.lebinh2008110153.lab6;

public class Square {
    String sound = "ting ting";
    boolean click = false;

    void xoay() {
        System.out.println("Hinh vuong");
        System.out.println("- Xoay 360 do ");
        click = true;

    }
    void playSound() {
        if (click=true) {
            System.out.println("- Phat am thanh hinh vuong: "+sound+"\n");
        }
        else {
            System.out.println("Bi loi he thong!!! ");
        }
    }
}


