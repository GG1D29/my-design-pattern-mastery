package com.stanley.xie.creational.singleton;

import org.junit.jupiter.api.Test;

class LoggerTest {

    @Test
    void logAnimalSound() {
        /* Output before implement Singleton Pattern:
        Logger created, is it?
        Woof
        Logger created, is it?
        Meow
         */

        var dog = new Dog();
        dog.woof();

        var cat = new Cat();
        cat.meow();
    }
}