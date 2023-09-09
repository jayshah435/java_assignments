package assignment;

import java.util.Scanner;

/*Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user*/

class Complex{
	int freal,fimag, sreal, simag;
	public Complex(int freal, int fimag, int sreal, int simag) {
		this.freal = freal;
		this.fimag = fimag;
		this.sreal = sreal;
		this.simag = simag;
	}
	public void sum(){
		int realSum = freal + sreal;
		int imagSum = fimag + simag;
		if(imagSum==0 && realSum==0) {
			System.out.println("Sum: "+realSum);
		}else if(imagSum>=0) {
			System.out.println("Sum: "+realSum+"+"+imagSum+"i");
		}else {
			System.out.println("Sum: "+realSum+"-"+ Math.abs(imagSum)+"i");
		}
	}
	public void difference(){
		int realDiff = freal - sreal;
		int imagDiff = fimag - simag;
		if(imagDiff==0 && realDiff==0) {
			System.out.println("Difference: "+realDiff);
		}else if(imagDiff>=0) {
			System.out.println("Difference: "+realDiff+"+"+imagDiff+"i");
		}else {
			System.out.println("Difference: "+realDiff+"-"+ Math.abs(imagDiff)+"i");
		}
	}
	public void product(){
		//i^2=(-1) => (a+bi)*(c+di)= ac + ad i + bc i + bd(-1)
		int prod1= (freal*sreal);
		int prod2= (freal*simag);
		int prod3= (fimag*sreal);
		int prod4= ((fimag*simag)*(-1));
		
		int realProd = prod1+prod4;
		int imagProd = prod2+prod3;
		
		if(imagProd==0 && realProd==0) {
			System.out.println("Product: "+realProd);
		}else if(imagProd>=0) {
			System.out.println("Product: "+realProd+"+"+imagProd+"i");
		}else {
			System.out.println("Product: "+realProd+"-"+ Math.abs(imagProd)+"i");
		}
		
	}
}

public class AssignmentTwentySeven {
	public static void main(String[] args) {
		int freal,fimag, sreal, simag;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Please Povide First Real Number: ");
		freal= sc.nextInt();
		System.out.print("Please Povide First Imaginary Number: ");
		fimag= sc.nextInt();
		System.out.print("Please Povide Second Real Number: ");
		sreal= sc.nextInt();
		System.out.print("Please Povide Second Imaginary Number: ");
		simag= sc.nextInt();
		Complex cx= new Complex(freal, fimag, sreal, simag);
		cx.sum();
		System.out.println("**************************");
		cx.difference();
		System.out.println("**************************");
		cx.product();
	}
}
