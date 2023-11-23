package day10_loopstasks;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		/*      ValidTriangle
		         A triangle is valid if the sum of all the three angles is equal to
		         180 degrees. Write a program that declares three integers pas angles
		         and check whether a triangle is valid or not.
		*/

//		int angleX = 60;
//        int angleY = 60;
//        int angleZ = 60;
//        
//        if(angleX + angleY + angleZ == 180) {
//            System.out.println("Valid Triangle");
//        }else {
//            System.out.println("inValid Triangle");
//        }
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input angle A : ");
        int angleA = scan.nextInt();
        System.out.print("Please input angle B : ");
        int angleB = scan.nextInt();
        System.out.print("Please input angle C : ");
        int angleC = scan.nextInt();
        int triangle = 180;
        while ((angleA + angleB + angleC) != triangle) {
            System.out.println("The angle is not Triagle");
            System.out.print("Please input angle A : ");
            angleA = scan.nextInt();
            System.out.print("Please input angle B : ");
            angleB = scan.nextInt();
            System.out.print("Please input angle C : ");
            angleC = scan.nextInt();
        }
        System.out.println(
                "Angle A : " + angleA + " Angle B : " + angleB + " Angle C : " + angleC + " is the triangle");
        
        
        
 }	
	}


