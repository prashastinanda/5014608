package com.decorator;

public class NotoficationTest {
	public static void main(String[] args) {

		Notifier e = new EmailNotifier();
		e.send("Hello via Email!");

		System.out.println();

		Notifier eS = new SMSNotifierDecorator(new EmailNotifier());
		eS.send("Hello via Email and SMS!");

		System.out.println();

		Notifier eSS = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
		eSS.send("Hello via Email, SMS, and Slack!");
	}
}
