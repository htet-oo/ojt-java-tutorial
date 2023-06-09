package main.java.tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class TutorialFourB {
	static Scanner scanner;
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		scanner =new Scanner(System.in);
		String loop = "y";
		while(loop.equals("y")) {
			System.out.print("Enter Color : ");
			arrList.add(scanner.next());
			
			System.out.println("Continue or not (y/n)");
			loop=scanner.next();
		}
		

		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println();
		String colorOne;
		String colorTwo;
		System.out.print("First swap color :");
		colorOne=scanner.next();
		System.out.print("Second swap color :");
		colorTwo=scanner.next();
		

		var number =arrList.indexOf(colorOne);
		var number1 = arrList.indexOf(colorTwo);
		arrList.set(number, colorTwo);
		arrList.set(number1, colorOne);

		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		
		
		
	}

}
