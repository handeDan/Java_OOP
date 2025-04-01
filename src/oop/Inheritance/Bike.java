package Inheritance;

public class Bike extends Vehicle {
    //instance variables:
    boolean hasHelmet;

    //constructor:
    public Bike(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    //methods:
    public void wheelie() {
        System.out.println(brand + " is doing a wheelie!");
    }
}
