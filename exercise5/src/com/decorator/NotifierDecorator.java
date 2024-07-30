package com.decorator;

public class NotifierDecorator implements Notifier {

	private Notifier n;

	public NotifierDecorator(Notifier n) {
		this.n = n;
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		n.send(msg);
	}

}
