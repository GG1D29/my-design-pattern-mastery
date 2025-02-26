package com.stanley.xie.structural.adapter;

public class FrenchGreetingAdapter implements LocalizedMessage {
    private final FrenchLocalizedMessage frenchLocalizedMessage;

    public FrenchGreetingAdapter() {
        this.frenchLocalizedMessage = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        frenchLocalizedMessage.sayBonjour();
    }
}
