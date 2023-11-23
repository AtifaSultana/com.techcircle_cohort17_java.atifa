package day13_string;

public class StringMethod_IndexOf {

	public static void main(String[] args) {
//                     0123456789     15		
		String name = "President George Washington";
		
		System.out.println(name.indent('p')); // -1 ( need capital P)
		
		System.out.println(name.indexOf('P')); // 0
		
		System.out.println(name.indexOf('e')); // 2
		
		System.out.println(name.indexOf("George")); // 10
		
		System.out.println(name.indexOf("Bob")); // -1 // not present
				
		System.out.println(name.indexOf("W")); // 17
		
		System.out.println(name.lastIndexOf('e')); // 
		
		System.out.println(name.indexOf('e', 3)); // 6
		
		System.out.println(name.lastIndexOf('e')); // 15
		
		
	}

}
