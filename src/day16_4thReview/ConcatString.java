package day16_4thReview;

public class ConcatString {

	public static void main(String[] args) {
		
		// concat()

	    String str = "hello" + "world";

	    // chaining method
	    String concatStr = "hello".concat("world").concat("!!").concat(" something");
	    System.out.println(concatStr);

	    // run from left to right
	    System.out.println(1 + 2 + 3);
	    System.out.println("1" + "2" + "3"); // 123
	    System.out.println("1" + 2 + 3); // 123

	    String nothing = null;
	    System.out.println(nothing);

	  // immutable
	    String str1 = "hello";
	    String str2 = "world";
	    String str3 = str1 + str2; // "helloworld"
	    System.out.println(str1.toUpperCase().charAt(2));
	    System.out.println(str1);

//	    nothing.equals("null");


		
		
		
	}

}
