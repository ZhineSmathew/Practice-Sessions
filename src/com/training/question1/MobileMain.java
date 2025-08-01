package com.training.question1;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Poco M2 Pro", 25000, "Vivo");
		mobile.getDetails();
		String[] features1 = mobile.showFeatures(new String[] { "High Performances", "256 Ram" });
		for (String feature : features1) {
			System.out.println("Feature: " + feature);
		}
		System.out.println();
		Mobile mobile1 = new Mobile("Redmi", 30000, "Xavomi");
		mobile1.getDetails();
		String[] features2 = mobile.showFeatures(new String[] { "135MP Camera", "High Resolvation", "512 Ram" });
		for (String feature : features2) {
			System.out.println(feature);
		}

	}

}
