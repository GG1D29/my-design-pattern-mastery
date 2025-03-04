package com.stanley.xie.behavioral.mediator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrafficLightTest {
    private static TrafficLightMediator trafficLightMediator;

    @BeforeAll
    static void init() {
        trafficLightMediator = new TrafficLightMediator(new TrafficLight(), new PedestrianCrossingLight());
    }

    @Test
    void changeToRed() {
        trafficLightMediator.changeToRed();

        assertThat(trafficLightMediator.getTrafficLight().getColor()).isEqualTo(TrafficLight.Color.RED);
        assertThat(trafficLightMediator.getPedestrianCrossingLight().getColor()).isEqualTo(PedestrianCrossingLight.Color.GREEN);
    }

    @Test
    void changeToAmber() {
        trafficLightMediator.changeToAmber();

        assertThat(trafficLightMediator.getTrafficLight().getColor()).isEqualTo(TrafficLight.Color.AMBER);
    }

    @Test
    void changeToGreen() {
        trafficLightMediator.changeToGreen();

        assertThat(trafficLightMediator.getTrafficLight().getColor()).isEqualTo(TrafficLight.Color.GREEN);
        assertThat(trafficLightMediator.getPedestrianCrossingLight().getColor()).isEqualTo(PedestrianCrossingLight.Color.RED);
    }
}