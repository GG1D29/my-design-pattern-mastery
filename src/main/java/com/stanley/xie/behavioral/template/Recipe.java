package com.stanley.xie.behavioral.template;

public class Recipe {

    public static void main(String[] args) {

        var vegetarianPizza = new VegetarianPizza();
        vegetarianPizza.makePizza();

        var meatFeastPizza = new MeatFeastPizza();
        meatFeastPizza.makePizza();

    }

}
