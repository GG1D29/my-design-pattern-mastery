package com.stanley.xie.behavioral.chain;

public abstract class ATM {
    protected final ATM nextATM;

    public ATM(ATM nextATM) {
        this.nextATM = nextATM;
    }

    public abstract void dispense(WithdrawalRequest request);

}
