package assignment;

import java.util.Scanner;

/*Write a program which will ask the user to enter his/her
marks (out of 100). Define a method that will display grades according to the marks
entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD 
40 Fail*/

public class AssignmentThirtyThree {
	public static void grades(int marks){
		if(marks>=0 && marks<=40) {
			System.out.println("Fail");
		} else if(marks>=41 && marks<=50) {
			System.out.println("You Got DD Grade");
		}else if(marks>=51 && marks<=60) {
			System.out.println("You Got CD Grade");
		}
		else if(marks>=61 && marks<=70) {
			System.out.println("You Got BC Grade");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("You Got BB Grade");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("You Got AB Grade");
		}
		else if(marks>=91 && marks<=100) {
			System.out.println("You Got AA Grade");
		} else {
			System.out.println("Wrong Input");
		}
		
	}
	public static void main(String[] args) {
		try {
			int marks;
			
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Your Marks: ");
			marks = sc.nextInt();
			
			AssignmentThirtyThree.grades(marks);
			
		} catch (Exception e) {
			System.out.println("Exception Found. Please Provide Integer value");
		}
	}
}
