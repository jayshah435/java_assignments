package assignment;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/*Write a program in Java to make such a pattern like right angle triangle with number
increased by 1 The pattern like:
1
2 3
4 5 6
7 8 9 10 */

public class AssignmentSeven {
	public static void main(String[] args) {
		try {
			int num;
			Scanner sc = new Scanner(System.in);
			int CurrentValue = 1;
			
			System.out.print("Enter Number: ");
			num = sc.nextInt();
			
			for(int i=0; i<num; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(CurrentValue);
					CurrentValue++;
				}
				System.out.println();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException Found. Please Provide Integer values");
		}
	}
}
