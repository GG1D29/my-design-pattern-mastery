package com.stanley.xie.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BuildingTest {

    @Test
    void getBuildingType() {
        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(21, houseBuildingType);
        Building house2 = house1.clone();
        Building house3 = house1.clone();
        Building house4 = house1.clone();
        Building house5 = house1.clone();

        // To handle mutability, only first house will change type.
        houseBuildingType.setType("House with yard");

        assertThat(house1.getHeightInPixels()).isEqualTo(21);
        assertThat(house1.getBuildingType().getType()).isEqualTo("House with yard");

        assertThat(house2.getHeightInPixels()).isEqualTo(21);
        assertThat(house2.getBuildingType().getType()).isEqualTo("House");

        assertThat(house3.getHeightInPixels()).isEqualTo(21);
        assertThat(house3.getBuildingType().getType()).isEqualTo("House");

        assertThat(house4.getHeightInPixels()).isEqualTo(21);
        assertThat(house4.getBuildingType().getType()).isEqualTo("House");

        assertThat(house5.getHeightInPixels()).isEqualTo(21);
        assertThat(house5.getBuildingType().getType()).isEqualTo("House");
    }
}