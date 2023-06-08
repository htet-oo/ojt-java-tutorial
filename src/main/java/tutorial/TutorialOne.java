package main.java.tutorial;

import java.util.Scanner;

public class TutorialOne {
	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5,6,7};

		for(int i=0; i <=array.length; i++) {
			if(i == 1) {
				System.out.println();
				System.out.print(" ");
			}
			else if(i == 2){
				System.out.println();
				System.out.print("  ");
			}
			else if(i == 3){
				System.out.println();
				System.out.print("   ");
			}
			else if(i == 4){
				System.out.println();
				System.out.print("    ");
			}
			else if(i == 5){
				System.out.println();
				System.out.print("     ");
			}
			else if(i == 6){
				System.out.println();
				System.out.print("      ");
			}
			for(int j = i; j<=6; j++) {
				System.out.print(array[j] + " ");
			}
		}
		for(int i=5; i >=0; i--) {
			if(i == 0) {
				System.out.println();
			}
			else if(i == 1) {
				System.out.println();
				System.out.print(" ");
			}
			else if(i == 2){
				System.out.println();
				System.out.print("  ");
			}
			else if(i == 3){
				System.out.println();
				System.out.print("   ");
			}
			else if(i == 4){
				System.out.println();
				System.out.print("    ");
			}
			else if(i == 5){
				System.out.println();
				System.out.print("     ");
			}

			for(int j = i; j<=6; j++) {
				System.out.print(array[j] + " ");
			}
		}
	}
}
