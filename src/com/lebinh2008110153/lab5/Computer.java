package com.lebinh2008110153.lab5;

import java.util.Scanner;

public class Computer {
    Scanner scanner = new Scanner(System.in);
    int ram,nguon,ssd,hdd;
    String cpu,vga,main;
    void CPU() {
        System.out.print("CPU: ");
        cpu = scanner.nextLine();

    }
    void Mainboard() {
        System.out.print("Mainboard: ");
        main = scanner.nextLine();
    }
    void RAM() {
        System.out.print("RAM: ");
        ram = scanner.nextInt();
    }
    void SSD() {
        System.out.print("SSD: ");
        ssd = scanner.nextInt();
    }
    void HDD() {
        System.out.print("HDD: ");
        hdd = scanner.nextInt();
    }
    void VGA() {
        System.out.print("VGA: ");
        vga = scanner.nextLine();
    }
    void Nguon() {
        System.out.print("Nguon: ");
        nguon = scanner.nextInt();
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

