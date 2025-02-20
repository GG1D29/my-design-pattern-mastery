package com.stanley.xie.creational.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StoreItemTest {

    @Test
    void testStoreItem() {

        // Before apply design pattern:
//        var storeItem = new StoreItem(
//                "Soup", 1.5, null,
//                "A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable",
//                null, "Can");

        var storeItem =
                new StoreItem.StoreItemBuilder("Soup", 1.5)
                        .longDescription("A meal that you can warm up at home. It can come in different flavours including tomato, chicken, and vegetable")
                        .packagingType("Can").build();

        assertThat(storeItem.getName()).isEqualTo("Soup");
        assertThat(storeItem.getPackagingType()).isEqualTo("Can");
        assertThat(storeItem.getPrice()).isEqualTo(1.5);
    }

    @Test
    void testStoreItem_When_MissingMandatoryFields() {

        // Before apply design pattern:
//        assertThrows(IllegalArgumentException.class, () -> new StoreItem(
//                null, null, "A tasty snack", null, 7, null));

        assertThrows(IllegalArgumentException.class, () -> new StoreItem.StoreItemBuilder(null, null).build());
    }
}