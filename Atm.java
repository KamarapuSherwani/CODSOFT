package task3;

import java.util.Scanner;

class Atm {
    BankAcc acc;

    public Atm(BankAcc acc) {
        this.acc = acc;
    }

    public synchronized void withdraw(int amount) {
        if (amount > acc.getBalance()) {
            System.out.println("Low balance: can't withdraw!");
            System.out.println("Waiting to deposit.....!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        acc.setBalance(acc.getBalance() - amount);
        System.out.println("Available balance after withdraw is: " + acc.getBalance());
        System.out.println("Withdraw success!");
    }

    public synchronized void deposit(int amount) {
        System.out.println("Going to deposit the amount!");
        acc.setBalance(acc.getBalance() + amount);
        System.out.println("Amount after deposit is: " + acc.getBalance());
        System.out.println("Deposit success!");
        notify();
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + acc.getBalance());
    }
}
