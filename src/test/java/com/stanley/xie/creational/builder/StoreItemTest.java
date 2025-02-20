package com.stanley.xie.creational.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StoreItemTest {

    @Test
    void testStoreItem() {
        StoreItem storeItem = new StoreItem("name", 1.20, "shortDesc", "desc",
                11, "boxes");

        assertThat(storeItem.getName()).isEqualTo("name");
        assertThat(storeItem.getPackagingType()).isEqualTo("boxes");
        assertThat(storeItem.getPrice()).isEqualTo(1.20);
    }

    @Test
    void testStoreItem_When_MissingMandatoryFields() {

        assertThrows(IllegalArgumentException.class, () -> new StoreItem(null, null, "shortDesc", "desc",
                11, "boxes"));
    }
}