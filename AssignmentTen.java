package assignment;

import java.util.Scanner;

/*Write a Java program to print the ASCII value of a given character. */

public class AssignmentTen {
	public static void main(String[] args) {
		
			String userInput;
			int AsciiValue;
			char character;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Character: ");
			userInput = sc.nextLine();
			
			if(userInput.length()>1) {
				System.out.println("Please Provide Only One Character");
			} else {
				character = userInput.charAt(0);
				AsciiValue = character;
				System.out.println("The AsciiValue Of "+character+" is "+ AsciiValue);
			}
	}
}
