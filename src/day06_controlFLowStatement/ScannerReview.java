package day06_controlFLowStatement;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
	 
		// dataType variableName = value
		Scanner scan = new Scanner(System.in); // for input u need system.in
		System.out.println("Please enter number a");
		
		// int a = 15;
		int a = scan.nextInt();		
		System.out.println("Please enter number b");
       // int b = 17;
		int b = scan.nextInt();
	   // System.out.println(a+b);
		
		int result = a + b;
		
		System.out.println(a + " + " + b + " = " + result);
		
//		System.out.println("What's your name?");
//		
//		String name = scan.next();
		
//		System.out.println("Hello" + name);
		// 7 + 4 = 11
		System.out.println (a);
		System.out.println(a + " + ");
		System.out.println(a + " + " + b);
		System.out.println(a + " + " + b + " = ");
		System.out.println(a + " + " + b + " = " + result);
		// must close the scanner
	    scan.close();	
	}

}
