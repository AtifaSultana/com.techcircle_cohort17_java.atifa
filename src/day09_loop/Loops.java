package day09_loop;

public class Loops {

	public static void main(String[] args) {
		
		   
//      display odd number between 1 and 15
      
      // while loop
      
      int a = 1;
      
      while (a < 16) {
          if (a % 2 != 0) {
              System.out.println(a);
          }
          a++;
      }
      
      System.out.println("Value of a is "+a); //16
      a = 1;
      System.out.println("Value of a is "+a); //1

      do {
          if (a % 2 != 0) {
              System.out.println(a);
          }
          a++;
      }while (a < 16);
      
      System.out.println("Value of a is "+a); //16

      
      
      for (int i = 1; i < 16 ; i++ ) {
          if (i % 2 == 1) {
              System.out.println(i);
          }
      }
      
 
  
     
      
      
      
      
      
      }    
  }

