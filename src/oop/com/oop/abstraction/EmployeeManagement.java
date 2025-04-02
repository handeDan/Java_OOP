package com.oop.abstraction;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Hande", 50000);
        Employee freelancer = new Freelancer("Nil", 120, 50);
        Employee contractor = new Contractor("Hakan", 75000);

        fullTime.displayInfo();
        System.out.println("Salary: $" + fullTime.calculateSalary());

        System.out.println("------------------");

        freelancer.displayInfo();
        System.out.println("Salary: $" + freelancer.calculateSalary());

        System.out.println("------------------");

        contractor.displayInfo();
        System.out.println("Salary: $" + contractor.calculateSalary());
    }
}
