package day09_loop;

public class DoWhileLoop {

	public static void main(String[] args) {
// Syntax
//		do {
//		statement;
//		}while (boolean condition);
		
		int i = 0;
		do {
			System.out.println("value of i is "+ i);
			
			if (i == 3) {
				break;
			}
			
			i++;
			
		}
		while (i < 5);
		
		System.out.println("value of i is "+ i);
		
		
		// down counting from 30 to 15
		
//		int count = 30;
//		
//		do {
//			System.out.println(count);
//			count --;
//		}while(count >= 15);
//		
		// down counting from 30 to 15--> display all the odd numbers.
		
				
				int count = 30;
		        do {if (count%2==1)
		                System.out.println(count);
		        count--;}
		            while (count >= 15) ;
		
		
		
	}

}
