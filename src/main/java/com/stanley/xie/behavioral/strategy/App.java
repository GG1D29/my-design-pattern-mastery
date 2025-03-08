package com.stanley.xie.behavioral.strategy;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.payForItems(new PayWithCard());
        checkoutPage.payForItems(new PayByBankTransfer());

    }

}
