package com.training.question2;

public class PaymentOptions {

	void pay(double amount) {
		System.out.println("COD " + amount);
	}

	void pay(long cardnumber, int cvv, double amount) {
		System.out.println("Pay Using Card " + cardnumber + " CVV: " + " Amount: " + amount);
	}

	void pay(String upiid, double amount) {
		System.out.println("Pay Using GPay UPI: " + upiid + " Amount: " + amount);
	}

	void pay(String bankname, String username, double amount) {
		System.out.println("Pay using NetBanking via " + bankname + " for " + username + " Amount: " + amount);
	}
}
