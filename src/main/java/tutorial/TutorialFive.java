package main.java.tutorial;

import java.util.Random;
import java.util.Scanner;

public class TutorialFive {
	static Scanner scanner;
	public static void main(String[] args) {
		Random random = new Random();
		scanner = new Scanner(System.in);
		String loop = "y";
		int userNum;
		while(loop.equals("y")) {
			System.out.print("Choice {0: Rock, 1:Paper , 2: Scissor} : ");
			userNum = scanner.nextInt();
			var comNum = random.nextInt(3);
			if(comNum == 0 && userNum == 2) {
				System.out.println("You Lose");
			}
			else if(comNum == 1 && userNum == 0) {
				System.out.println("You Lose");
			}
			else if(comNum == 2 && userNum == 1) {
				System.out.println("You Lose");
			}
			else if(comNum == 0 && userNum == 1) {
				System.out.println("You Win");
			}
			else if(comNum == 1 &&  userNum == 2) {
				System.out.println("You Win");
			}
			else if(comNum == 2 && userNum == 0){
				System.out.println("You Win");
			}
			else if(userNum > 2) {
				System.out.println("Please enter below 2");
			}
			else {
				System.out.println("You guys are equal");
			}
			
			System.out.println("Continue or not (y/n) : ");
			loop = scanner.next();
		}
	}
}

