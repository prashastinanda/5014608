package com.search;

public class Book {

	private String bookId;
	private String title;
	private String author;
	
	public Book(String id, String title, String author) {
		this.bookId=id;
		this.title=title;
		this.author=author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
