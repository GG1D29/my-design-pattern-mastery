package com.stanley.xie.creational.singleton;

public class Dog {

    public void woof() {
        var logger = Logger.getInstance();
        logger.log("Woof");
    }

}
