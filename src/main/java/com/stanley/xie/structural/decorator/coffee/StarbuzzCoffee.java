package com.stanley.xie.structural.decorator.coffee;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        // Should print out:
        // Dark Roast Coffee, Mocha, Mocha, Whip $1.49
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
