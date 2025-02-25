package com.stanley.xie.creational.factory;

public class VendingMachine {

    Snack getSnack(String snackType) {
        switch (snackType) {
            case "ChocolateBar":
                return new ChocolateBar();
            case "Chips":
                return new Chips();
            case "Drink":
                return new Drink();
        }

        throw new IllegalArgumentException("No such snack type: " + snackType);
    }

}
