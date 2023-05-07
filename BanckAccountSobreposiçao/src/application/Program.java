package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001,"Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println("Saque na Account: " +acc.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0,0.01);
        acc2.withdraw(200.0);
        System.out.println("Saque na SavingsAccount: " +acc2.getBalance());

        Account acc3 = new BusinessAcount(1003, "Sonia", 1000.0,500.0);
        acc3.withdraw(200.0);
        System.out.println("Saque na SavingsAccount: " +acc3.getBalance());
    }

}
