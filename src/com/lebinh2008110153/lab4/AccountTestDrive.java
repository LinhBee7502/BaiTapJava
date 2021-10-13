package com.lebinh2008110153.lab4;

import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
            Account account = new Account();
            Employee employee = new Employee();
            Scanner scanner = new Scanner(System.in);
            int chose;
            do{
                    System.out.println("***************MENU BANK******************");
                    System.out.println(" 1. Rut, gui, them thong tin tai khoan.   ");
                    System.out.println(" 2. Nhan vien ngan hang.                  ");
                    System.out.println(" 3. Khach hang.                           ");
                    System.out.println(" Nhap so bat ky de ket thuc.              ");
                    System.out.println("******************************************");
                    System.out.print("Nhap chuc nang can thuc hien: ");
                    chose = scanner.nextInt();
                    switch(chose){
                            case 1:{
                                    int chose1;
                                    do{
                                            System.out.println("****************MENU ACCOUNT*************");
                                            System.out.println(" 1. Rut tien.                            ");
                                            System.out.println(" 2. Gui tien.                            ");
                                            System.out.println(" 3. Xem thong tin tai khoan.             ");
                                            System.out.println(" Nhap so bat ky de ket thuc.             ");
                                            System.out.println("*****************************************");
                                            System.out.print("Nhap chuc nang can thuc hien: ");
                                            chose1 = scanner.nextInt();
                                            switch(chose1){
                                                    case 1:{
                                                            System.out.print("Nhap so tien can rut: ");
                                                            int b = scanner.nextInt();
                                                            account.withdraw(b);
                                                    };break;
                                                    case 2:{
                                                            System.out.print("Nhap so tien can gui: ");
                                                            int a = scanner.nextInt();
                                                            account.deposit(a);
                                                    };break;
                                                    case 3:{
                                                            account.showData();
                                                            System.out.print("Nhap so bat ky de quay ve menu: ");
                                                            int i = scanner.nextInt();
                                                    }
                                            }  
                                    }while(chose1 > 0 && chose1 < 4);
                            };break;
                            case 2:{
                                int chose2;
                                do{
                                            System.out.println("***************MENU EMPLOYEE*************");
                                            System.out.println(" 1. Nhap ten nhan vien.                  ");
                                            System.out.println(" 2. Nhap luong.                          ");
                                            System.out.println(" 3. Xem thong tin nhan vien.             ");
                                            System.out.println(" Nhap so bat ky de ket thuc.             ");
                                            System.out.println("*****************************************");
                                            System.out.print("Nhap chuc nang can thuc hien: ");
                                            chose2 = scanner.nextInt();
                                switch(chose2){
                                    case 1:employee.getName();break;
                                    case 2:employee.getSalary();break;
                                    case 3:{
                                        employee.showData();
                                        System.out.print("Nhap so bat ky de quay ve menu: ");
                                        int i = scanner.nextInt();
                            }                                                        
                        }                                                
                    }while(chose2>0 && chose2 <4);
                }
            }                    
        }while(chose > 0 && chose < 4);
    }
}

