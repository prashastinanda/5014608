package com.decorator;

public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void send(String msg) {

		super.send(msg);
		sms(msg);
	}

	private void sms(String msg) {
		System.out.println("SMS message " + msg + " sent.");
	}
}
