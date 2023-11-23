package day13_string;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = "TechCircle";
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str); // TechCircle
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str);
		
		String str2 = str.toLowerCase();
		
		System.out.println(str);
		System.out.println(str2);
		str = str.toUpperCase();
		
		System.out.println(str);
		
		
		
		
		
		int num = 4;
		
		System.out.println(num);
		
		num = num +10;
		
		System.out.println(num);
		
		
		
		
	}

}
