package com.loops;

import java.util.Scanner;

public class Prime {
    
	static boolean isPrime(int n) {
		boolean status = true;
		
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (n == 1 || n == 0) {
			return;
		}
		int count = 0;
	    for(int i = 2; i <= n; i++) {
	    	
		   if(isPrime(i)) {
			   count++;
			   System.out.println ( i + " " + count);
			  
		   }
	   }

	}

}
