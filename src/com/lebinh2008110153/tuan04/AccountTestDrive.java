package com.lebinh2008110153.tuan04;

import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.print("So tien ban muon gui: ");
        int a = scanner.nextInt();
        account.deposit(a);
        account.showData();
        System.out.print("So tien ban muon rut: ");
        int b = scanner.nextInt();
        account.withdraw(b);
        account.showData();
    }
}

