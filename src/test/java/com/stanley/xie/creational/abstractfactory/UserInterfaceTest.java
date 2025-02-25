package com.stanley.xie.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserInterfaceTest {

    @Test
    void getBlueUserInterface() {
        UserInterface actual = createUserInterface("BLUE");

        assertThat(actual.getButton().getColor()).isEqualTo("BLUE");
        assertThat(actual.getScrollBar().getColor()).isEqualTo("BLUE");
    }

    @Test
    void getRedUserInterface() {
        UserInterface actual = createUserInterface("RED");

        assertThat(actual.getButton().getColor()).isEqualTo("RED");
        assertThat(actual.getScrollBar().getColor()).isEqualTo("RED");
    }

    @Test
    void getGreenUserInterface() {
        assertThrows(IllegalArgumentException.class, () -> createUserInterface("GREEN"));
    }

    private UserInterface createUserInterface(String color) {
        var userInterfaceFactory = FactoryMaker.createFactory(color);
        return new UserInterface(userInterfaceFactory.createButton(), userInterfaceFactory.createScrollBar());
    }
}