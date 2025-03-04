package com.stanley.xie.behavioral.mediator;

import lombok.Getter;

@Getter
public class PedestrianCrossingLight {

    public enum Color {
        RED, GREEN
    }

    private Color color = Color.RED;

    public void changeToRed() {
        color = Color.RED;
    }

    public void changeToGreen() {
        color = Color.GREEN;
    }

}
