package com.operators;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
        int n = sc.nextInt();
        String res = (n >= 0) ? "Positive" :  "Negative";
        System.out.println(res);
	}

}
