package assignment;

import java.util.Scanner;

/*W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True*/

public class AssignmentSeventeen {
	public static void main(String[] args) {
		String text1, text2;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter First Text: ");
		text1= sc.nextLine();
		
		System.out.print("Please Enter Second Text: ");
		text2= sc.nextLine();
		
		for(int i=0; i<text2.length(); i++) {
			if(text2.charAt((text2.length() - (i+1))) == text1.charAt((text1.length() - (i+1)))) {
				count++;
			}
		}
		if(text2.length()==count) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
//	
	
	}
}
