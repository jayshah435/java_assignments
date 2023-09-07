package assignment;

import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/*W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false*/

public class AssignmentSixteen {
	public static void main(String[] args) {
		String text1, text2;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter First Text: ");
		text1= sc.nextLine();
		
		System.out.print("Please Enter Second Text: ");
		text2= sc.nextLine();
		
		if(text1.length()== text2.length()) {
			for(int i=0; i<text1.length(); i++) {
				if(text1.charAt(i) == text2.charAt(i)) {
					count++;
				}
			}	
			if(text1.length()==count) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}else {
			System.out.println("False");
		}
		
		
		
	}
}
