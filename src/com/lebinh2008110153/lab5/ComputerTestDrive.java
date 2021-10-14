package com.lebinh2008110153.lab5;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.CPU("i5 10400F");
        pc.Mainboard("B460");
        pc.RAM(16);
        pc.SSD(256);
        pc.HDD(1);
        pc.VGA("GTX 1650 Super");
        pc.Nguon(500);
        pc.showComputer();
    }
}
