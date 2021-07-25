package com.company;

public class BaseWallet<T extends Number> {
    private T ammount;

    public BaseWallet(Number ammount) {
        this.ammount = (T) ammount;
    }

    public Number getAmmount() {
        return ammount;
    }

    public void setAmmount(Number ammount) {
        this.ammount = (T) ammount;
    }
}

class GoldWallet extends BaseWallet<Short> {

    public GoldWallet(Short ammount) {
        super(ammount);
    }
}

class PlatinumWallet extends BaseWallet<Integer> {

    public PlatinumWallet(Integer ammount) {
        super(ammount);
    }
}

