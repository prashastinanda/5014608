package com.strategy;

public class PayPalPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid " + amount + " using PayPal.");

	}

}
