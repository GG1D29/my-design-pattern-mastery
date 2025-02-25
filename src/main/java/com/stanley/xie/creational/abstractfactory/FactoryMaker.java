package com.stanley.xie.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static final Map<String, Supplier<UserInterfaceFactory>> userInterfaceFactories = new HashMap<>();

    static {
        userInterfaceFactories.put("BLUE", BlueUserInterfaceFactory::new);
        userInterfaceFactories.put("RED", RedUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String color) {
        if (userInterfaceFactories.containsKey(color)) {
            return userInterfaceFactories.get(color).get();
        }

        throw new IllegalArgumentException("Unknown color: " + color);
    }
}
