package com.search;

public class Product {

	private String productId;
	private String productName;
	private String category;
	
	public Product(String id, String name, String category) {
		this.productId=id;
		this.productName=name;
		this.category=category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
