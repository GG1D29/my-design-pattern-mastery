package com.stanley.xie.creational.singleton;

public class Cat {

    public void meow() {
        var logger = Logger.getInstance();
        logger.log("Meow");
    }

}
