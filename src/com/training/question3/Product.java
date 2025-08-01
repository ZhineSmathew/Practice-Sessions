package com.training.question3;

public class Product {

	void itemsAvailable(String... itemNames) {
		System.out.println("Items Available:");
		for (String item : itemNames) {
			System.out.println("> " + item);
		}
	}

	void showReviews(String itemName, String... reviews) {
        System.out.println("Reviews for " + itemName + ":");
        for (String review : reviews) {
            System.out.println("> " + review);
        }
    }

}
