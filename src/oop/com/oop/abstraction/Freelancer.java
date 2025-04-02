package com.oop.abstraction;

public class Freelancer extends Employee {
    //instance variables:
    private int hoursWorked;
    private double hourlyRate;

    //constructor:
    public Freelancer(String fullName, int hoursWorked, double hourlyRate) {
        super(fullName, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    //overrided abstract method:
    @Override
    double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}
