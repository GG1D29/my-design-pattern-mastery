package com.stanley.xie.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private int price;
    private ItemState state;

    public Item(int price) {
        this.price = price;
        this.state = new ItemState(price);
    }

    public void save() {
        state.setState(price);
    }

    public void undo() {
        price = state.getState();
    }
}
