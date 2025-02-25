package com.stanley.xie.creational.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VendingMachineTest {
    private static final VendingMachine VENDING_MACHINE = new VendingMachine();

    @Test
    void getSnack() {
        Snack snack = VENDING_MACHINE.getSnack("ChocolateBar");
        assertThat(snack.getPrice()).isEqualTo(ChocolateBar.CHOCO_BAR_PRICE);

        snack = VENDING_MACHINE.getSnack("Chips");
        assertThat(snack.getPrice()).isEqualTo(Chips.CHIPS_PRICE);

        snack = VENDING_MACHINE.getSnack("Drink");
        assertThat(snack.getPrice()).isEqualTo(Drink.DRINK_PRICE);
    }

    @Test
    void getSnack_NotSupported() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> VENDING_MACHINE.getSnack("Chiki"));
        assertThat(e.getMessage()).isEqualTo("No such snack type: Chiki");
    }
}