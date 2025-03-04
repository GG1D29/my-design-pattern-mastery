package com.stanley.xie.behavioral.mediator;

import lombok.Getter;

@Getter
public class TrafficLightMediator {
    private final TrafficLight trafficLight;
    private final PedestrianCrossingLight pedestrianCrossingLight;

    public TrafficLightMediator(TrafficLight trafficLight, PedestrianCrossingLight pedestrianCrossingLight) {
        this.trafficLight = trafficLight;
        this.pedestrianCrossingLight = pedestrianCrossingLight;
    }

    public void changeToGreen() {
        trafficLight.changeToGreen();
        pedestrianCrossingLight.changeToRed();
    }

    public void changeToRed() {
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeToAmber() {
        trafficLight.changeToAmber();
    }

}
