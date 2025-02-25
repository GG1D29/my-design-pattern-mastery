package com.stanley.xie.creational.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VendingMachineTest {
    private static final VendingMachine VENDING_MACHINE = new VendingMachine();

    @Test
    void getSnack() {
        Snack snack = VENDING_MACHINE.getSnack("ChocolateBar");
        assertThat(snack.getPrice()).isEqualTo(3);

        snack = VENDING_MACHINE.getSnack("Chips");
        assertThat(snack.getPrice()).isEqualTo(2);

        snack = VENDING_MACHINE.getSnack("Drink");
        assertThat(snack.getPrice()).isEqualTo(4);
    }
}