package com.stanley.xie.behavioral.chain;

public class EuroATM extends ATM {

    @Override
    public void dispense(WithdrawalRequest request) {
        System.out.println("Dispensing €" + request.getAmount());
    }
}
