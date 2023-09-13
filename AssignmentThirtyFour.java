package assignment;

/*Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class.*/

class ShapeC{
	public void printShape() {
		System.out.println("This is shape");
	}
}

class RectangleC extends ShapeC{
	public void printRec() {
		System.out.println("This is rectangular shape");
	}
}

class CircleC extends ShapeC{
	public void printCir() {
		System.out.println("This is circular shape");
	}
}

class SquareC extends RectangleC{
	public void printSqr() {
		System.out.println("Square is a rectangle");
	}
}

public class AssignmentThirtyFour {
	public static void main(String[] args) {
		SquareC sqr = new SquareC();
		sqr.printShape();
		sqr.printRec();
	}
}
