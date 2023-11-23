package day13_string;

public class StringReverse {

	public static void main(String[] args) {
//		               0123
		String name = "John";
		                         
//  original code
		
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(0));
		
		for (int i = 3; i >=0 ; i--) {
			System.out.println(i);
		}
		for (int i = 3; i >=0 ; i--) {
			System.out.println(name.charAt(i));
		}
		System.out.println(name.length()); // 4 but we need 3
		                            
//  modified version
		
		for (int i = name.length() -1; i >=0 ; i--) {
			System.out.println(i);
		}
		
		for (int i = name.length() -1 ; i >=0 ; i--) {
            System.out.println(name.charAt(i));
        }
//        
        
        String test = "";
        
        for (int i = name.length() -1 ; i >=0 ; i--) {
            //System.out.println(name.charAt(i));
            test+= name.charAt(i);
        }
        
        System.out.println(name);
        System.out.println(test);
		
	}

}
