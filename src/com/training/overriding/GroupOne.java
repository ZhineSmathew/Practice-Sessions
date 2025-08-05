package com.training.overriding;

public class GroupOne extends Project {

	public GroupOne(String clientName, String duration, String couresName) {
		super(clientName, duration, couresName);
	}

	@Override
	void projectAssigned() {
		super.projectAssigned();
		System.out.println("Core Java Project!");
	}

	String[] showTools(String[] tools) {
		return tools;
	}

}
