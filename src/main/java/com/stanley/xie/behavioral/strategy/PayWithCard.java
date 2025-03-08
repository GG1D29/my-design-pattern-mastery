package com.stanley.xie.behavioral.strategy;

public class PayWithCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made with card");
    }
}
