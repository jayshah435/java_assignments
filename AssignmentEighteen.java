package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False I3*/

public class AssignmentEighteen {
	public static void main(String[] args) {
		String text1, text2;
		int count=0;
		String[] str1;
		String[] str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter Text: ");
		text1= sc.nextLine();
		
		System.out.print("Is Text Starts With: ");
		text2= sc.nextLine();
		
		str1 = text1.split(" ");
		str2 = text2.split(" ");
		
		if(str1[0].equals(str2[0])==true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
}
