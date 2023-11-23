package day10_loopstasks;

public class Task09 {

	public static void main(String[] args) {
		
		
		/*
		Write a program that will print out all alphabet letters

		Write a program that will print out all alphabet letters in backwards*/
		
		
//      char letter = 'z';
//      int refNum = letter;
//      System.out.println(refNum);
      
      
      for (int num = 'a' ; num <= 'z' ; num++) {
          char actualLetter = (char)num;
          System.out.println(actualLetter);
      }
      
      
      
      for (char num = 'A' ; num <= 'Z' ; num++) {
          System.out.println(num);
      }
      
      
      for (char num = 'Z' ; num >= 'A' ; num--) {
          System.out.println(num);
      }	
	}
}
