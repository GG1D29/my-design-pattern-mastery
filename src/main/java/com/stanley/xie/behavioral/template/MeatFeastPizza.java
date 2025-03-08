package com.stanley.xie.behavioral.template;

public class MeatFeastPizza extends Pizza {

    @Override
    public void addToppings() {
        System.out.println("Add pepperoni, ham and chicken");
    }

    @Override
    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
    }

}
