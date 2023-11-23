package day05_operators.exercises;

public class Exercise02 {

	public static void main(String[] args) {
		
		/*The parameter weekday is true if it is a weekday, 
		 * and the parameter vacation is true if we are on vacation. 
		 * 
		 * return true We sleep in if it is not a weekday or we're on vacation. 
		 
          //     weekday, vacation
          sleepIn(false, false) → true
          sleepIn(true, false) → false
          sleepIn(false, true) → true 
          */
		
		boolean weekday = ? true; // true => weekday , false => vacation
		boolean vacation = false; // true => on vacation , false => not on vacation
		
		boolean sleepIn;
		
		sleepIn = !weekday || vacation;
		
		 System.out.println(sleepIn);
		
		
		
		
	}

}
