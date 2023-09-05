package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a Java program to Take three numbers from the user and print the greatest number.

public class assignment_One {
	public static void main(String[] args) {
		try {
			int num1,num2,num3;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Number one: ");
			num1 = sc.nextInt();
			
			System.out.println("Enter Number two: ");
			num2 = sc.nextInt();
			
			System.out.println("Enter Number three: ");
			num3 = sc.nextInt();
			
			if(num1 > num2 && num1> num3) {
				System.out.println("Greatest Number is "+ num1);
			} else if(num2>num1 && num2>num3) {
				System.out.println("Greatest Number is "+ num2);
			} else if(num3>num1 && num3>num2) {
				System.out.println("Greatest Number is "+ num3);
			} else {
				System.out.println("Equal Values Detected. Please Provide Different Values");
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException Found. Please Provide Proper value.");
		}
		
	}
}
