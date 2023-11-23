package day08_2ndreview;

public class NestedIfReview {

	public static void main(String[] args) {
		// Nested if
		int age = 18;
				boolean usCitizen = true;
		        if (age >= 18) {
		        	System.out.println("you are an adult");
		        	if (usCitizen) {
		        		System.out.println("You are elegible for vote");
		        	}
		        	else {
		        		System.out.println("you need to be US citizen");
		        	}
		        }
		// or you can use logical and operator to join 2 conditions
	    // instead of nesting the code
		        if (age >= 18 && usCitizen) {
		        	System.out.println("You are elegible for vote");
		        }
		
	}

}
