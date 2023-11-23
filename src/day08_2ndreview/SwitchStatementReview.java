package day08_2ndreview;

public class SwitchStatementReview {

	public static void main(String[] args) {
		
		// Switch statement
		// similar to if statement but 
		`
	    // 1-5 => weekday, 6-7 => weekend
	    int day = 15;
	    switch (day) {
	      case 1,2,3,4,5 -> {
	        System.out.println("weekday");
	      }
	      case 6,7 -> {
	        System.out.println("weekend");
	      }
	      default -> {
	        System.out.println("the input is invalid");
	      }
	    }

	    System.out.println("This will run after break statement");
	}

}
