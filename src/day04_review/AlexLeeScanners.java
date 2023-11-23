package day04_review;

import java.util.Scanner;

public class AlexLeeScanners {

	public static void main(String[] args) {
		// we get input from our scanners
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = scan.next();
		
		System.out.println("What's your age");
		int age = scan.nextInt();
		
		System.out.println("What's your senior quote?");
		String quote = scan.next();
		
		//quote = quote + scan.nextLine();
		// or you can do it like this as well (for the line after first word)
		//  quote += scan.nextLine();
		quote += scan.nextLine();
		
	//	System.out.println("Thank you " + name + ", you are " + age + " years old");
		System.out.println("Thank you " + name + ", you are " + age + " years old");
		
		System.out.println("and senior quote is " + quote);
	}
}
