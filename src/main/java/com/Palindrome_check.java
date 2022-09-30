package com;

import java.io.*;
import java.util.*;

public class Palindrome_check {
public static boolean Number(int num) {
		
		int remainder, storeOriginalNumber, sum;
		sum = 0;
		storeOriginalNumber = num;
		while(num > 0) {
			remainder = num % 10;
			sum = (sum*10) + remainder;
			num = num / 10;
		}
		
		if(storeOriginalNumber != sum) {
			return false;
		}
		return true;

			/*
			 * Scanner sc = new Scanner(System.in); //To take input from user
			 * System.out.println("Enter number: "); String reverse = ""; String num =
			 * sc.nextLine(); int length = num.length(); for ( int i = length - 1; i >= 0;
			 * i-- ) reverse = reverse + num.charAt(i); if (num.equals(reverse))
			 * System.out.println("Palindrome"); else System.out.println("Not Palindrome");
			 */    
	  }

	public String evaluate(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	} 

