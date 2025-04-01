package Inheritance;

public class Vehicle {
    //instance variables:
    String brand;
    int speed;

    //constructor:
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    //methods:
    public void move() {
        System.out.println(brand + " is moving at " + speed + " km/h.");
    }
}
