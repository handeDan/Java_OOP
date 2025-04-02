package com.oop.polymorphism;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " by bank transfer.");
    }
}
