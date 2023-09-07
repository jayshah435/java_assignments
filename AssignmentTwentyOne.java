package assignment;

/*Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters. For example, if the parameters of the first method are of the form (int n, char c), then
that of the second method will be of the form (char c, int n). 
*/

class PrintNumAndChar{
	public void printnac(int num, char c){
		System.out.println("The Number is : "+num+" & The Character Is: "+c);
	}
	public void printnac(char c, int num){
		System.out.println("The Character is : "+c+" & The Number Is: "+num);
	}
}
public class AssignmentTwentyOne {
	
	public static void main(String[] args) {
		PrintNumAndChar pnac= new PrintNumAndChar();
		pnac.printnac(20,'k');
		pnac.printnac('l',100);
	}
}
