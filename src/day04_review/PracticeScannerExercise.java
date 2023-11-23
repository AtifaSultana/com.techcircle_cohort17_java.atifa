package day04_review;

import java.util.Scanner;

public class PracticeScannerExercise {

	public static void main(String[] args) {
		/* let's practice the scanner with this exercise
		Hi, my name is Alexa.
		What is your name?
		> $name
		Hi $name, how are you?
		What is your birth year?
		> $year
		Wow, you are <age> years old?
		What is your favorite activity?
		> $activity
		Oh, I like $activity too.
		It was nice to talk to you $name.
		Goodbye.*/
		
	//	method 1
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("My name is Alexa.");
//		System.out.println("What is ur name?");
//		String name = scanner.nextLine();
//		        System.out.println(" Hi "+ name +" How are you? ");
//		        System.out.println("What is your birth year?");
//		        int age = scanner.nextInt();
//		        System.out.println("Wow, you are " + age + " years old?");
//		        System.out.println("What is your favorite activity?");
//		        String activity = scanner.nextLine();
//		        System.out.println("Oh, I like $activity too.\n" +
//		                "It was nice to talk to you "+ name+".");
//		        System.out.println("Goodbye.");
//		        scanner.close();
		        
		// method 2
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Hi, my name is Alexa");
		        System.out.println("What is your name?");
		        String name = scan.next();
		        System.out.println("Hi, " + name + " how are you?");
		        System.out.println("What is your birth year?");
		        int birthYear = scan.nextInt();
		        final int THIS_YEAR = 2023;
		        int age = THIS_YEAR - birthYear;
		        System.out.println("Wow, you are " + age + " years old");
		        System.out.println("What is your favorite activity?");
		        String activity = scan.next();
		        System.out.println("Oh, I like " + activity + " too.");
		        System.out.println("It was nice to talk to you, " + name);
		        System.out.println("Goodbye");
		        scan.close();
		
	}

}
