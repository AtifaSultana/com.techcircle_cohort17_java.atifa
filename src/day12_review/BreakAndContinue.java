package day12_review;

public class BreakAndContinue {

	public static void main(String[] args) {
		// Break statement, use to get out of the loop
	    // Continue statement, use to skip the code and go to the next iteration

	    for (int i = 0; i < 5; i++) {
	      if (i == 1) {
	        System.out.println("Go to next iteration");
	        continue;
	      }

	      System.out.println("repeated code: " + i);
	      
	      if (i == 3) {
	        System.out.println("stop the loop");
	        break;
	      }
	    }

	    System.out.println("The end");
	}

}
