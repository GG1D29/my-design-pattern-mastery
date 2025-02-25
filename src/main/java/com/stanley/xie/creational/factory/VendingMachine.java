package com.stanley.xie.creational.factory;

public class VendingMachine {

    Snack getSnack(String snackType) {
        return switch (snackType) {
            case "ChocolateBar" -> new ChocolateBar();
            case "Chips" -> new Chips();
            case "Drink" -> new Drink();
            default -> throw new IllegalArgumentException("No such snack type: " + snackType);
        };
    }
}
