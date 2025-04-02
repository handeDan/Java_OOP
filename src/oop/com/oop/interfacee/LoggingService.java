package com.oop.interfacee;

public class LoggingService {
    //instance variables:
    private Logger logger;

    //constructor:
    public LoggingService(Logger logger) {
        this.logger = logger;
    }

    //methods:
    public void log(String message) {
        logger.logMessage(message);
    }
}
