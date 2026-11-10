package com.loops;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		long res = findFactorial(n);
		System.out.println("factorial of a number " + res);
	}
	
	static long findFactorial(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

}
