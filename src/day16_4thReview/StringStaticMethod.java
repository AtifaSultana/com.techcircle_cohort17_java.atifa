package day16_4thReview;

public class StringStaticMethod {

	public static void main(String[] args) {
		// Static
	    String nothing = null;
	    String trueStr = nothing.valueOf(true);
	    System.out.println(trueStr);

	    // valueOf = cast all primitive type to String
	    String floatNumber = String.valueOf(56.3);

	    // format - format string
	    String name = "Miran";
	    String myStr = String.format("hello, %S. Are you born in %.2f?", name, 54.6785443);
	    System.out.println(myStr);

	    // token
	    // %s - string
	    // %f - float number
	    // %d - whole number
	    // %b - boolean
	    // %n - new line

	    System.out.println(String.format("you withdrew :%10d USD",10));
	    System.out.println(String.format("my balance is :%10d USD", 4566));
	}

}
