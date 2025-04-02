package com.oop.interfacee;

public class FileLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Logging message to file: " + message);
    }
}
