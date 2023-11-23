package day04_review;

import java.util.Scanner;

//import java.util.Scanner;

public class RecieveUserInput {

	public static void main(String[] args) {
		// Import Statement
		
		 // Scanner class
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 1st
        
        System.out.println("Double of the input: " + (number * 2));
        
        scanner.nextLine(); // will not work (after the .nextInt())
        
        String sentence = scanner.nextLine(); // 2nd , this will work
        String word = scanner.next(); // 3rd 
        System.out.println("Nextline: " + sentence);
        System.out.println("Next: " + word);
        
        
//        System.out.println("The name is " + name + "!!");
//        
//        System.out.println("What is your second favorite hobby?");
//        String hobby = scanner.next();
//        
//        System.out.println(name + " not like to " + hobby + " too much.");
        
        // MUST close scanner at the end of the program
        scanner.close();
		 
		
 
	}

}
