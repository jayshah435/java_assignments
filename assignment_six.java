package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a program in Java to display the pattern like right angle triangle with a number.
1
12
123
1234
12345 */

public class assignment_six {
	public static void main(String[] args) {
		try {
			int num;
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Please Enter Number: ");
			num= sc.nextInt();
			
			if(num<0) {
				System.out.println("Please Provide Positive Integer Value");
			} else {
				for(int i=0; i<num; i++) {
					for(int j=0; j<=i; j++) {	
						System.out.print(j+1);
					}
					System.out.println();
				}
			}
			
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException Found. Please Provde Integer values");
		}
	}
}
