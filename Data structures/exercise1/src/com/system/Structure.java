package com.system;

import java.util.HashMap;

public class Structure {

	private HashMap<String, Product> inventory;
	
	public Structure() {
		inventory = new HashMap<>();
	}
	
	public void addProduct(Product p) {
		inventory.put(p.getProductId(), p);
	}
	
	public void updateProduct(String id, Product p) {
		if(inventory.containsKey(id)) {
			inventory.put(id, p);
		}
		else {
			System.out.println("Not Found!!");
		}
	}
	
	public void deleteProduct(String id) {
		if(inventory.containsKey(id)) {
			inventory.remove(id);
		}
		else {
			System.out.println("Not Found!!");
		}
			
	}
	
	public Product getProduct(String id) {
		return inventory.get(id);
	}
}
