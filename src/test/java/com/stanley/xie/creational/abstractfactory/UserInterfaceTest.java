package com.stanley.xie.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserInterfaceTest {

    @Test
    void getBlueUserInterface() {
        UserInterfaceApp app = new UserInterfaceApp();
        UserInterface actual = app.createUserInterface("BLUE");

        Button actualButton = actual.getButton();
        assertThat(actualButton.getColor()).isEqualTo("BLUE");

        ScrollBar actualScrollBar = actual.getScrollBar();
        assertThat(actualScrollBar.getColor()).isEqualTo("BLUE");
    }

    @Test
    void getRedUserInterface() {
        UserInterfaceApp app = new UserInterfaceApp();
        UserInterface actual = app.createUserInterface("RED");

        Button actualButton = actual.getButton();
        assertThat(actualButton.getColor()).isEqualTo("RED");

        ScrollBar actualScrollBar = actual.getScrollBar();
        assertThat(actualScrollBar.getColor()).isEqualTo("RED");
    }

    @Test
    void getGreenUserInterface() {
        UserInterfaceApp app = new UserInterfaceApp();
        assertThrows(IllegalArgumentException.class, () -> app.createUserInterface("GREEN"));
    }
}