package main.java.tutorial;

import java.util.ArrayList;

public class TutorialThreeC {
	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Python");
		arrList.add("Java");
		arrList.add("Php");
		arrList.add("Perl");
		arrList.add("C#");
		
		var list=arrList.toArray();
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
	}
}
