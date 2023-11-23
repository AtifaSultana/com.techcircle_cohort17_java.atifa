package day14_strings;

public class RemoveDuplicates {

	public static void main(String[] args) {

//      Remove Duplicates:
//      Create a Java program to remove duplicate characters from a string.
  
//  input:
//      abbcccc
//  output:
//      abc
		
		 // we will do it inside the loop
		
//                    0123456
//      String str = "abbcccc";
//      
//      String unique = "";
//      
//      
//      char firstLetter = str.charAt(0);
//      
//      System.out.println(firstLetter);
//      
//      
//      System.out.println(unique);
//      
//      System.out.println(unique.indexOf(firstLetter)); //
//      
//      if (unique.indexOf(firstLetter) == -1) {
//          unique += firstLetter;
//      }
//      
//      System.out.println(unique);
//
//      if (unique.indexOf(str.charAt(1)) == -1) {
//          unique += str.charAt(1);
//      }
//      
//      System.out.println(unique);
//
//      if (unique.indexOf(str.charAt(2)) == -1) {
//          unique += str.charAt(2);
//      }
//      
//      System.out.println(unique);
//      
//      if (unique.indexOf(str.charAt(3)) == -1) {
//          unique += str.charAt(3);
//      }
//      
//      System.out.println(unique);	
		

		// also see
		
		String str = "abbcccc123123123123sasdfwfd";
        
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('d'));
        System.out.println(str.indexOf('z'));

        
        String unique = "";
        
        for (int i = 0 ; i < str.length() ; i++) {
            //System.out.println(i);
            //System.out.println(str.charAt(i));
            if (unique.indexOf(str.charAt(i)) == -1) {
                unique += str.charAt(i);
            }
            
            
        }
        
        String str2 = "";
        
        
        for (int i = 0 ; i < str.length() ; i++) {
            if (!str2.contains(String.valueOf(str.charAt(i)))) {
                str2 += str.charAt(i);
                        
            }
        }
        
        
        System.out.println("str2:"+str2);
        
        
        
        System.out.println("unique:"+unique);
        
        
        String str3 = "";
        for (int i = 0 ; i < str.length() ; i++) {
            if (!str3.contains(""+str.charAt(i))) {
                str3 += str.charAt(i);
                        
            }
        }
        
        System.out.println("str3:"+str3);
        
        
        String str4 = "";
        
        for (int i = 0 ; i < str.length() ; i++) {
            
            char currentChar = str.charAt(i);
            
            String currentStr = Character.toString(currentChar);
            
            
            if (!str4.contains(currentStr)) {
                str4 += currentChar;
            }
            
        }
        
        
        System.out.println(str4);	
 
		
		
		
		
		
	}

}
