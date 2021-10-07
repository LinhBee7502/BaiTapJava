package com.lebinh2008110153.tuan04;

public class Account {
    int account_number;
    int account_balance;
    public void showData() {
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Balance: "+account_balance);
    }
    void deposit(int amount) {
        account_number += amount;
        System.out.println("Account Number: "+account_number);
    }
    void withdraw(int amount) {
        account_balance -= amount;
        System.out.println("Account Balance: "+account_balance);
    }
}
