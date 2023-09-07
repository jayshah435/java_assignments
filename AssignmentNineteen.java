package assignment;

import java.util.Scanner;

/*W.A.J.P to find the second most frequent character in a given string. The given string
is: successes The second most frequent char in the string is: c*/

public class AssignmentNineteen {
	public static void main(String[] args) {
		String text;
		boolean checkChar = false;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please Enter Text: ");
		text = sc.nextLine();
		
		for(int i=0; i<(text.length()-1); i++) {
			if(text.charAt(i)==text.charAt(i+1)) {
				checkChar = true;
				System.out.println("Second Most Frequent Character: "+text.charAt(i));
				break;
			}
		}
		if(!checkChar) {
			System.out.println("Not Any Frequent Character");
		}
		
	}
}
