package com.stanley.xie.behavioral.command;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        light.isOn();
        light.turnOnLight();
        light.isOn();
        light.turnOffLight();
        light.isOn();
    }

}
