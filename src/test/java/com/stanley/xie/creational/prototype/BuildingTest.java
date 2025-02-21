package com.stanley.xie.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    @Test
    void getBuildingType() {
        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(21, houseBuildingType);
        Building house2 = new Building(21, houseBuildingType);
        Building house3 = new Building(21, houseBuildingType);
        Building house4 = new Building(21, houseBuildingType);
        Building house5 = new Building(21, houseBuildingType);

        // To handle mutability, only first house will change type.
//        houseBuildingType.setType("House with yard");

        assertThat(house1.getHeightInPixels()).isEqualTo(21);
        assertThat(house1.getBuildingType().getType()).isEqualTo("House");

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