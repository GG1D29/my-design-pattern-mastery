package com.stanley.xie.creational.abstractfactory;

public class FactoryMaker {

    public static UserInterfaceFactory createFactory(String color) {
        if (color.equals("RED")) {
            return new RedUserInterfaceFactory();
        } else if (color.equals("BLUE")) {
            return new BlueUserInterfaceFactory();
        } else {
            throw new IllegalArgumentException("Unknown color: " + color);
        }
    }
}
