package com.javaintroduction;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter category: Clothing, Electronics, Accessories");
		 String category = sc.next();
		 
	     switch(category) {
	     case "clothing" -> {
	    	 System.out.println("Products: Jeans, Saree, Shirt, Jacket");
	    	 System.out.println("Enter product:");
	    	 String product = sc.next();
	     }
	    	 
	     case "electronics" -> {
            System.out.println("Products: Laptop, mobile, headphones, tablet");
            System.out.println("Enter Product: ");
            String product = sc.next();
         }
	     case "accessories" -> {
	    	    System.out.println("Products: watch, backpack, shoes, belts");
	    	    System.out.println("Enter product");
	    	    String product = sc.next();
        
	     }
	     default -> System.out.println("Item not found");

	}
	}
}


