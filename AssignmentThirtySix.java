package assignment;

import java.util.Scanner;

/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; */

public class AssignmentThirtySix {
	public static void main(String[] args) {
		try {
			int num1,num2;
			int a[] = new int[5];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter First Numer: ");
			num1 = sc.nextInt();
			
			System.out.print("Enter Second Number: ");
			num2 = sc.nextInt();
			
			System.out.println("Divison: "+(num1/num2));
			a[5] = (num1/num2);
			System.out.println(a[5]);
			
		} catch (ArithmeticException e) {
			System.out.println("Can't Perform Devision By Zero, Please Provide Proper Input");
		}catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index Value Out Of Range, Please Provide Proper Input");
		}
	}
}
