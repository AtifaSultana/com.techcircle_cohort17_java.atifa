package day05_operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = (a == 1) ? 20   : 30;
		//           ? true : false
		
		System.out.println("b = " + b);

		String answer = (20 > 10)? "yes" : "no";
		int x, y;
		x = 20;
		y = 10;
		int max = x > y ? x : y;
		System.out.println("the max value is:" + max);
		
	}

}
