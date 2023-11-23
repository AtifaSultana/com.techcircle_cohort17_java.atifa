package day14_strings;

import java.util.Scanner;

public class PalindromChecking {

	public static void main(String[] args) {
		
		
		/*
		 * (2)	Check for Palindrome:
			Create a Java program to check whether a given string is a palindrome or not. 
			A palindrome is a string that reads the same forwards and backward.
		 */
		
      // hannah , anna , civic , level, madam
        
        String str = "level";
        String reverse = "";
        
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        
        //System.out.println(reverse);
        
        System.out.println(str);
        System.out.println(reverse);
        
        System.out.println(str.equals(reverse));
        System.out.println(str.equalsIgnoreCase(reverse));
        
        
        
        
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println(str + " is a palindrome");
        }else {
            System.out.println(str + " is not a palindrome");
        }	
		
           }

	  }


