package com.loops;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        int rem = 0;
        while (temp > 0) {
        	   rem = square % 100;
        	   temp = temp / 10;
        }
        if (rem == n) {
        	System.out.println("Given number is Automorphic");
        } else {
         	System.out.println("Given number is not Automorphic");
        }
	}

}
