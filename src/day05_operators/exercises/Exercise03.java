package day05_operators.exercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		/* Write a program that takes a user's age as input
		 *  and prints out if the user is an adult or a minor. 
		 *  The legal age of adulthood is 18 years. */
	
		// take input from the use
		// check the age
		// print adult if age is greater or equal to 18
		// print minor if age less than 18
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();  // take user input and convert it to integer
		// ternary operator
		String answer = age >= 18 ? "adult" : "minor";
		System.out.println("you are" + answer);
		scanner.close();
		
	}

}
