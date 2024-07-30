package com.sort;

public class QuickSort {

	public void sort(Order[] orders) {
		
		quicksort(orders, 0, orders.length-1);
	}
	
	void quicksort(Order[] orders, int first, int last) {
		
		if(first< last) {
			
			int p = partition(orders, first, last);
			quicksort(orders, first, p-1);
			quicksort(orders, p+1, last);
		}
	}
	
	int partition(Order[] orders, int first, int last) {
		
		int pivot = orders[last].getTotalPrice();
		int i = first-1;
		
		for(int j=first; j<last; j++) {
			
			if(orders[j].getTotalPrice()<pivot) {
				
				i++;
				Order temp = orders[i];
				orders[i] = orders[j];
				orders[j] = temp;
			}
		}
		
		Order temp = orders[i+1];
		orders[i+1] = orders[last];
		orders[last] = temp;
		
		return i+1;
	}
}
