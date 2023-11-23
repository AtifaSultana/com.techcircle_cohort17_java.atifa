package day09_loop;

public class Task03 {

	public static void main(String[] args) {
	
//	    task:
//	    Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

		 for (int i = 1 ; i < 101 ; i++) {
	            //System.out.println(i);
	            
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println(i);

	            }else if (i % 3 == 0) {
	                System.out.println(i);
	            }else if (i % 5 == 0) {
	                System.out.println(i);
	            }
	           
	        }
		 
		 // another method
		
		for (int i = 1 ; i < 101 ; i++) {
            //System.out.println(i);
            
            if (i % 3 == 0 || i % 5 == 0 || i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
           
        }
		// another method
		
		// divisible by 3:
		for (int i = 1 ; i  < 101 ; i++) {
	          System.out.println(i);
	          if (i % 3 == 0) {
	              System.out.print(i+" ");
	          }
	      }
		System.out.println();
		
		// divisible by 5:
		 for (int i = 1 ; i  < 101 ; i++) {
	          //System.out.println(i);
	          if (i % 5 == 0) {
	              System.out.print(i+" ");
	          }
	      }
		 System.out.println();
		 
		 // divisible by 3 and 5:
		 for (int i = 1 ; i  < 101 ; i++) {
	          //System.out.println(i);
	          if (i % 3 == 0 && i % 5 == 0) {
	              System.out.print(i+" ");
			
	          }
	      }
		 System.out.println();
	
	}

}
