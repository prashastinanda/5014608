package com.decorator;

public class EmailNotifier implements Notifier {

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Email Notification Sent!");
	}

}
