package com.stanley.xie.structural.adapter.duck;

public class DroneAdapter implements Duck {
    private final Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        drone.spinRotors();
        drone.takeOff();
    }
}
