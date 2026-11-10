package LogicalStatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Connection type : (domestic / commercial)");
		String conn = sc.nextLine();
		int totalbill = 0;
		System.out.println("Enter units: ");
		int units = sc.nextInt();
		switch (conn) {
		case "domestic" -> {
			if (units <= 100) {
				System.out.println("charge per unit : 2");
				totalbill = units * 2;
			} else {
				System.out.println("charge per unit : 3");
				totalbill = units * 3;
			}
			System.out.println("Total bill: " + totalbill);
			
		}
		case "commercial" -> {
			
			if (units <= 100) {
				System.out.println("charge per unit : 4");
				totalbill = units * 4;
			} else if(units > 100 && units <= 300){
				System.out.println("charge per unit : 6");
				totalbill = units * 6;
			}
			else {
				System.out.println("charge per unit : 8");
				totalbill = units * 8;
			}
		   
		
		System.out.println("Total bill: " + totalbill);

	}

	}
}
}
