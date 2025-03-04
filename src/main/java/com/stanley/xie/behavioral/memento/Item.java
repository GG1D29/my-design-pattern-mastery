package com.stanley.xie.behavioral.memento;

public class Item {

    private int price;

    public Item(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
