package com.training.question1;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Poco M2 Pro", 25000, "Vivo");
		mobile.getDetails();
		mobile.showFeatures(new String[] { "High Performances", "256 Ram" });
		System.out.println();
		Mobile mobile1 = new Mobile("Redmi", 30000, "Xavomi");
		mobile1.getDetails();
		mobile1.showFeatures(new String[] { "135MP Camera", "High Resolvation", "512 Ram" });

	}

}
