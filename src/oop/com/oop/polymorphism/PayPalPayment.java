package com.oop.polymorphism;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("PayPal payment of $" + amount + " successful.");
    }
}
