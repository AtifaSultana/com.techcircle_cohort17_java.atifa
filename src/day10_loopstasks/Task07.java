package day10_loopstasks;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
	/* Write a program that can find the number of days in a month.*/

//      int month = 2;
//      
//      if (month >= 1 && month <=12) {
//          switch(month) {
//          case 1:
//          case 3:
//          case 5:
//          case 7:
//          case 8:
//          case 10:
//          case 12:
//              System.out.println("has 31 days");
//              break;
//          case 4:
//          case 6:
//          case 9:
//          case 11:
//              System.out.println("Has 30 days");
//              break;
//          default:
//              System.out.println("Has 28 days");
//          }
//      }else {
//          System.out.println("Invalid input");
//      }
//  
      
      
//      Scanner calender = new Scanner(System.in);
//      System.out.println("Please enter a month you wish to know the quantity of days for");
//      int month= calender.nextInt();
//      switch(month) {
//      case 1:
//          System.out.println("January has 31 days");
//          break;
//      case 2:
//          System.out.println("February has 28 or 29 days");
//          break;
//      case 3:
//          System.out.println("March has 31 days");
//          break;
//      case 4:
//          System.out.println("April has 30 days");
//          break;
//      case 5:
//          System.out.println("May has 31 days");
//          break;
//      case 6:
//          System.out.println("June has 30 days");
//          break;
//      case 7:
//          System.out.println("July has 31 days");
//          break;
//      case 8:
//          System.out.println("August has 31 days");
//          break;
//      case 9:
//          System.out.println("September has 30 days");
//          break;
//      case 10:
//          System.out.println("October has 31 days");
//          break;
//      case 11:
//          System.out.println("November has 30 days");
//          break;
//      case 12:
//          System.out.println("December has 31 days");
//          break;
//          default:
//              System.out.println("Unfortunately that is not a month");
//      }
//      calender.close();
      
      
      Scanner scan = new Scanner(System.in);
      System.out.println("please enter month :");
      int month = scan.nextInt();
      
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
          System.out.println("There is 31 days in this month");
      }else if(month == 4 || month == 6 || month == 9 || month == 11) {
          System.out.println("There is 30 days in this month");
      }else if (month == 2) {
          System.out.println("There is 28 days in this month");
      }else {
          System.out.println("Invalid Month entered");
      }
      
      scan.close();
      
      
      
      
      boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
      
      boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
      
      
      if (has31Days) {
          System.out.println("There is 31 days in this month");

      }else if (has30Days) {
          System.out.println("There is 30 days in this month");

      }else if (month == 2) {
          System.out.println("Has 28 days");
      }else {
          System.out.println("Invalid Month entered");
      }
      
      
      
  }
}