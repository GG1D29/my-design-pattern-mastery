package com.stanley.xie.behavioral.template;

public abstract class Pizza {

    public final void makePizza() {
        makeBase();
        addToppings();
        cook();
    }

    private void makeBase() {
        System.out.println("Mix flour, yeast and salt.");
        System.out.println("Roll out the dough.");
    }

    public abstract void addToppings();

    public abstract void cook();
}
