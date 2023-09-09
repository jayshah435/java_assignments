package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square. */

class FindArea{
	public void areaOfSquare(int x){
		System.out.println("The Area Of Square For The Given Side "+x+" is: "+(x*x));
	}
	public void areaOfRectangle(int x, int y){
		System.out.println("The Area Of Rectangle For The Given Sides "+x+ " And "+y+" is: "+(x*y));
	}
}
public class AssignmentTwentyTwo {
	public static void area() {
		int x,length,breadth;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Provide Value To Find Its Area Of Square: ");
		x= sc.nextInt();
		
		System.out.print("Please Provide Length To Find Area Of Rectangle: ");
		length= sc.nextInt();
		System.out.print("Please Provide Breadth To Find Area Of Rectangle: ");
		breadth= sc.nextInt();
		
		FindArea area= new FindArea();
		area.areaOfSquare(x);
		area.areaOfRectangle(length, breadth);
	}
	public static void main(String[] args) {
		try {
			area();
		} catch (InputMismatchException e) {
			System.out.println("Please Provide Correct Input");
			area();
		}
		
	}
}
