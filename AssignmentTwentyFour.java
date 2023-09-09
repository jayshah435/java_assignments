package assignment;

import java.math.BigInteger;
import java.util.Scanner;

/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.*/

class Member{
	int age, salary;
	BigInteger num;
	String name, address;
	
	public Member(String name,int age, BigInteger num, String address, int salary) {
		this.name = name;
		this.age = age;
		this.num = num;
		this.address = address;
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("The Salary Of "+name+" is "+salary);
	}
}
public class AssignmentTwentyFour {
	public static void main(String[] args) {
		try {
			int age, salary;
			BigInteger num;
			String name, address;
			
			Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter Your Name: ");
			name = sc.nextLine();
			System.out.print("Enter Your Age: ");
			age = sc.nextInt();
			System.out.print("Enter Your Mobile Number: ");
			num = sc.nextBigInteger();
			
			sc.nextLine();
			System.out.print("Enter Your Address: ");			
			address = sc.nextLine();
			System.out.print("Enter Your Salary: ");
			salary = sc.nextInt();
			
			Member mem = new Member(name, age, num, address, salary);
			mem.printSalary();
		} catch (Exception e) {
			System.out.println("Please Provide Correct Input");
		}
	}
}
