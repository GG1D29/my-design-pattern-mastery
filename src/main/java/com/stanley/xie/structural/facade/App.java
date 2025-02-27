package com.stanley.xie.structural.facade;

public class App {

    public static void main(String[] args) {

        var client = new MessageFacade();
        client.sendMessage();

    }

}
