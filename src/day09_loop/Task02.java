package day09_loop;

public class Task02 {

	public static void main(String[] args) {
		/* write a java program to calculate the sum of 
		 * all the numbers between 1 to 100.
		 * output = 5050;
		 * */
		
		
		 int num =100;
	        int result = (num)*(num+1)/2;
	        System.out.println(result);
	        
	        ///
	        int total = 0;
	        for (int i = 1 ; i < 101 ; i++) {
//	            System.out.println(i);
	            //total = total + i;
	            total += i;
	        }
	     // print statement has to be outside so it shows onlyh one time
	        System.out.println(total); 
	}

}
