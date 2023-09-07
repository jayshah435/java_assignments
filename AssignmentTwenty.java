package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/*W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ*/

class PrintNumber{
	public void printn(int txt){
		System.out.println(txt+" Has A Data Type Of: Integer");
	}
	public void printn(double txt){
		System.out.println(txt+" Has A Data Type Of: Float");
	}
	public void printn(String txt){
		System.out.println(txt+" Has A Data Type Of: String");
	}
	public void printn(boolean txt){
		System.out.println(txt+" Has A Data Type Of: Boolean");
	}
	public void printn(char txt){
		System.out.println(+txt+" Has A Data Type Of: Character");
	}
	
}

public class AssignmentTwenty {
	public static void main(String[] args) {
		PrintNumber pnum = new PrintNumber();
		pnum.printn(42);
		pnum.printn(4.20);
		pnum.printn("Jay");
		pnum.printn(true);
		pnum.printn('c');
	}
}
