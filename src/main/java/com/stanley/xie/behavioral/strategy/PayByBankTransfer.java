package com.stanley.xie.behavioral.strategy;

public class PayByBankTransfer implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made by bank transfer");
    }
}
