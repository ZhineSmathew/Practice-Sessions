package com.training.overriding;

public class Project {
	String clientName;
	String duration;
	String couresName;

	public Project(String clientName, String duration, String couresName) {
		super();
		this.clientName = clientName;
		this.duration = duration;
		this.couresName = couresName;
	}

	void projectAssigned() {
		System.out.println("Course Name : " + clientName);
		System.out.println("Duration of Course :  " + duration);
		System.out.println("Your Team Lead : " + couresName);
	}

}
