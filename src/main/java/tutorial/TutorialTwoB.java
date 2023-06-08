package main.java.tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TutorialTwoB {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=====================Enter Three Numbers=====================");
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("First");
		list2.add("Second");
		list2.add("Third");
		String loop = "y";
		int result;
		while (loop.equals("y")) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("Enter %s Number : ", list2.get(i));
				int number = scanner.nextInt();
				list.add(number);
				number = 0;
			}
			System.out.println("The largest number is : " + Collections.max(list));

			list.removeAll(list);

			System.out.print("Continue or not y/n :");
			loop = scanner.next();
		}

	}
}