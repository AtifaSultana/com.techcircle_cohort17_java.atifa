package day04_review;

public class Homework7week1 {

	public static void main(String[] args) {
		
		/**
		 * 
           input:
           
           int x = 10;
           int y = 20;
           expected output:
           x =20;
           y = 10;
           
		 */
		
		// + - * /
		
//		int x = 20;
//		int y = 36;
//		y = y-x;
//		x = x + y;
//		
//		System.out.println("x - " + x);
//        System.out.println("y - " + y);
		
		int x = 10;
        int y = 20;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
	}

}
