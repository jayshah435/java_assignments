package assignment;

/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes.*/

abstract class Bank{
	abstract void getBalance(int rupees);
}

class BankA extends Bank{
	void getBalance(int rupees) {
		System.out.println("Deposited $"+rupees+" In BankA");
	}
}

class BankB extends Bank{
	void getBalance(int rupees) {
		System.out.println("Deposited $"+rupees+" In BankB");
	}
}

class BankC extends Bank{
	void getBalance(int rupees) {
		System.out.println("Deposited $"+rupees+" In BankC");
	}
}

public class AssignmentTwentyNine {
	public static void main(String[] args) {
		BankA bankA= new BankA();
		BankB bankB= new BankB();
		BankC bankC= new BankC();
		
		bankA.getBalance(100);
		bankB.getBalance(150);
		bankC.getBalance(200);
	}
}
