package assignment;

import java.util.Arrays;
import java.util.Scanner;

/* Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message. */

public class assignment_two {
	public static void main(String[] args) {
		String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};
		
		String character;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter Character: ");
		character = sc.next();
		if(character.matches("[a-zA-Z]+")) {
			if(character.length() > 1) {
				System.out.println("Please Provide One Character Value");
			} else {
				Boolean vowel = Arrays.asList(vowels).contains(character);
				if(vowel) {
					System.out.println("The Chracter "+ character+" Is A Vowel");
					 
				} else {
					System.out.println("The Chracter "+ character+" Is A Consonant");
				}
			}
		} else {
			System.out.println("Please Provide Only Character Value From a-z Or A-Z");
		}
	}
}
