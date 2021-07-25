package com.company;

public class Main {

    public static void main(String[] args) {
	GoldWallet goldWallet=new GoldWallet(200);
	PlatinumWallet platinumWallet=new PlatinumWallet(300);
        System.out.println(goldWallet.getAmmount());
        System.out.println(platinumWallet.getAmmount());

    }
}
