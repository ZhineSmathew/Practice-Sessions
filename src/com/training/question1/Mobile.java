package com.training.question1;

public class Mobile {
	String model;
	double price;
	String brand;

	public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}

	void getDetails() {
		System.out.println("Mobile Model Name " + model);
		System.out.println("Mobile price " + price);
		System.out.println("Mobile Brand " + brand);
	}

	void showFeatures(String[] features) {
		System.out.println("Features of " + model + ":");
		for (String feature : features) {
			System.out.println("Feature: " + feature);
		}
	}
}
