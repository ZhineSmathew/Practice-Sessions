package com.training.question5;

public class Book {
	String title;
	String author;
	int bookId;
	int price;

	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void printDetails() {
		if (title != null)
			System.out.println("Title: " + title);
		if (author != null)
			System.out.println("Author: " + author);
		if (price != 0)
			System.out.println("Price: " + price);
		if (bookId != 0)
			System.out.println("Book Id: " + bookId);
	}

}
