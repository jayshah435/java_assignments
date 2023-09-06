package assignment;

import java.util.Scanner;

//W.A.J.P to concatenate a given string to the end of another string.  

public class AssignmentFifteen {
	public static void main(String[] args) {
		String fText;
		String sText;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please Enter First String Value: ");
		fText = sc.nextLine();
		
		System.out.print("Please Enter Second String Value: ");
		sText = sc.nextLine();
		
		System.out.println("Final Value: "+ "\""+fText+" "+sText+"\"");
	}
}
