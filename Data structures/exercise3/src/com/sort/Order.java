package com.sort;

public class Order {

	private String orderId;
	private String customerName;
	private int totalPrice;
	
	public Order(String id, String name, int price) {
		this.orderId=id;
		this.customerName=name;
		this.totalPrice=price;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
