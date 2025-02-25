package com.stanley.xie.creational.factory;

public class ChocolateBar implements Snack {
    static final int CHOCO_BAR_PRICE = 3;

    @Override
    public int getPrice() {
        return CHOCO_BAR_PRICE;
    }
}
