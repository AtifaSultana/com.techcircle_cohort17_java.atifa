package day05_operators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// Relational Operators
		// or Comparison Operators
		// -- , !-
		// > >= < <=

		// number
		boolean result1 = 5 > 10;
		System.out.println(result1);
		boolean result2 = 5 >= 10;
		System.out.println(result2);
		boolean result3 = 5 < 10;
		System.out.println(result3);
		boolean result4 = 5 <= 10;
		System.out.println(result4);
		

        // Equal & Not Equal
        System.out.println(10 == 10.0);
        System.out.println(10 != 10.0);
        
        // or use with any other primitive data type
        System.out.println('A' != 'a');
        System.out.println(true == true);
        
        // String Comparison (What to do when compare String (or any reference data type)
        
        System.out.println("== String Comparison ==");
        System.out.println("hello" == "world");
        System.out.println("hello" == "hello");
        
        String a = "hello";
        String b = "hel" + "lo"; // "hello" // store in Heap
        // Reference - @address... // store in Heap
        String c = new String("hello"); // store in Stack
        
        System.out.println();
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println();
        System.out.println(a.equals(c)); // always use .equals()
        System.out.println(a == c); // this is not recommend
		
	}

}
