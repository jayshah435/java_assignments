package assignment;

import java.util.Scanner;

/*Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0 */

public class AssignmentThirtyOne {
	
	public static void facVal(int num) {
		int finalVal=1;
		if(num==0 || num==1) {
			System.out.println("Factorial Value Of "+num+"! is: "+num);
		} else if(num<0) {
			System.out.println("Please Enter Positive Value");
		} else {
			for(int i=1; i<num+1; i++) {
				finalVal= finalVal* i;
			}
			System.out.println("Factorial Value Of "+num+"! is: "+finalVal);
		}
	}
	public static void main(String[] args) {
		try {
			int num;
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter A Number To Find Its Factorial Value: ");
			num = sc.nextInt();
			
			AssignmentThirtyOne.facVal(num);
			
			
		} catch (Exception e) {
			System.out.println("Exception Found. Please Provide Integer value");
		}
	}
}
