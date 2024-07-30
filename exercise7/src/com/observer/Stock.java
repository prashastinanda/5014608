package com.observer;

public interface Stock {

	public abstract void register(Observer o);

	public abstract void deregister(Observer o);

	public abstract void notification();

	public abstract void display();

}
