package assignment;

/*Write a Java program that reads a positive integer which is less than ten billion and count the number of digits the number. */

import java.util.Scanner;

public class AssignmentEight {
	public static void main(String[] args) {
		try {
			long num;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please Input the Number: ");	
			num= sc.nextLong();
			if(num<0 || num>=10000000000L) {
				System.out.println("Please Provide a Value Greater Than Zero And Less Than Ten Billions Only");
			} else {
				int count=0;
				while(num>0) {
					num/=10;
					count++;
				}
				System.out.println("Total Digits: "+count);
			}
			
		} catch (Exception e) {
			System.out.println("InputMismatchException Found. Please Provide Integer values");
		}
		
	}
}
