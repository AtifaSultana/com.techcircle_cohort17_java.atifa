package day05_operators;

public class arithmeticOperators {

	public static void main(String[] args) {
		/// Arithmetic Operator
        // + - * /
        // %
        // ++, --
        
        int x, y;
        x = 3;
        y = 5;
        
        int additionResult = x + y;
        System.out.println(additionResult); // 8
        int subtractionResult = x - y;
        System.out.println(subtractionResult); // -2
        int multiplicationResult = x * y;
        System.out.println(multiplicationResult); // 15
        
        // division
        int divisionResult = x / y; // 3 / 5 = 0.3435
        System.out.println(divisionResult); // 0
        
        System.out.println(50 / 10); // 5
        System.out.println(50 / 20); // 2
        System.out.println(50.0 / 20.0); // 2.5
        System.out.println(22.0 / 7.0); // 3.14......
        
        
        // precedence
        // ()
        // / *
        // + -
        
        //                     6   +  2   = 8
        //                     2 * 7 / 2   = 7
        System.out.println(2 * (3 + 4) / 2); // 
        System.out.println(2 + 3 - 4 + 6);
        
        // %
        // the operator that return the remainder of division of 2 number
        
        System.out.println(4 % 3); // 4/3 =  3 +       => 1
        System.out.println(10 % 4); // 2
        System.out.println(20 % 2); // 0
        
        // even & odd
        System.out.println("==== even & odd ====");
        System.out.println(32424623 % 2);
        System.out.println(333333 % 2);
        System.out.println(3000 % 2);
        System.out.println(4368 % 2);
        
        // number that can be divisible by 5
        // x % 5  // 00
	
	
	}

}
