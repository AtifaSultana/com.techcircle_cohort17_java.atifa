package day10_loopstasks;

public class Task03 {

	public static void main(String[] args) {
		
		/*write a Java program that ask the user to input a positive integer. 
		 * It should then print the multiplication table of that number.
		 * input = 10
		 * output:
		 * 10 * 1 = 10
		 * 10 * 2 = 20
		 * 10 * 10 = 100
		 */
	
		
		 int input = 10;
	        
//       output:
//           10 X 1 = 10
//           10 X 2 = 20
//           ..
//           10 X 10 = 100
       
       
       for (int i = 1 ; i <= 10 ; i++) {
           ///System.out.println(i);
           
//           System.out.println(input);
//           System.out.println(input+ " X ");
//           System.out.println(input+ " X "+ i);
//           System.out.println(input+ " X "+ i+ " = ");
           System.out.println(input+ " X "+ i+ " = " + input*i);



       }

}}
