package com.lebinh2008110153.lab5;

import java.util.Scanner;

public class Computer {
    Scanner scanner = new Scanner(System.in);
    int ram,nguon,ssd,hdd;
    String cpu,vga,main;
    void CPU(String x) {
        cpu = x;
    }
    void Mainboard(String x) {
        main = x;
    }
    void RAM(int x) {
        ram = x;
    }
    void SSD(int x) {
        ssd = x;
    }
    void HDD(int x) {
        hdd = x;
    }
    void Nguon(int x) {
        nguon = x;
    }
    void VGA(String x) {
        vga = x;
    }
    void showComputer() {
        System.out.println("CPU: "+cpu);
        System.out.println("Mainboard: "+main);
        System.out.println("RAM: "+ram+"GB");
        System.out.println("SSD: "+ssd+"GB");
        System.out.println("HDD: "+hdd+"GB");
        System.out.println("VGA: "+vga);
        System.out.println("Nguon: "+nguon+"W");

    }
}

