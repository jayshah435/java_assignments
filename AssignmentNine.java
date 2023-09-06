package assignment;

import java.util.Scanner;

/*Write a Java program to count the letters, spaces, numbers and other characters of an input string*/

public class AssignmentNine {
	public static void main(String[] args) {
		String userInput;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Plese Provide Input: ");
		userInput = sc.nextLine();
		
		int countLetters=0;
		int countSpaces=0;
		int countNumbers=0;
		int countCharacters=0;
		
		for(char charArray: userInput.toCharArray()) {
			if(Character.isLetter(charArray)) {
				countLetters++;
			}else if(Character.isDigit(charArray)) {
				countNumbers++;
			} else if (Character.isWhitespace(charArray)) {
				countSpaces++;
			} else {
				countCharacters++;
			}
		}
		System.out.println("Total Letters: "+countLetters);
		System.out.println("Total Numbers: "+countNumbers);
		System.out.println("Total Characters: "+countCharacters);
		System.out.println("Total Spaces: "+countSpaces);
	}
}
