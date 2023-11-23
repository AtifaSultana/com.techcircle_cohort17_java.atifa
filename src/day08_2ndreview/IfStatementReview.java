package day08_2ndreview;

import java.util.Scanner;

public class IfStatementReview {

	public static void main(String[] args) {
		//check the recording
		
		
		
		// Write a program that takes an integer as input and prints whether the number is
		//even or odd.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("type a number, system will tell if the number is even or odd?"); 
		        int num = scan.nextInt();
		        
		        String str = (num % 2 == 0) ? "even" : "odd";
		        System.out.println(str);
		        scan.close();
		
		// DRY -> don't repeat yourself
		        
		        
		        
	}

}
