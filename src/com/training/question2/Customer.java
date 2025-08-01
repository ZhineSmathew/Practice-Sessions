package com.training.question2;

public class Customer {

	public static void main(String[] args) {
		PaymentOptions paymentOptions = new PaymentOptions();
		paymentOptions.pay(4021.24);
		paymentOptions.pay(9876543212345678L, 231, 10000.00);
		paymentOptions.pay("shine@okicici", 35000.00);
		paymentOptions.pay("ABX bank", "Shine S", 45000);
	}

}
