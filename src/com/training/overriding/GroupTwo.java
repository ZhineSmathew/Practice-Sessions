package com.training.overriding;

public class GroupTwo extends Project {

	public GroupTwo(String clientName, String duration, String couresName) {
		super(clientName, duration, couresName);
	}

	@Override
	void projectAssigned() {
		super.projectAssigned();
		System.out.println("Course Details!");
	}

	String[] showTools(String[] tools) {
		return tools;
	}

}
