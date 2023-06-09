package main.java.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class TutorialThreeA {
	static int[] array;
	static Scanner scanner;
	public static void main(String[] args) {
		scanner=new Scanner(System.in);
		array=new int[0];
		double adding = 0;
		String loop = "y";
		while(loop.equals("y")) {
			System.out.println("Enter Number");
			int number=scanner.nextInt();
			array=Arrays.copyOf(array,array.length+1);
			array[array.length-1]=number;
			number=0;
			
			System.out.println("Continue or not (y/n)");
			loop=scanner.next();
		}
		for(int i = 0; i<array.length; i++) {
			adding += array[i];
		}
		adding=adding/array.length;
		System.out.println("The result is " + adding);
	}
}
