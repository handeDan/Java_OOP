package com.oop.polymorphism;

public class PaymentSystem {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        Payment bankTransfer = new BankTransferPayment();

        checkout.processPayment(creditCard, 500.0);
        checkout.processPayment(paypal, 200.0);
        checkout.processPayment(bankTransfer, 1000);
    }
}
