package com.oop.inheritance;

public class Car extends Vehicle {
    //instance variables:
    int doors;

    //constructor:
    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    //methods:
    public void honk() {
        System.out.println("Honk Honk!");
    }
}
