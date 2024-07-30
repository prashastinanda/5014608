package com.dependency;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public Customer findCustomerById(String id) {

		if (id.equals("1")) {
			return new Customer("1", "ABC");
		} else if (id.equals("2")) {
			return new Customer("2", "CDE");
		} else {
			return null;
		}
	}

}
