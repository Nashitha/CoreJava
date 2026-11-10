package com.javaintroduction;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        //int temp = a;
        //a = b;
        //b = temp;
        //System.out.println("A: " + a);
        //System.out.println("B: " + b);
        
        //without using third variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("A: " + a);
//        System.out.println("B: " + b);
        
        //using bitwise operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
        
	}

}
