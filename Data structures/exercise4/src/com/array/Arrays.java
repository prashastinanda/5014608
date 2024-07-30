package com.array;

public class Arrays {
	private Employee[] employees;
	private int size;

	public void addEmployee(Employee e) {
		if(size>=employees.length) {
			System.out.println("Array is Full!!");
			return;
		}
		employees[size]=e;
		size++;
	}
	
	public void searchEmployee(String id) {
		
		for(int i=0;i<size;i++) {
			if(employees[i].getEmployeeId()==id) {
				System.out.println("Employee Found!!");
			}
			else
				System.out.println("Employee Not Found!!");
		}
	}
	
	public void traverseEmployee() {
		for(int i=0;i<size;i++) {
			System.out.println(employees[i]);
		}
	}
	
	public void deleteEmployee(String id) {
		
		for(int i=0;i<size;i++) {
			if(employees[i].getEmployeeId() == id) {
				for(int j=i;j<size-1;j++) {
					employees[j] = employees[j+1];
				}
				
				employees[size - 1] = null;
				size--;
			}
		}
		
		System.out.println("Employee Deleted!!");
	}
}
