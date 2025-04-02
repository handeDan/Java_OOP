package com.oop.polymorphism;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with credit card.");
    }
}
