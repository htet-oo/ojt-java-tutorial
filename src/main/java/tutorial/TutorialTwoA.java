package main.java.tutorial;

import java.util.Scanner;

public class TutorialTwoA {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String result;
		String loop = "y";
		while (loop.equals("y")) {
			System.out.print("Enter Number :" + "\t");
			int number = scanner.nextInt();
			if (number > 0) {
				result = "positive";
			} 
			else if(number < 0){
				result = "negative";
			}
			else {
				result = "it is 0";
			}
			System.out.println("Answer is : " + result);
			System.out.print("Continue or not y/n :");
			loop = scanner.next();
		}
	}

}