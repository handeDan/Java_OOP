package com.oop.interfacee;

public class LoggingSystem {
    public static void main(String[] args) {
        LoggingService fileLogger = new LoggingService(new FileLogger());
        fileLogger.log("Message 1");

        LoggingService databaseLogger = new LoggingService(new DatabaseLogger());
        databaseLogger.log("Message 2");

        LoggingService cloudLogger = new LoggingService(new CloudLogger());
        cloudLogger.log("Message 3");
    }
}
