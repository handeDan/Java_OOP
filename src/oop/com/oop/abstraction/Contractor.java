package com.oop.abstraction;

public class Contractor extends Employee {
    //instance variables:
    private double contractAmount;

    //constructor:
    public Contractor(String fullName, double contractAmount) {
        super(fullName, contractAmount);
        this.contractAmount = contractAmount;
    }

    //overrided abstract method:
    @Override
    double calculateSalary() {
        return contractAmount;
    }
}
