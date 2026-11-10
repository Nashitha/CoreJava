package com.javaintroduction;

import java.util.Scanner;

public class SwitchDemo {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int op = sc.nextInt();
		switch(op) {
		case 1->add(a, b);
		case 2->sub(a, b);
		case 3->mul(a, b);
		case 4-> div(a, b);
		}
		

	}
	 static int add(int a, int b) {
		 int sum = a + b;
		 System.out.println(sum);
		 return sum;
	}
	 static int sub(int a, int b) {
		return a - b;
	}
	 static int mul(int a, int b) {
		return a * b;
	}
	 static int div(int a, int b) {
		return a / b;
	}
	 static int mod(int a, int b) {
		return a % b;
	}
	 

}
