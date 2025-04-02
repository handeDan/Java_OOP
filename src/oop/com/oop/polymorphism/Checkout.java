package com.oop.polymorphism;

public class Checkout {
    public void processPayment(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
