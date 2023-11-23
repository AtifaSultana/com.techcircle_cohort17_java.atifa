package day10_loopstasks;

import java.util.Scanner;

public class Task03WithScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        //int input = 10;
        
        int input = scan.nextInt();
        
        while (input < 1 || input > 10) {
            System.out.println("Please type a number between 1 and 10");
            input = scan.nextInt();
        }
        
        
        
        
        for (int i = 1 ; i < 11 ; i++) {
            System.out.println(input + " x "+ i + " = "+ input*i);
        }
        
        
        
        scan.close();
    }
		
		
	}


