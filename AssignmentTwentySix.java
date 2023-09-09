package assignment;

/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor*/

class Triangle{
	
	public static void perimeter(int a, int b, int c) {
		System.out.println("The Perimeter Of The Given Triangle Is: "+(a+b+c));
	}
	public static void area(int a, int b, int c){
		int pera;
		double tarea,x;
		pera = a+b+c;
		x = (pera*(pera-a)*(pera-b)*(pera-c));
		tarea = Math.sqrt(x);
		System.out.println("The Area Of The Given Triangle Is: "+tarea);
	}
}

public class AssignmentTwentySix {
	public static void main(String[] args) {
		Triangle.perimeter(3,4,5);
		Triangle.area(3,4,5);
	}
}
