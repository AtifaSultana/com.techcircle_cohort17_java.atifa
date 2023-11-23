package day06_controlFLowStatement;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// Relational Operators will return boolean
		
		int a = 4;
		int b = 3;
		int c = 7;
		System.out.println(a > b);
		
		System.out.println(a < b);
		
		System.out.println(a >= b);
		
		System.out.println(a <= b);
		
		System.out.println(a == b);
		
		System.out.println(a + b == c);
		
		System.out.println(a + b <= c); // (a + b < c || a + b == c)
		
		System.out.println(a != c);
		
		System.out.println(a + b != c);
		
		
	}

}
