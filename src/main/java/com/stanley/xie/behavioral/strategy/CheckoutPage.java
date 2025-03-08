package com.stanley.xie.behavioral.strategy;

public class CheckoutPage {

    public void payForItems(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }

}
