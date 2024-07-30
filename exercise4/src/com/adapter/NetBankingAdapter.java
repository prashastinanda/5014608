package com.adapter;

public class NetBankingAdapter implements PaymentProcessor {

	private NetBanking net;

	public NetBankingAdapter(NetBanking net) {
		this.net = net;
	}

	public void processPayment(int amount) {
		net.pay(amount);
	}
}
