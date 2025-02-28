package com.stanley.xie.behavioral.command;

public class TurnOnLightCommand implements LightCommand {
    private final Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }
}
