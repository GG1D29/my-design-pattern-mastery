package com.stanley.xie.creational.factory;

public class Drink implements Snack {
    static final int DRINK_PRICE = 4;

    @Override
    public int getPrice() {
        return DRINK_PRICE;
    }

}
