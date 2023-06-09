package main.java.tutorial;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TutorialSix {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String password;
		String loop = "y";
		while(loop.equals("y")) {
			System.out.print("Please Enter Your Password : ");
			password = scanner.next();
			if(isPasswordStrong(password) == true) {
				System.out.println("Your password is strong");
			}else {
				System.out.println("Your password is week");
			}
			
			System.out.print("Continue or not  : ");
			loop = scanner.next();
		}
	}

    public static boolean isPasswordStrong(String password) {
        if (password.length() <= 8) {
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        Pattern pattern = Pattern.compile("[!@#$%^&*()_+=|<>?{}\\[\\]~-]");
        Matcher match = pattern.matcher(password);
        if (!match.find()) {
            return false;
        }
        return true;
    }
}
