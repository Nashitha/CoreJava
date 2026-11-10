package com.javaintroduction;

import java.util.Scanner;

public class MethodsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int res1 = sum(10, 20);
		System.out.println("The sum of two Integers: " + res1);
		
		System.out.println("Enter m and n: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		sub(m, n);
		squareOfNumber();

	}
	//method to add two integers
	static int sum(int a, int b) {
		int sum = a + 10;
		return sum;
	}
	
	//method to subtract two numbers
	
	static void sub(int m, int n) {
		int diff = m - n;
		System.out.println("Difference of two numbers: " + diff);
	}
	
	//method to calculate the square of a number
	
	static int squareOfNumber() {
		int square = 5 * 5;
		return square;
	}

}
