package day12_review;

public class ForLoop {

	public static void main(String[] args) {
		 /*
	    for (initialzation; condition; modification) {
	      // repeated code
	    }
	    */

	    //       a            ;  b   ;  c
	    for (int i = 0, j = 10; i < 5; i++, j+=2) {
	      // d
	      System.out.println("Run: " + i + " and " + j);
	    }

	    // a > b > d > c
	    // b > d > c
	    // b > d > c
	    // b -> false then loop stop

	    // i cannot be access outside the for looop
	    //    System.out.println(i + " after the loop end");
	}

}
