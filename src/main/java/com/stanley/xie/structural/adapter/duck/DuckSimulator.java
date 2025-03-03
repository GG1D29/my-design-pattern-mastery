package com.stanley.xie.structural.adapter.duck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        testDuck(duck);

        //Challenge:
        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        //testDuck(turkey); will failed to compile
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
