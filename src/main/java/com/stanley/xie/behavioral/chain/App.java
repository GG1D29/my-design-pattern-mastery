package com.stanley.xie.behavioral.chain;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildATM();
        atm.dispense(request);
    }

    private static ATM buildATM() {
        var nextATM = new EuroATM(null);
        var ATM = new UsDollarATM(nextATM);

        return ATM;
    }

}
