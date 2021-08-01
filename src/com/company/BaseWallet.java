package com.company;

public class BaseWallet<T extends Number> {
    private T ammount; // количество средств на счете


    BaseWallet(T ammount) {
        this.ammount = ammount;
    }

    public T getAmmount() {
        return ammount;
    }
}
class GoldWallet extends BaseWallet<Double> {

    public GoldWallet(Double ammount) {
        super(ammount);
    }
}

class PlatinumWallet extends BaseWallet<Double> {

    public PlatinumWallet(Double ammount) {
        super(ammount);
    }
}
