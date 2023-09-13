package assignment;

import java.util.Scanner;

/*W.A.J. P to demonstrate try catch block
 Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0 */

public class AssignmentThirtyFive {
	public static void main(String[] args) {
		try {
			int num1,num2;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter First Numer: ");
			num1 = sc.nextInt();
			
			System.out.print("Enter Second Number: ");
			num2 = sc.nextInt();
			
			System.out.println("Divison: "+(num1/num2));
		} catch (ArithmeticException e) {
			System.out.println("Can't Perform Devision By Zero, Please Provide Proper Input ");
			
		}
	}
}
