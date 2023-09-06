package assignment;

/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.*/

import java.util.ArrayList;

public class AssignmentThirteen {
	public static void main(String[] args) {
		
		ArrayList arrDBThree = new ArrayList();
		ArrayList arrDBFive = new ArrayList();
		ArrayList arrDBBoth = new ArrayList();
		
		for(int i=1; i<100; i++) {
			if(i%3==0 || i%5==0) {
				if(i%3==0) {
					arrDBThree.add(i);
					if(i%5==0) {
						arrDBBoth.add(i);
					}
				}
				if(i%5==0) {
					arrDBFive.add(i);
				}
			}
		}
		
		System.out.println("Numbers Divisible By 3: "+arrDBThree);
		System.out.println("Numbers Divisible By 5: "+arrDBFive);
		System.out.println("Numbers Divisible By 3 & 5: "+arrDBBoth);
		
	}
}
