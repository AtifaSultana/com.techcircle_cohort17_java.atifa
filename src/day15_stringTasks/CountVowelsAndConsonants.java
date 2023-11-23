package day15_stringTasks;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
	//Count Vowels and Consonants:
	//Write a Java program to count the number of vowels and consonants in a given string.
		
//		String str = "techCircle";
//		String vowels = "aeiou";
//		int vowelcount = 0;
		
		
		String str = "TechCircle@#$@12313aaabbb";
        String vowels = "aeiou";
        int volwelCount = 0;
        int ConsonantCount = 0;
        int specialCharCount = 0;
        int digitCount = 0;
        str = str.toLowerCase();
        for (int i = 0 ; i < str.length() ; i++) {
            
            char currentChar = str.charAt(i);

            if (vowels.contains(""+currentChar)) {
                volwelCount++;
            }else if (currentChar >= 'a' && currentChar <= 'z') {
                ConsonantCount++;
            }else if (currentChar >= '0' && currentChar <= '9') {
                digitCount++;
            }else {
                specialCharCount++;
            }
        }
        
        
        System.out.println(volwelCount);
        System.out.println(ConsonantCount);
        System.out.println(digitCount);
        System.out.println(specialCharCount);
		
		
		
		
        
//		String str = "TechCircle";
//        String vowels = "aeiou";
//        int vCount = 0;
//        
//        for (int a = 0 ; a < str.length() ; a++) {
//            for (int b = 0 ; b < vowels.length(); b++ ) {
//                if (vowels.charAt(b)==str.charAt(a)) {
//                    vCount++;
//                }
//            }
//        }
//        System.out.println(vCount);
		
		
		
		
		
	}

}
