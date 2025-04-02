package com.oop.abstraction;

abstract class Employee {
    //instance variables:
    protected String fullName;
    protected double salary;

    //constructor:
    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    //methods:
    public void displayInfo() {
        System.out.println("Employee : " + fullName);
    }

    //abstract method:
    abstract double calculateSalary();
}
