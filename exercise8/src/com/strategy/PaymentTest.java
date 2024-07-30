package com.strategy;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PaymentContext pc = new PaymentContext();

		// Pay using Credit Card
		PaymentStrategy cc = new CreditCardPayment();
		pc.setPaymentStrategy(cc);
		pc.pay(950);
		System.out.println("");

		// Pay using PayPal
		PaymentStrategy pp = new PayPalPayment();
		pc.setPaymentStrategy(pp);
		pc.pay(700);
	}

}
