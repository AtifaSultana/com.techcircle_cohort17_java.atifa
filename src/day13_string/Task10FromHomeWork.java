package day13_string;

public class Task10FromHomeWork {

	public static void main(String[] args) {
	// Write a program to check if a given number is prime or not using a for loop.
		
        
        
        //a whole number greater than 1 that cannot be exactly divided by any whole number 
        //other than itself and 1 (e.g. 2, 3, 5, 7, 11).
        
        int num = 61;
        
        boolean isPrimeNumber = true;
        
        for (int i = 2 ; i < num ; i++) {
            
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }          
        }    
        if (isPrimeNumber) {
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");

        }
		
		
		
		
	}

}
