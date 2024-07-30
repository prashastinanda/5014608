package com.dependency;

public class Customerservice {

	private CustomerRepository c;

	public Customerservice(CustomerRepository c) {
		this.c = c;
	}

	public Customer getCustomerById(String id) {
		return c.findCustomerById(id);
	}
}
