package assignment;

import java.util.Scanner;

/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square*/

class Rectangle{
	int length, breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public void area(){
		System.out.println("The Area Of Rectangle Is: "+(length*breadth));
	}
	public void perimeter(){
		System.out.println("The Perimeter Of Rectangle Is: "+((length+breadth)*2));
	}
}

class Square extends Rectangle{
	int s;
	public Square(int s, int length, int breadth) {
		super(length, breadth);
		this.s = s;
	}
	
	public void area(){
		System.out.println("******************************");
		super.area();
		System.out.println("******************************");
		System.out.println("The Area Of Square For The Given Side "+s+" Is: "+(s*s));
	}
	public void perimeter(){
		System.out.println("******************************");
		super.perimeter();
		System.out.println("******************************");
		System.out.println("The Perimeter Of Square For The Given Side "+s+" Is: "+(s*4));
	}
}

public class AssignmentTwentyFive {
	public static void main(String[] args) {
		try {
			int side,len,bred;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please Provide Side To Find Its Area And Perimeter Of Square: ");
			side= sc.nextInt();
			System.out.print("Please Provide Length To Find Area And Perimeter Of Rectangle: ");
			len= sc.nextInt();
			System.out.print("Please Provide Breadth To Find Area And Perimeter Of Square: ");
			bred= sc.nextInt();
			
			Square sq= new Square(side, len, bred);
			sq.area();
			sq.perimeter();
		} catch (Exception e) {
			System.out.println("Please Provide Correct Input");
		}
		
	}
}
