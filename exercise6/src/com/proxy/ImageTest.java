package com.proxy;

public class ImageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Image i1 = new ProxyImage("pictures to burn");
		Image i2 = new ProxyImage("Family Photo Album");

		i1.display();
		System.out.println();

		i2.display();
		System.out.println();

		i1.display();
		System.out.println();

		i2.display();
	}

}
