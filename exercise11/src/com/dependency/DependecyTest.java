package com.dependency;

public class DependecyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerRepository cr = new CustomerRepositoryImpl();

		// Inject repository into service
		Customerservice cs = new Customerservice(cr);

		// Use service to find a customer
		Customer c = cs.getCustomerById("1");
		if (c != null) {
			System.out.println("Customer ID: " + c.getId());
			System.out.println("Customer Name: " + c.getName());
		} else {
			System.out.println("Customer not found.");
		}
	}

}
