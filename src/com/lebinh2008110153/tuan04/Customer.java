package com.lebinh2008110153.tuan04;

import java.util.Scanner;

public class Customer {
    String name;
    String address;
    Scanner scanner = new Scanner(System.in);
    void getName() {
        System.out.print("Ho va ten khach hang : ");
        name = scanner.nextLine();
    }
    void getAdress() {
        address = scanner.nextLine();
        System.out.print("Dia chi cua khach hang : ");
    }
    void showData() {
        System.out.println("Ten khach hang: "+name);
        System.out.println("Dia chi khach hang:"+address);
    }
}
