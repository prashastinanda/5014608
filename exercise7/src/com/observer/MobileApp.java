package com.observer;

public class MobileApp implements Observer {

	private String name;

	public MobileApp(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println(name + " Updated through MobileApp!");
	}

}
