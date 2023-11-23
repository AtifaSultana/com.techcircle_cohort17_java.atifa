package day06_controlFLowStatement;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		
//      syntax:
//      condition ? trueBlock : falseBlock;
  
  int a = 50;
  int b = 45;
  
  int c = (a > b) ? 100 : 200;
  
  
  System.out.println(c);
  
  
  Scanner scan = new Scanner(System.in);
  System.out.println("Please type a number this system will tell you if your number is even or odd");
  //int num = 4;
  int num = scan.nextInt();
  
  String str = (num % 2 == 0) ? "even" : "odd";
  
  System.out.println(str);
  
  
  scan.close();
		
		
		
	}

}
