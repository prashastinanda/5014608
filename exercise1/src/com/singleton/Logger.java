package com.singleton;

public class Logger {
	// Step 2.1: Create a private static instance of Logger
	private static Logger l = null; // static reference variable

	// Step 2.2: Make the constructor private to prevent instantiation
	private Logger() {
		// Private constructor to prevent creating object through instantiation
	}

	// Step 2.3: Provide a public static method to get the instance of Logger
	public static Logger getInstance() {
		if (l == null) {
			l = new Logger();
		}
		return l;
	}

	// method to log
	public void log(String msg) {
		System.out.println(msg);
	}

}
