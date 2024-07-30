package com.adapter;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpiPayment u = new UpiPayment();
		PaymentProcessor p1 = new UpiAdapter(u);
		p1.processPayment(950);

		NetBanking n = new NetBanking();
		PaymentProcessor p2 = new NetBankingAdapter(n);
		p2.processPayment(700);

		DebitCard d = new DebitCard();
		PaymentProcessor p3 = new DebitCardAdapter(d);
		p3.processPayment(560);

	}

}
