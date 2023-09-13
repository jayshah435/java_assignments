package assignment;

import java.util.Scanner;

/*We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and print the percentage of marks for
both the students.*/

abstract class Marks{
	abstract void getPercentage();
}

class StudentA extends Marks{
	int sub1,sub2,sub3;
	public StudentA(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	void getPercentage() {
		double percent = (sub1+sub2+sub3)/3;
		System.out.println("Student A Got "+percent+ "%");
	}
}

class StudentB extends Marks{
	int sub1,sub2,sub3,sub4;
	public StudentB(int sub1, int sub2, int sub3, int sub4) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	void getPercentage() {
		double percent = (sub1+sub2+sub3+sub4)/4;
		System.out.println("Student B Got "+percent+ "%");
	}
}

public class AssignmentThirty {
	public static void main(String[] args) {
		try {
			int sub1A,sub2A,sub3A,sub1B,sub2B,sub3B,sub4B;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Student A Marks In Sub1 Out Of 100: ");
			sub1A = sc.nextInt();
			
			System.out.print("Student A Marks In Sub2 Out Of 100: ");
			sub2A = sc.nextInt();
			
			System.out.print("Student A Marks In Sub3 Out Of 100: ");
			sub3A = sc.nextInt();
			
			System.out.println("***************************");
			
			System.out.print("Student B Marks In Sub1 Out Of 100: ");
			sub1B = sc.nextInt();
			
			System.out.print("Student B Marks In Sub2 Out Of 100: ");
			sub2B = sc.nextInt();
			
			System.out.print("Student B Marks In Sub3 Out Of 100: ");
			sub3B = sc.nextInt();
			
			System.out.print("Student B Marks In Sub4 Out Of 100: ");
			sub4B = sc.nextInt();
			
			StudentA studA= new StudentA(sub1A,sub2A,sub3A);
			StudentB studB= new StudentB(sub1B,sub2B,sub3B,sub4B);
			
			studA.getPercentage();
			studB.getPercentage();
			
		} catch (Exception e) {
			System.out.println("Exception Found. Please Provide Integer value");
		}
	}
}
