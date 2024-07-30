package com.adapter;

public class DebitCardAdapter implements PaymentProcessor {

	private DebitCard debit;

	public DebitCardAdapter(DebitCard debit) {

		this.debit = debit;
	}

	public void processPayment(int amount) {

		debit.pay(amount);
	}
}
