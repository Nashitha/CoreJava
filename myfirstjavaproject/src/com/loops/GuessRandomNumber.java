package com.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int random = r.nextInt(10) + 1;
		int guess;
		
        for (int i = 1; i <= 3; i++) {
        	    System.out.println("Enter your guess: (1-10)");
        	    guess = sc.nextInt();
        	    if (guess == random) {
        	    	    System.out.println("Congratulations!!");
        	    } else if (guess < random) {
        	    	    System.out.println("number is too low");
        	    } else if (guess > random) {
        	    	    System.out.println("number is too high");
        	    }
        }
        System.out.println("Game over");
        System.out.println(random);
	}

}
