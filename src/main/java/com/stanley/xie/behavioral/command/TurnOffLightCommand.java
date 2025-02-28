package com.stanley.xie.behavioral.command;

public class TurnOffLightCommand implements LightCommand {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }
}
