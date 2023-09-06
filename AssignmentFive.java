package assignment;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop.*/

public class AssignmentFive {
	public static void main(String[] args) {
		try {
			int num;
			int total=0;
			double avg=0;
			int[] averageList= new int[5];
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<5; i++) {
				System.out.print("Please Provide "+ (i+1) + " Value: ");
				num = sc.nextInt();
				averageList[i]=num;
				total+=num;
			}
			for(int i=0; i<averageList.length; i++) {
				avg+=averageList[i];
			}
			avg=avg/averageList.length;
			System.out.println("Total Sum: "+total);
			System.out.println("Average: "+avg);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException Found. Please Provide Integer values");
		}
	}
}
