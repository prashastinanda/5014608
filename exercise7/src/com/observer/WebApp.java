package com.observer;

public class WebApp implements Observer {

	private String name;

	public WebApp(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println(name + " Updated through WebApp!");
	}

}
