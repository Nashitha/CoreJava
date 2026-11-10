package com.javaintroduction;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		boolean indiancitizenship = false;
		boolean voterId = false;
		if (age < 0) {
			System.out.println("Invalid age: ");
			return;
		}
		if (age >= 18) {
			System.out.println("valid age");
		} else {
			System.out.println("You are not eligible");
		} 
		
		if (indiancitizenship) {
			System.out.println("valid citizenship");
		} else {
			System.out.println("not eligible");
		}
		if (voterId) {
			System.out.println("valid voterId");
		} else {
			System.out.println("not eligible");
		}
	}
}


