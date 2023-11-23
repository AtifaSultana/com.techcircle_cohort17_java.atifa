package day14_strings;

public class Task01_String {

	public static void main(String[] args) {
// important interview question
		
		/* (1)	Reverse a String:
		Write a Java program to reverse a given string. 
		For example, if the input is "Hello," the output should be "olleH."
		*/
		
		String str = "Hello";
        String reverse = "";
        
        for (int i = str.length() -1 ; i >=0 ; i--) {
            
            reverse+= str.charAt(i);
        }
        
        System.out.println(str);
        System.out.println(reverse);
        
     // another way to reverse but 1st way is better
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        
        System.out.println(sb);
        
        System.out.println(sb.reverse());
		
		
        
        
        
        
        
        
	}

}
