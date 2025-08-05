package com.training.overriding;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Project Details");

		String input = sc.next();
		Project project = null;
		if (input.toLowerCase().equals("java")) {
			project = new GroupOne("Java Full Stack", "3 Months", "Shiva Kumar");
			project.projectAssigned();
			GroupOne groupOne = (GroupOne) project;
			String[] toolOne = groupOne.showTools(new String[] { "IDE: Eclipse", "Java Latest Version", "64-bit" });
			for (String one : toolOne) {
				System.out.println(one);
			}
		} else {
			project = new GroupTwo("Dot-Net Full Stack", "4 Months", "Aneesh");
			project.projectAssigned();
			GroupTwo groupTwo = (GroupTwo) project;
			String[] toolTwo = groupTwo
					.showTools(new String[] { "IDE: VS Code", "DotNet Latest Version 6.0", "64-bit" });
			for (String two : toolTwo) {
				System.out.println(two);
			}
		}

	}

}
