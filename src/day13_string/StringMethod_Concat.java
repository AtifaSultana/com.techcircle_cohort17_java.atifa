package day13_string;

public class StringMethod_Concat {

	public static void main(String[] args) {
		
	//	String str1 = "re", str2 = "think", str3 = "ing";
		String str1 = "re";
		String str2 = "think";
		String str3 = "ing";
		int num = 2;
		
		String result = str1 + str2 + str3;
		
		System.out.println(result);
		
		result = result + num;	
		System.out.println(result);
		
		// OR we can also write like this
		String result2 = str1.concat(str2).concat(str3);
		System.out.println(result2);
		
	//	result = result2.concat(num);
		
		String word = "";
		char letter1 = 'j';
		char letter2 = 'a';
		char letter3 = 'v';
		
		System.out.println(word);
		
		word += letter1;
		
		System.out.println(word);
		
        word += letter2;
		
		System.out.println(word);
		
        word += letter3;
		
		System.out.println(word);
		
        word += letter2;
		
		System.out.println(word);
		
		
		
	}

}
