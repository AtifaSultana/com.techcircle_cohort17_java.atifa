package day16_4thReview;

public class StringReview {

	public static void main(String[] args) {
	
		// String Review from the last week
		
		 // String
	    // class
	    // Reference
	    String myOldStr = new String("initialize string by using new keyword");
	    String myStr = "this is my String";

	    // String pool

	    String myDog = new String("Lany"); // --> store in
	    String myDog2 = "Lany"; // --> string pool
	    String myDog3 = "Lany"; // --> string pool

	    System.out.println(myDog2 == myDog); // false
	    System.out.println(myDog3 == myDog2); // true

	    // Recommend to use .equals() to compare 2 string
	    System.out.println(myDog2.equals(myDog)); // true
	    System.out.println(myDog2.equalsIgnoreCase(myDog)); // true

	    System.out.println(myDog.toString()); // will show the address of 'myDog' in memory

	    // When 'new' syntax to initialize string,
	    // you cannot use == (equal operator) to compare string value
	    // instead, you SHOULD use .equal() / .equalIgnoreCase() to compare them


	    // String can be empty
	    // can also store non-display character (new line, line feed, tab, white space)

	    String myTab = "  ";
	    String secondTab = "  ";
	    System.out.println(myTab == secondTab);

	    System.out.println("myTab is blank: " + myTab.isBlank());  // true
	    System.out.println("myTab is empty: " +myTab.isEmpty());  // false
	    System.out.println("How many char in myTab: " + myTab.length()); // 2

	    // .startsWith(), .endsWith(), .contains()  => boolean
	    //            0123456789
	    //                      0
	    String str = "hello world";
	    System.out.println("is str starts with 'He': " + str.startsWith("He"));
	    System.out.println("is str ends with 'D': " + str.endsWith("D"));
	    System.out.println("is str contains 'll': " + str.contains("ll"));
	    System.out.println(str.startsWith("ll", 2));

	    // .charAt() ->
	    str.charAt(0); // -> 1st char           h
	    str.charAt(2); // -> 3rd char           l
	    str.charAt(10); // -> 11th char         d
	    // length of str always less than str index by 1
	    str.charAt(str.length() - 1); // -> always return last char of str

	    System.out.println("==== IndexOf & lastIndexOf ====");
	    // .indexOf()
	    // .lastIndexOf()
	    //               0123456789
	    //
	    String newStr = "techcircle";
	    System.out.println(newStr.indexOf("c")); // 2
	    System.out.println(newStr.lastIndexOf("c")); // 7
	    newStr.indexOf("c", 3); // start search "c" from index 3  => 4
	    // if the char or string doesn't exist ==> -1
	    System.out.println(newStr.indexOf("zxczvxcv")); //  ---> -1
		
		
		

	}

}
