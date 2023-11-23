package day11;

public class Count1to10FiveTimes {

	public static void main(String[] args) {
		
		System.out.println("For Loop");

        for (int i = 1 ; i < 6 ; i++) { // 5
            System.out.println("Iteration #"+i);
            //System.out.println(i);
            for (int b = 1; b < 11 ; b++) {
                System.out.println(b);
            }
        }
//        
        System.out.println("Do While Loop");

        for (int i = 1 ; i < 6 ; i++) { // 5
            System.out.println("Iteration #"+i);
            int count = 1;
            
            do {
                System.out.println(count);
                count++;
            }while(count <11);
        }
        
        
        System.out.println("While Loop");
        
        for (int i = 1 ; i < 6 ; i++) { // 5
            System.out.println("Iteration #"+i);
            int num = 1 ; 
            while (num <= 10) {
                System.out.println(num++);
            }
        }

    
        
        
        
        
        
    }
}
