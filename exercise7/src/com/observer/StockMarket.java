package com.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {

	private List<Observer> obs = new ArrayList<>();

	public void display() {
		System.out.println(obs);
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		obs.add(o);
	}

	@Override
	public void deregister(Observer o) {
		// TODO Auto-generated method stub
		obs.remove(o);
	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub
		for (Observer o : obs) {
			o.update();
		}
	}

}
