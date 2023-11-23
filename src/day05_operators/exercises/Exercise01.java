package day05_operators.exercises;

public class Exercise01 {

	public static void main(String[] args) {
		/* Return true if the given non-negative number 
		 * is a multiple of 3 or a multiple of 5. 
		 * Use the % "mod" operator
            or35(3) → true
            or35(10) → true
            or35(8) → false */
		
		 int input /*test case*/ = 0;
	        boolean result;
	        // pseudocode
	        
	        // find multiple of 3
	        boolean multipleOf3 = input % 3 == 0;
	        // return true if number can be divisible by 3
	        
	        // find multiple of 5
	        boolean multipleOf5 = input % 5 == 0; 
	        // return true if number can be divisible by 5
	        
	        // join them with or
	        result = multipleOf3 || multipleOf5;
	        
	        System.out.println(result); // true
	}

}
