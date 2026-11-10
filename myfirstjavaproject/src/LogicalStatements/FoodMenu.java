package LogicalStatements;

import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double total_price = 0;
		
		String yn = "";
		do {
	    System.out.println("Available items: Pizza, Burger, Biryani, Noodles");
		System.out.println("Enter the item no: ");
		int item = sc.nextInt();
		
		switch(item) {
		
		case 1 -> {
			System.out.println("Pizza");
			System.out.println("Enter quantity: ");
			int quantity = sc.nextInt();
			int pizza_price = 200;
			total_price = pizza_price * quantity;	
		}
		case 2 -> {
			System.out.println("Burger");
			System.out.println("Enter quantity: ");
			int quantity = sc.nextInt();
			int burger_price = 120;
			total_price = burger_price * quantity;
			 	
		}
		case 3 -> {
			System.out.println("Biryani");
			System.out.println("Enter quantity: ");
			int quantity = sc.nextInt();
			int biryani_price = 180;
			total_price = biryani_price * quantity;
				
		}
		case 4 -> {
			System.out.println("Noodles");
			System.out.println("Enter quantity: ");
			int quantity = sc.nextInt();
			int noodles_price = 100;
			total_price = noodles_price * quantity;
		}
		default -> {
			System.out.println("item not found");
		}
		}
		System.out.println("would you like to continue? (y/n)");
		yn = sc.next();
		} while(yn.equalsIgnoreCase("y"));
		System.out.println("Total price : " + total_price);
		System.out.println("Thanks for visiting");
		}
	}

	



