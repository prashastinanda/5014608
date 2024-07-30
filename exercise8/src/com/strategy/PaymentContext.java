package com.strategy;

public class PaymentContext {

	private PaymentStrategy p;

	public void setPaymentStrategy(PaymentStrategy p) {
		this.p = p;
	}

	public void pay(int amount) {
		// TODO Auto-generated method stub

		if (p == null) {
			System.out.println("Payment strategy not set.");
		} else {
			p.pay(amount);
		}
	}

}
