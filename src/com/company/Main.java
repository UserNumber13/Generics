package com.company;

public class Main {

    public static void main(String[] args) {
	BaseWallet <Double> goldWallet=new GoldWallet(400.0);
	BaseWallet <Double> platinumWallet=new PlatinumWallet(200.0);

	TransactionUtil tran=new TransactionUtil();

	TransactionUtil.executeTransaction(goldWallet.getAmmount(), platinumWallet.getAmmount(), 30.0); //перевод с GoldWallet на PlatinumWallet
//			TransactionUtil.executeTransaction(platinumWallet.getAmmount(), goldWallet.getAmmount(), 30.0); //перевод с PlatinumWallet на GoldWallet
   }
}