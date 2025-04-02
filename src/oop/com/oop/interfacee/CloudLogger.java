package com.oop.interfacee;

public class CloudLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Logging message to cloud: " + message);
    }
}
