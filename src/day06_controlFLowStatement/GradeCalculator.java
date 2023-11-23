package day06_controlFLowStatement;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		 /*
        Task: Grade Calculator

        Write a Java program that calculates a student's grade based on their score.
         The program should:

        Prompt the user to enter their score as an integer (0-100).
        Use an if statement to determine the grade based on the following criteria:
        If the score is between 90 and 100, display "A".
        If the score is between 80 and 89, display "B".
        If the score is between 70 and 79, display "C".
        If the score is between 60 and 69, display "D".
        If the score is below 60, display "F".
        Display the calculated grade to the user.
        */
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter your score (0-100): ");
	        int score = scan.nextInt();
	        
	        String grade;
	        
	        if (score >= 90 && score <= 100) {
	            System.out.println(" A");
	        }
	        if (score >= 80 && score <= 89) {
	            System.out.println("B");
	        }
	        if (score >= 70 && score <= 79) {
	            System.out.println("C");
	        }
	        if (score >= 60 && score <= 69) {
	            System.out.println("D");
	        }
	        if (score < 60) {
	            System.out.println("F");	        	  
	          }
	        scan.close();
	}
}
