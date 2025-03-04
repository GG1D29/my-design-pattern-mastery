package com.stanley.xie.behavioral.mediator;

import lombok.Getter;

@Getter
public class TrafficLight {

    public enum Color {
        RED, AMBER, GREEN
    }

    private Color color = Color.RED;

    public void changeToRed() {
        color = Color.RED;
    }

    public void changeToAmber() {
        color = Color.AMBER;
    }

    public void changeToGreen() {
        color = Color.GREEN;
    }

}
