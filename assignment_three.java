package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a Java program that takes a year from user and print whether that year is a leap
year or not.*/

public class assignment_three {
	public static void main(String[] args) {
		try {
			int year;
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter Year: ");
			year = sc.nextInt();
			
			if(year<0) {
				System.out.println("Please Provide Positive Integer Value");
			}else {
				if(year%4 == 0) {
					if(year%100 ==0) {
						if(year%400==0) {
							System.out.println("The Given Year "+year+ " Is A Leap Year");
						}else {
							System.out.println("The Given Year "+year+ " Is Not A Leap Year");
						}
					} else {
						System.out.println("The Given Year "+year+ " Is A Leap Year");
					}
				} else {
					System.out.println("The Given Year "+year+ " Is Not A Leap Year");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException Found. Please Provide Integer Value");
		}
		
	}
}
