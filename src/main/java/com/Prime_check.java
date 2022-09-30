package com;

public class Prime_check {
	    static boolean isPrime(int n)
	    {
	        if (n <= 1)
	            return false;
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	             
	            	return true;
	    }
	  
	    public static void main(String args[])
	    {
	        if (isPrime(18))
	            System.out.println("A prime number");
	        else
	            System.out.println("Not a prime number");
	    }
	}

