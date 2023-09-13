package assignment;

import java.util.Scanner;

/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods.*/

abstract class Shape{
	abstract void RectangleArea(int lenth, int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(int rad);
}

class Area extends Shape{
	void RectangleArea(int lenth, int breadth) {
		System.out.println("Area Of Rectangle For The Given Length "+lenth+" And Given Breadth "+breadth+" is: "+ (lenth*breadth));
	}
	void SquareArea(int side) {
		System.out.println("Area Of Square For The Given Side "+side+" is: "+ (side*side));
	}
	void CircleArea(int rad) {
		System.out.println("Area Of Circle For The Given Radius "+rad+" is: "+ ((Math.PI)*(rad*rad)));
	}
}

public class AssignmentThirtyTwo {
	public static void main(String[] args) {
		try {
			int length,breadth,side,rad;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Provide Length To Find The Area Of Rectangle: ");
			length = sc.nextInt();
			
			System.out.print("Provide Breadth To Find The Area Of Rectangle: ");
			breadth = sc.nextInt();
			
			System.out.println("*****************************");
			
			System.out.print("Provide Side To Find The Area Of Square: ");
			side = sc.nextInt();
			
			System.out.println("*****************************");
			
			System.out.print("Provide Radius To Find The Area Of Circle: ");
			rad = sc.nextInt();
			
			Area area= new Area();
			area.RectangleArea(length, breadth);
			area.SquareArea(side);
			area.CircleArea(rad);
			
		} catch (Exception e) {
			System.out.println("Exception Found. Please Provide Integer value");
		}
		
	}
}
