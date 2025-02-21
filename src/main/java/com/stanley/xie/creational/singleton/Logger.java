package com.stanley.xie.creational.singleton;

public class Logger {

    public Logger() {
        System.out.println("Logger created, is it?");
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
