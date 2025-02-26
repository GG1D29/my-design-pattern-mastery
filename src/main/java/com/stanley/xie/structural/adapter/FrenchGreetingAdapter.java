package com.stanley.xie.structural.adapter;

public class FrenchGreetingAdapter extends FrenchLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        super.sayBonjour();
    }
}
