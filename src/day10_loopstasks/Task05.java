package day10_loopstasks;

public class Task05 {

	public static void main(String[] args) {
		/*Write a java program to print sum of odd number between 1 to 100.*/
		
		int sum = 0;
		
        for (int i = 1; i<=100; i++) {
            if (i % 2 == 1) { // for odd numbers
               // sum += i; or we can also write it like this,
            	sum = sum + i;
            }
        }
        System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}
}
