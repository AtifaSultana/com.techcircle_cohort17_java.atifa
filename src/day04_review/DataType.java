package day04_review;

public class DataType {

	public static void main(String[] args) {
		// java dataType
		
		// Referance Type (non Primitive)
		// String - char sequence
		
		// Primitive -
		/*
		 boolean - true / false
		 char - single character
		 whole number
		     - byte, short, int, long
		 floating number (fraction)
		     - float, double
		*/
		
		// initialize variable
		// box that holds the value of data
		// refer them by their name
		
		// DataType variableName = value;
		
		byte day = 10;
		System.out.println(day); // 10
		System.out.println(day + 5); // 15
		
	//	to find out the maximum and minimum value of the data types
		// class name itself. MAX _value 
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Integer.MIN_VALUE); // -127
		System.out.println(Long.MIN_VALUE); // ??
		
		// boolean, char, int, double
		boolean isTall = true;
		char letter = 'B';
		int ageOfMyDog = 9;
		double $_myBalance = 100_000.00;// cannot use speial characters, except $ _ .
		
		// float
		float milkPrice = 3.17f; // cannot use float for this will not print 'f'
		long viewCount = 9_000_000_000_000_000_000L; //or L
		
		System.out.println("Milk Price");
		System.out.println(milkPrice);
		System.out.println("viewCount:");
		System.out.println(viewCount);
		
		

	}

}
