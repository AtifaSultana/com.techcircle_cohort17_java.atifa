package day10_loopstasks;

public class Task04 {

	public static void main(String[] args) {
		
		
	/*Write a Java program to print sum of even number between 1 to 100.*/
		// Using forLoop:
		int sum = 0; // first declare a variable
		 for (int i = 1 ; i < 101 ; i++) {
	             if (i % 2 == 0) { // filter or condition(that only even numbers)
	            	 sum += i; // to add all the even numbers
	            }
	        }
         System.out.println(sum);
         
         // Using whileLoop
         
         int num = 0;
         int num2 =0;
         
         while(num <= 100) {
             if(num % 2 ==0) {
             num2 = num + num2;
             }
             num++;
         }
         System.out.println(num2);       
	}
	     // 
	{  
	int sum = 0;
    for (int i = 2; i <= 100; i=i+2) {
        //System.out.println(i);
        sum = sum + i;
    }
    System.out.println(sum);
	}
}
