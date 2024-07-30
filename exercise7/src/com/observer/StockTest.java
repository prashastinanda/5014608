package com.observer;

public class StockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stock s1 = new StockMarket();
		Observer o1 = new MobileApp("ABC");
		Observer o2 = new WebApp("CDE");
		Observer o3 = new MobileApp("EFG");
		Observer o4 = new WebApp("GHI");
		Observer o5 = new MobileApp("IJK");
		Observer o6 = new WebApp("KLM");

		s1.register(o1);
		s1.register(o2);
		s1.register(o3);
		s1.register(o4);
		s1.register(o5);
		s1.register(o6);

		s1.notification();
		s1.deregister(o4);

		// s1.display();
	}

}
