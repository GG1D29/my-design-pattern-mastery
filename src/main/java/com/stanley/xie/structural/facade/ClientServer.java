package com.stanley.xie.structural.facade;

public class ClientServer {

    public void authenticateClient() {
        Authenticator authenticator = new Authenticator();
        authenticator.authenticate();
    }

    public void routeToRecipient() {
        System.out.println("Routing to recipient...");
    }

}
