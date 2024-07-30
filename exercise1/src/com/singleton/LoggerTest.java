package com.singleton;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l1 = Logger.getInstance();
		l1.log("l1 message is created");

		Logger l2 = Logger.getInstance();
		l1.log("l2 message is created");

		System.out.println(l1 == l2);
	}

}
