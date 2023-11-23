package day13_string;

public class StringMethod_CharAt {

	public static void main(String[] args) {
		
		   //         0123456789
		String str = "TechCircle";
		   //          0123
		String word = "java";
		
		System.out.println(str.charAt(0));
		
		char letter = str.charAt(5);
		
		System.out.println(letter);
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		
		System.out.println("__________________");
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
		//	System.out.println(word.charAt(3));
			System.out.println(word.charAt(i));
		}
	    System.out.println("__________________");
	    
	    
			for (int i = 0; i < word.length(); i++) {
				System.out.println(i);
			//	System.out.println(word.charAt(3));
				System.out.println(word.charAt(i));
				}
		System.out.println("__________________");
			 
			for (int i = 0 ; i < str.length() ; i++) {
				System.out.println(i);
				System.out.println(str.charAt(i)); //
				
			}
			 
			 
	

	}}
