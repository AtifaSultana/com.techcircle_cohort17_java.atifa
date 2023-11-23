package day14_strings;

public class ConvertNumberToString {

	public static void main(String[] args) {
		
		int num = 100;
		int num2 = 50;
		double price = 9.99;
		float amount = 19.99f;
		
		int result = num + num2;
		
		System.out.println(result);
		
		double result2 = price + amount;
		
		System.out.println(result2);
		
		String str1 = ""+num;
		String str2 = ""+num2;
		String str3 = ""+price;				
		String str4 = ""+amount;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str1 + str2);
		System.out.println(str3 + str4);
		
		
		System.out.println(str3.indexOf('.'));
	//	System.out.println(price);

		double total = 1299.85;
		
		String totalStr = Double.toString(total);
		String tptalStr1 = "1299.85";
	
		System.out.println(totalStr.contains("99"));
		
	//  Primitive           wrapper (or Object)
//		char                   Character
//		byte                   Byte
//		short                  Short
//		int                    Integer
//		float                  Float
//		long		           Long
//		double                 Double
		
		String str5 = String.valueOf(num);
		
		System.out.println(str5); //100
		
		System.out.println(str5.endsWith("00"));
		
		
		String str6 = String.valueOf(total);
        System.out.println(str6);
        System.out.println(str6.length());
        System.out.println(str6.charAt(4));
	
	}

}
