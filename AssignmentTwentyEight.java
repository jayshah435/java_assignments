package assignment;

/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating
an object for each subclass.*/

abstract class Parentc{
	abstract void message();
}

class FirstChild extends Parentc{
	void message() {
		System.out.println("This Is First Subclass");	
	}
}

class SecondChild extends Parentc{
	void message() {
		System.out.println("This Is Second Subclass");	
	}
}

public class AssignmentTwentyEight {
	public static void main(String[] args) {
		FirstChild fc = new FirstChild();
		SecondChild sc = new SecondChild();
		
		fc.message();
		sc.message();
	}
}
