package com.stanley.xie.behavioral.memento;

public class Item {

    private int price;
    private ItemState state;

    public Item(int price) {
        this.price = price;
        this.state = new ItemState(price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void save() {
        state.setState(price);
    }

    public void undo() {
        price = state.getState();
    }
}
