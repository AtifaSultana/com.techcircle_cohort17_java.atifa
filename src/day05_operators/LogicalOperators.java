package day05_operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// logical and   &&
		// logical or    || 
		// join 2 or more boolean statements
		
		// not           !
		
		boolean isFalse = false;
		System.out.println(!isFalse); // true
		
		// AND &&
		// true  && true  => true
		// true  && false => false
		// false && true  => false
		// false && false => false
		
		// it is inly true if,
		// or when both statements are true
		
		System.out.println(5 < 10 && 'a' == 'a'); // true
		System.out.println(!false && false); // false
		
		// x
		// is this number in between 10 and 20 inclusive?
		System.out.println("is the number in between 10 and 20 inclusive?:");
		Scanner scan = new Scanner(System.in);
		// check is x >= 10 and x <= 20
       //		int x = 15;
		int x = scan.nextInt();
		System.out.println(x >= 10 && x <= 20); // true
		System.out.println(10 >= x && x <= 20); // true
		
		// OR ||
		// true  || True  => true
		// true  || false => true
		// false || true  => true
		// false || false => false
		int age = 20;
		boolean isFriday = false;
		boolean is18 = age>= 18; 
		System.out.println(false || true);
		
		System.out.println("Can you go to bed after 12AM");
		System.out.println(!is18 || isFriday);
		
	}

}
