package day10_loopstasks;

import java.util.Random;
import java.util.Scanner;

public class TaskRandomNumber {

	public static void main(String[] args) {
		 /*
        Game: Number Guessing Game with Loops

        Objective:
        Create a Java program for a number guessing game. 
        The program should generate a random number between 1 and 100, 
        and the player has to guess the correct number. 
        Provide feedback on whether the guess is too high, too low, or correct.
         Use loops to allow the player to keep guessing until they guess the correct number.

        Instructions:

        Generate a random number between 1 and 100.
        Prompt the player to guess the number.
        Use a loop to continue prompting the player until they guess the correct number.
        Provide feedback on each guess (e.g., "Too high," "Too low," "Correct!").
        End the game when the correct number is guessed.
        Count and display the number of attempts it took for the player to guess correctly.
        */
		
//        Random random = new Random();
//		
//		int num = random.nextInt(100);
//		
//		
//		
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please input number between 1 and 100");
//        
//        int input = scan.nextInt();
//        
//        int userInput = random.nextInt(1, 100);
//        
//        
//        while (input != userInput) {
//            if(userInput > input) {
//                System.out.println("The number is too low");
//            }else {
//                System.out.println("The number is too high");
//            }
//            input = scan.nextInt();
//            
            
            
		{
            
            Scanner in = new Scanner(System.in);
            System.out.println("Guess a number");

            Random random = new Random();

            for (int i = 1; i <= 2; i++) {
                int num = random.nextInt(100);
                int guess = in.nextInt();

                if (num == guess) {
                    System.out.println("Nice one");
                } else if (guess < num) {
                    System.out.println("Too low, again");
                } else {
                    System.out.println("Too high, again");
                }
            }

            int num = random.nextInt(100);
            int guess = in.nextInt();

            System.out.println("Sorry");
		
		
	}

}}
