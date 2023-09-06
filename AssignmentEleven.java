package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write  a  Java  program  that  accepts  an  integer  (n)  and  computes  the  value  of n+ nn+ nnn.*/

public class AssignmentEleven {
	public static void main(String[] args) {
		try {
			int userInput;
			Scanner sc = new Scanner(System.in);
			System.out.print("Please Provide Input: ");
			userInput= sc.nextInt();
			if(userInput<0) {
				System.out.println("Please Provide Only Positive Digit");
			} else if (userInput>=10) {
				System.out.println("Please Provide Only One Digit");
			} else {
				int nn = userInput * 11;
				int nnn = userInput * 111;
				
				int total = userInput + nn + nnn;
				System.out.println(userInput+" + "+nn+" + "+nnn);
				System.out.println("Total Value: "+ total);
			}
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException Found. Please Provide Integer values");
		}
	}
}
