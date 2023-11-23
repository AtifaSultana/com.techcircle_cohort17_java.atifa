package day09_loop;

import java.util.Scanner;

public class EnterANumberBetween1And10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 40;
		
		if (num < 1 || num > 10) {
			System.out.println("Please type a number between 1 and 10");
		      num = scan.nextInt();
		}
		if (num >= 1 && num <= 10) {
			System.out.println(num);
		}
		scan.close();
		
	}
	
}
