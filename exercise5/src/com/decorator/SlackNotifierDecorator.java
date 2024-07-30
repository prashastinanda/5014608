package com.decorator;

public class SlackNotifierDecorator extends NotifierDecorator {

	public SlackNotifierDecorator(Notifier n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void send(String msg) {

		super.send(msg);
		slack(msg);
	}

	private void slack(String msg) {

		System.out.println("Slack message " + msg + " sent");
	}
}
