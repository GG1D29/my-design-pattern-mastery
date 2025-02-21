package com.stanley.xie.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    @Test
    void logAnimalSound() {
        var dog = new Dog();
        dog.woof();

        var cat = new Cat();
        cat.meow();
    }
}