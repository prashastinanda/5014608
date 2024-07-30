package com.system;

public class Product {

	private String productId;
	private String productName;
	private int quantity;
	private double price;
	
	public Product(String id, String name, int qty, double price) {
		this.productId=id;
		this.productName=name;
		this.quantity=qty;
		this.price=price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
