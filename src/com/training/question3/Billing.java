package com.training.question3;

public class Billing {
	public static void main(String[] args) {
		Product product = new Product();
		product.itemsAvailable("Food And Vegetable", "Frozen items", "Biscuits");

        product.showReviews("Frozen items", "Very fresh", "Tasty", "Affordable");
	}

}
