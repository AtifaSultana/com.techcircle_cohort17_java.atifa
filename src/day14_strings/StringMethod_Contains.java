package day14_strings;

public class StringMethod_Contains {

	public static void main(String[] args) {
		
	String title = "Robert Rubin: The biggest risks to the US economy are political, not financial";
		
		System.out.println(title.contains("US economy"));
		System.out.println(title.contains("economy"));
		System.out.println(title.contains("Economy")); // False
		
		
		System.out.println(title.indexOf("economy")); // true
		System.out.println(title.indexOf("Economy")); // -1 or false
		
		
		
		
	}

}
