package assignment;

import java.util.Scanner;

/*W.A.J.P to get the character at the given index within the String.
  Original String = Tops Technologies! 
  The character at position 0 is T, The character at position 10 is o */

public class AssignmentFourteen {
	public static void main(String[] args) {
		String text;
		int index;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please Enter Text: ");
		text= sc.nextLine();
		System.out.print("Please Enter Index value: ");
		index= sc.nextInt();

		if(index>text.length()) {
			System.out.println("Index Value Is Out Of Range!");
		} else {
			System.out.println("Character At Position "+index+" Is : "+text.charAt(index));
		}
	}
}
