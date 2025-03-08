package com.stanley.xie.behavioral.template;

public class VegetarianPizza extends Pizza {

    @Override
    public void addToppings() {
        System.out.println("Add cheese, tomato, mushrooms, peppers and olives");
    }

    @Override
    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
    }

}
