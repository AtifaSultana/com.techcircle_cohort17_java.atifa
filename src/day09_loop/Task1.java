package day09_loop;

public class Task1 {

	public static void main(String[] args) {
		// write a java program to print number between 20 to 30.
	      int count = 20;
	      
	      // while loop
	      
	      while (count <= 30) {
	    	  System.out.println(count++);
	      }
	      // do while loop
	      
	      count = 20;
	      do {
	    	  System.out.println(count++);
	      }while (count <= 30);
	      
	      // for loop
	      for (count = 20 ; count <= 30 ; count++)
	    	  System.out.println(count);
	    	  
	    	  
	      for (int i = 21; i <= 30; i++) {
	          System.out.println(i);
	      }
	}

}
