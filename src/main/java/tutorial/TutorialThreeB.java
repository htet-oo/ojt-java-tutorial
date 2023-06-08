package main.java.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class TutorialThreeB {
	static int[] array;
	static int[] ansArray;
	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		array = new int[0];
		ansArray =new int[0];
		int delete;
		String loop = "y";
		while (loop.equals("y")) {
			System.out.println("Enter Number");
			int number = scanner.nextInt();
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length - 1] = number;
			number = 0;
			System.out.println("Continue or not (y/n)");
			loop = scanner.next();
		}
		System.out.print("Enter the number you want to delete : ");
		delete =scanner.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == delete) {
				continue;
			}else {
				ansArray = Arrays.copyOf(ansArray, ansArray.length+1);
				ansArray[ansArray.length-1] = array[i]; 
			}
		}
		
		for(int i = 0; i < ansArray.length; i++) {
			System.out.print(ansArray[i] + " ");
		}
	}
}
