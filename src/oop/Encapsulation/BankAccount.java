package Encapsulation;

public class BankAccount {
    //instance variables:
    private double balance;

    //constructor:
    public BankAccount(double initialBalance) {
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        } else{
            this.balance = 0;
            System.out.println("Initial balance cannot be negative.");
        }
    }

    //methods:
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Deposit of $" + amount + " failed.");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Withdrawal of $" + amount + " failed.");
        }
    }

}
