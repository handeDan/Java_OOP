package com.oop.abstraction;

public class FullTimeEmployee extends Employee{
    //constructor:
    public FullTimeEmployee(String fullName, double salary) {
        super(fullName, salary);
    }

    //overrided abstract method:
    @Override
    double calculateSalary() {
        return salary;
    }
}
