package com.search;

public class LinearSearch {

	 private Book[] books;
	 private int size;
	 
	 public Book linearSearchByTitle(String title) {
	        for (int i = 0; i < size; i++) {
	            if (books[i].getTitle().equalsIgnoreCase(title)) {
	                return books[i];
	            }
	        }
	        return null;
	    }
}
