package com.oop.interfacee;

public class DatabaseLogger implements Logger{
    @Override
    public void logMessage(String message) {
        System.out.println("Database log: " + message);
    }
}
