package day11;

public class PrintThePattern {

	public static void main(String[] args) {
		//Task01
		/*
		 *****
		 *****
		 *****
		 *****
		 
		  */
		
		int n = 5;
		int m = 5;
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1; j <= m ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
        System.out.println("Task1");
        
        
        for (int row = 1 ; row <6 ; row++) {
            for (int i = 1 ; i <= 5 ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		
		//Task2
        /*       
        1 * * * * 
        * 2 * * *
        * * 3 * *
        * * * 4 *
        * * * * 5
        */
        System.out.println("Task2");
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//         // Print asterisks and spaces
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//            }
//
//         // Print numbers
//            System.out.println(i);  
//    
//
//            // Move to the next line after each row
//            System.out.println();
//        }
        
//        for (int row = 1 ; row <6 ; row++) {
//            for (int i = 1 ; i <= 5 ; i++) {
//                System.out.print("* ");
//                
//                if (row == column) {
//                System.out.print()	
//                }
//            }
//            System.out.println();
//        }
	
	

	/*
	 * Task3
	 * 
	 * 1 
	 * 2 2 
	 * 3 3 3 
	 * 4 4 4 4 
	 * 5 5 5 5 5
	 * 
	 */
        System.out.println("Task3");
	for(int row = 1;row<=5;row++)
	{
		// System.out.println(row);

		for (int column = 1; column <= row; column++) {
			System.out.print(row + " ");
		}
		System.out.println();
	}

	/*
	 * Task4
	 * 
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 * 1 2 3 4 
	 * 1 2 3 4 5
	 */
	System.out.println("Task4");
	for(int row = 1 ; row < 6 ; row++) {
        for(int column = 1 ; column < 6 ; column++) {
            if ( row == column)
            System.out.print(row +" ");
            else if (row>column) {
                System.out.print(column+" ");
            }
        }
        System.out.println();
	}

	
	
	
	
	
	/*
	 * Task5
	 * 
	 * 5 4 3 2 1 
	 * 4 3 2 1 
	 * 3 2 1 
	 * 2 1 
	 * 1
	 * 
	 */
	System.out.println("Task5");
	
	for(int row = 5 ; row > 0 ; row--) {
		System.out.print(row +" ");
		for (int column = row ; column > 0 ; column--) {
			System.out.print(column +" ");
		}
		System.out.println();
	}
	
	//____________________________________________________//
	 /*
    
     **********
     **********
     **********
     **********
     **********

     */
     
     
     //String str = "**********";
     
     for (int i = 0 ; i < 5 ; i++) {
         //System.out.println(str);
         for (int k = 0; k<10 ; k++) {
             System.out.print("*");
         }
         System.out.println();
     }
     
     
     
     //Task1
     /*
     
     * * * * * 
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */
     System.out.println("Task1");
     
     
     for (int row = 1 ; row <6 ; row++) {
         for (int i = 1 ; i <= 5 ; i++) {
             System.out.print("* ");
         }
         System.out.println();
     }
     
     
     
     
     
     
     
     //Task2
     /*
     
     1 * * * * 
     * 2 * * *
     * * 3 * *
     * * * 4 *
     * * * * 5

     */
     
     System.out.println("Task2");
     
     
     for (int row = 1 ; row <6 ; row++) {
         for (int column = 1 ; column <= 5 ; column++) {
             
             if (row == column) {
                 System.out.print(row + " ");
             }else {
                 System.out.print("* ");

             }
             
         }
         System.out.println();
     }
     
     
     
     
     
     
     /*
     Task3
     
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
     
     */
     
     for (int row = 1 ; row <= 5 ; row++) {
         //System.out.println(row);
         
         for (int column = 1 ; column <= row ; column++) {
             System.out.print(row +" ");

         }
         
         System.out.println();
         
     }
     
     
     
     
     
     
     /*
     Task4
     
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     
     */
     
     
     
     for (int row = 1 ; row <= 5 ; row++) {
         //System.out.println(row);
         
         for (int column = 1 ; column <= row ; column++) {
             System.out.print(column +" ");

         }
         
         System.out.println();
         
     }
     
     
     
     
     
     
     /*
     Task5
     
     5 4 3 2 1
     4 3 2 1
     3 2 1
     2 1
     1
     
     */
     
     System.out.println("Task5");
     for (int row = 5 ; row > 0 ; row--) {
         for (int column = row ; column > 0 ; column--) {
             System.out.print(column+" ");
         }
         System.out.println();
     }
     
     
     
     
     
     
     
     
     
     
     
     
  
	
	
	
}}
