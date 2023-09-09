package assignment;

/*Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class*/

class Parent{
	public void meth1() {
		System.out.println("This is a parent class");
	}
}
class Child extends Parent{
	public void meth2() {
		System.out.println("This is a child class");
	}
}
public class AssignmentTwentyThree {
	public static void main(String[] args) {
		Parent pt= new Parent();
		Child cd = new Child();
		
		pt.meth1();
		cd.meth2();
		cd.meth1();
	}
}
