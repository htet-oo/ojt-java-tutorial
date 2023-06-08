package main.java.tutorial;

import java.util.Scanner;

public class TutorialTwoC {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int year;
		String loop = "y";
		while (loop.equals("y")) {
			System.out.print("Enter a year : ");
			year = scanner.nextInt();
			boolean result = false;
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						result = true;
					}
				} else {
					result = true;
				}
			} else {
				result = false;
			}

			if (result) {
				System.out.println("The year you had entered is a leap year");
			} else {
				System.out.println("It is not a leap year");
			}

			System.out.print("Continue or not y/n :");
			loop = scanner.next();
		}
	}
}