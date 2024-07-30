package com.proxy;

public class ProxyImage implements Image {

	private String iurl;
	private Image img;

	public ProxyImage(String iurl) {
		this.iurl = iurl;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (img == null) {
			img = new RealImage(iurl);
		}
		img.display();
	}

}
