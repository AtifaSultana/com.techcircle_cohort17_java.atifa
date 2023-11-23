package day14_strings;

public class StringMethod_Trim {

	public static void main(String[] args) {
		
		String str1 = "hello";
		System.out.println(str1.length());
		
	    String str2 = "              hello              ";
	    System.out.println(str2.length());
	    
	    System.out.println(str1.equals(str2));
		
		str2 = str2.trim();
		System.out.println(str2.length());
		
		System.out.println(str1.equals(str2));
		
		String str3 ="     hello       java      ";
		System.out.println(str3.length());
		
		str3 = str3.trim();
		System.out.println(str3.length());
		
		System.out.println(str3);
		
		
	}

}
