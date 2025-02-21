package com.stanley.xie.creational.singleton;

public enum Logger {
    INSTANCE;

    Logger() {
        System.out.println("Logger created once, is it?");
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }

}
