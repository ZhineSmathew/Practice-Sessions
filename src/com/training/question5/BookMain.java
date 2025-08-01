package com.training.question5;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book("To Kill a Mockingbird");
		book.printDetails();
		System.out.println();

		Book book1 = new Book("1984", 399);
		book1.printDetails();
		System.out.println();

		Book book2 = new Book("The Alchemist", "Paulo Coelho", 499);
		book2.printDetails();

	}
}