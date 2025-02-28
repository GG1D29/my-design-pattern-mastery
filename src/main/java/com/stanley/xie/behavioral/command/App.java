package com.stanley.xie.behavioral.command;

public class App {

    /*
    Expected output in console:
        Light is off.
        Light is on.
        Light is off.
     */
    public static void main(String[] args) {
        var light = new Light();
        light.isOn();

        var commandExecutor = new LightCommandExecutor();
        commandExecutor.execute(new TurnOnLightCommand(light));
        light.isOn();

        commandExecutor.execute(new TurnOffLightCommand(light));
        light.isOn();
    }
}
