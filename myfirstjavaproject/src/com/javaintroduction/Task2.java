package com.javaintroduction;

public class Task2 {


		static int chocoCost = 15;
		static int cookieCost = 10;
		static int total = 450;
		
		public static void main(String[] args) {
	
			
			
			int chocoPrice =  10 * chocoCost;

			int cookiePrice = 5 * cookieCost;
			
			int purchaseAmount = chocoPrice + cookiePrice;
			
			int remain = total - purchaseAmount;
			System.out.println(remain);
		}

	}


