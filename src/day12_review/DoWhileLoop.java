package day12_review;

public class DoWhileLoop {

	public static void main(String[] args) {
		 System.out.println("=== do while loop ===");
		    // do while
		    // always execute once (even the condition is false)
		    /**
		     * do {
		     *  // code to be repeated
		     *  // code to be repeated
		     *  // code to be repeated
		     * } while (condition);
		     */

		    int j = 0;

		    do {
		      System.out.println("Hello from do while loop");
		      j++;
		    } while (false);

		    System.out.println(j + " value after the loop");
	}

}
