package com.oop.composition;

public class Bus {
    //instance variables:
    private String brand;
    private int speed;
    private Engine engine;

    //constructor:
    public Bus(String brand, int speed, Engine engine) {
        this.brand = brand;
        this.speed = speed;
        this.engine = engine;
    }

    //methods:
    public void startBus() {
        System.out.println(brand + " is starting...");
        engine.start();
    }
}
