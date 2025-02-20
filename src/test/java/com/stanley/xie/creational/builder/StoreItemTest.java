package com.stanley.xie.creational.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StoreItemTest {

    @Test
    void testStoreItem() {
        var storeItem = new StoreItem(
                "Soup", 1.5, null,
                "A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable",
                null, "Can");

        assertThat(storeItem.getName()).isEqualTo("Soup");
        assertThat(storeItem.getPackagingType()).isEqualTo("Can");
        assertThat(storeItem.getPrice()).isEqualTo(1.5);
    }

    @Test
    void testStoreItem_When_MissingMandatoryFields() {
        assertThrows(IllegalArgumentException.class, () -> new StoreItem(
                null, null, "A tasty snack", null, 7, null));
    }
}