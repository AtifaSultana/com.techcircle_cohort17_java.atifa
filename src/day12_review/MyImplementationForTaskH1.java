package day12_review;

import java.util.Scanner;

public class MyImplementationForTaskH1 {

	public static void main(String[] args) {
	    // Prompt for: driver lastName, firstName, age, speedLimit, actual speed,
	    // and whether you are in a construction zone.
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter driver last name:");
	    String lastName = sc.next();
	    System.out.println("Enter driver first name:");
	    String firstName = sc.next();
	    System.out.println("Enter driver age:");
	    int age = sc.nextInt();
	    System.out.println("Enter speed limit:");
	    int limit = sc.nextInt();
	    System.out.println("Enter actual speed:");
	    int actualSpeed = sc.nextInt();
	    System.out.println("Is it in construction zone? (y/n)");
	    boolean constZone = sc.next().charAt(0) == 'y';
	    sc.close();

	    int diffSpeed = actualSpeed - limit;
	    int perFive = diffSpeed / 5;
	    int fine = 0;

	//2. else if driver is over limit by 20mph or less,
	    if (diffSpeed > 5 && diffSpeed <= 20)
	      fine = (perFive) * 30; // charge $30 per every 5mph over limit.
	//3. else if driver is more than 20mph over limit
	    else if (diffSpeed > 20)
	      fine = perFive * 50; // charge $50 per every 5 mph over limit.
	//5. if the violation occurred in a construction zone,
	    if (constZone)
	      fine = fine * 2; // you are to DOUBLE the fine.
	//6. if driver is under 21 AND more than 20mph over limit then you must
	    if (age < 21 && diffSpeed > 20)
	      fine = fine + 300; //add a straight $300 underage speeder fine.

	    System.out.println("=======REPORT=======");
	    System.out.println();
	    System.out.println("Driver Name:\n\t" + firstName + " " + lastName);
	    System.out.println("Age:\n\t" + age + " years old");
	    System.out.println("Speed Limit:\t\t" + limit);
	    System.out.println("Actual Speed:\t\t" + actualSpeed);
	    System.out.println("Construction Zone:\t" + (constZone ? 'Y' : 'N'));
	    System.out.println("Speeding Fine:\t\t" + fine);
	    System.out.println();
	    System.out.println("====================");
	    
	}

}
