package day11;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) {
			
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("How long do you want to wait?");
//        int time = 1;
        int time = scan.nextInt();

        
        for (int minute  = time -1 ; minute >= 0 ; minute--) {
            //System.out.println(minute);
            for (int second = 59 ; second >= 0 ; second--) {
                //System.out.println(second);
                System.out.println(minute+":"+second);
                Thread.sleep(1000);
            }
        }
        
        System.err.println("Time is up!!!");
        
        scan.close();
        
    }


		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("How long you want to wait");
//		
//		//int time = 1;
//		int time = scan.nextInt();
//		
//		for (int minute = time ; minute >= 0 ; minute--) {
//			//System.out.println(minute);			
//		    for(int second = 59 ; second >= 0 ; second--) {
//			//System.out.println(second);
//			System.out.println(minute+":"+second);
//			Thread.sleep(1000);
//		    }
//		}
//		System.err.println("Time is up!!!");
//		
//		scan.close();
	}

