package com.stanley.xie.structural.adapter.duck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        testDuck(duck);

        System.out.println();

        //Challenge:
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
