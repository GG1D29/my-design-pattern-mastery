package com.stanley.xie.behavioral.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrafficLightTest {
    TrafficLight trafficLight;
    PedestrianCrossingLight pedestrianCrossingLight;

    @BeforeEach
    void init() {
        trafficLight = new TrafficLight();
        pedestrianCrossingLight = new PedestrianCrossingLight();
    }

    @Test
    void changeToRed() {
        trafficLight.changeToRed(pedestrianCrossingLight);
        assertThat(trafficLight.getColor()).isEqualTo(TrafficLight.Color.RED);
        assertThat(pedestrianCrossingLight.getColor()).isEqualTo(PedestrianCrossingLight.Color.GREEN);
    }

    @Test
    void changeToAmber() {
        trafficLight.changeToAmber();
        TrafficLight.Color actual = trafficLight.getColor();
        assertThat(actual).isEqualTo(TrafficLight.Color.AMBER);
    }

    @Test
    void changeToGreen() {
        trafficLight.changeToGreen(pedestrianCrossingLight);
        assertThat(trafficLight.getColor()).isEqualTo(TrafficLight.Color.GREEN);
        assertThat(pedestrianCrossingLight.getColor()).isEqualTo(PedestrianCrossingLight.Color.RED);
    }
}