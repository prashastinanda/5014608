package com.proxy;

public class RealImage implements Image {

	private String iurl;

	public RealImage(String iurl) {
		this.iurl = iurl;
		server(iurl);
	}

	public void server(String iurl) {
		System.out.println("Loading the image " + iurl);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying the image " + iurl);
	}

}
