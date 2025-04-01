package com.oop.composition;

public class Engine {
    //instance variables:
    private String type;
    private int horsePower;

    //constructor:
    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    //methods:
    public void start() {
        System.out.println("Engine started with " + type + " and " + horsePower + " horsepower.");
    }
}
