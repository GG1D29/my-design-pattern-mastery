package com.stanley.xie.creational.factory;

public class Chips implements Snack {
    static final int CHIPS_PRICE = 2;

    @Override
    public int getPrice() {
        return CHIPS_PRICE;
    }

}
