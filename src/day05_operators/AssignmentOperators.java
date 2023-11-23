package day05_operators;

public class AssignmentOperators {

	public static void main(String[] args) {
	
		// Assignment Operators
		// =
		
		int number = 10;
		
		// Compound Assignment Operator
		number = number + 4; // add 4 to number  // 14
		number += 4; // add 4 to number         // 18
		System.out.println(number);

		int x = 100;
		x -= 10;  // decrement x by 10
		System.out.println(x);                 // 90
		
		// *=, /=
		int y = 5;
		y *= 2;   // y= y *2
		System.out.println(y);
		
		// both statements are the same
		y++;      // add 1 to the y
		y += 1;   // add 1 to the y
		
		
	}

}
