package day10_loopstasks;

import java.util.Random;
import java.util.Scanner;

public class Task10_NumberGuessingGame {

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
		        
		        
		        System.out.println("Number Guessing Game");
		        
		        System.out.println(" Generate a random number between 1 and 100.\n"
		                + "        Prompt the player to guess the number.\n"
		                + "        Use a loop to continue prompting the player until they guess the correct number.\n"
		                + "        Provide feedback on each guess (e.g., \"Too high,\" \"Too low,\" \"Correct!\").\n"
		                + "        End the game when the correct number is guessed.\n"
		                + "        Count and display the number of attempts it took for the player to guess correctly.");
		        
		        
		        Random random = new Random();
		        
		        int secretNumber = random.nextInt(100);
		        
		        Scanner scan = new Scanner(System.in);
		        
		        boolean guessedCorrectly = false;
		        
		        for (int i = 1 ; i <4 ; i++) {
		            System.out.println("Guess a number:");
		            int userInput = scan.nextInt();
		            
		            if (userInput == secretNumber) {
		                System.out.println("Congrats! You Won!!!");
		                guessedCorrectly = true;
		                break;
		            }else if (userInput > secretNumber) {
		                System.out.println("Too high.");
		            }else {
		                System.out.println("Too low.");
		            }
		        }
		    
		        if (!guessedCorrectly) {
		            System.out.println("Game over!");
		            System.out.println("Try again.");
		        }
		        
		        
		        
		        scan.close();
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		    

		}
		
		
		
		
		
	}


