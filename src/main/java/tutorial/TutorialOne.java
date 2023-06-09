package main.java.tutorial;



public class TutorialOne {
	public static void main(String[] args) {
        int a = 7;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= a; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
        
        for (int i = a - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= a; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

	}
}
