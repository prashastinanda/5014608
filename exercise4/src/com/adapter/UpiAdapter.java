package com.adapter;

public class UpiAdapter implements PaymentProcessor {

	private UpiPayment upi;

	public UpiAdapter(UpiPayment upi) {
		this.upi = upi;
	}

	public void processPayment(int amount) {
		upi.pay(amount);
	}

}
