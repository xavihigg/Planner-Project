package com.planner.Model;

import java.util.Scanner;

public class CalenderTest {
	public static void main(String[] args) {
		//test to make sure calendar is made
		Calendar calendar = new Calendar();
		calendar.makeCalendar();
		
		Scanner scan = new Scanner(System.in);
		int decision;
		System.out.print("\n\nWhat would you like to do?"
				+ "\n1: Event."
				+ "\n2: Category."
				+ "\n3: exit"
				+ "\n>> ");
		while(scan.hasNext()) {
			decision = scan.nextInt();
			if(decision == 1) {
				Event event = new Event();
				event.main(args);
			}
			else if(decision == 2) {
				Category category = new Category();
				category.createCategory();
			}
			else {
				System.out.print("Logging off..");
				break;
			}
			System.out.print("\n\nWhat would you like to do?"
					+ "\n1: Event."
					+ "\n2: Category."
					+ "\n3: exit"
					+ "\n>> ");
		}
		scan.close();
	}
}
