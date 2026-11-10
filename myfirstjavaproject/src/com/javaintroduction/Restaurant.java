package com.javaintroduction;


import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double all_item_price = 0;
        String vyn;

        do {
            System.out.println("\nEnter category (vegg, nonvegg, desserts, drinks):");
            String catg = sc.next();

            switch (catg) {

                case "vegg" -> {
                    System.out.println("Veg items: vegBiryani, paneerBiryani, noodles, masalaDosa, burger");
                    System.out.println("Enter veg food item:");
                    String food_item = sc.next();

                    switch (food_item) {
                        case "vegBiryani" -> {
                            System.out.println("Veg biryani = 150");
                            all_item_price += 150;
                        }
                        case "paneerBiryani" -> {
                            System.out.println("Paneer biryani = 180");
                            all_item_price += 180;
                        }
                        case "noodles" -> {
                            System.out.println("Noodles = 100");
                            all_item_price += 100;
                        }
                        case "masalaDosa" -> {
                            System.out.println("Masala dosa = 80");
                            all_item_price += 80;
                        }
                        case "burger" -> {
                            System.out.println("Burger = 110");
                            all_item_price += 110;
                        }
                        default -> System.out.println("Veg item not available");
                    }
                }

                case "nonvegg" -> {
                    System.out.println("Non-veg items: chickenBiryani, chickenNoodles, chickenBurger, chicken65, fishFry");
                    System.out.println("Enter non-veg food item:");
                    String food_item = sc.next();

                    switch (food_item) {
                        case "chickenBiryani" -> {
                            System.out.println("Chicken biryani = 200");
                            all_item_price += 200;
                        }
                        case "chickenNoodles" -> {
                            System.out.println("Chicken noodles = 160");
                            all_item_price += 160;
                        }
                        case "chickenBurger" -> {
                            System.out.println("Chicken burger = 180");
                            all_item_price += 180;
                        }
                        case "chicken65" -> {
                            System.out.println("Chicken 65 = 170");
                            all_item_price += 170;
                        }
                        case "fishFry" -> {
                            System.out.println("Fish fry = 190");
                            all_item_price += 190;
                        }
                        default -> System.out.println("Non-veg item not available");
                    }
                }

                case "desserts" -> {
                    System.out.println("Desserts: iceCream, cake, brownie, gulabJamun, pudding");
                    System.out.println("Enter dessert:");
                    String food_item = sc.next();

                    switch (food_item) {
                        case "iceCream" -> {
                            System.out.println("Ice cream = 60");
                            all_item_price += 60;
                        }
                        case "cake" -> {
                            System.out.println("Cake = 90");
                            all_item_price += 90;
                        }
                        case "brownie" -> {
                            System.out.println("Brownie = 100");
                            all_item_price += 100;
                        }
                        case "gulabJamun" -> {
                            System.out.println("Gulab jamun = 50");
                            all_item_price += 50;
                        }
                        case "pudding" -> {
                            System.out.println("Pudding = 80");
                            all_item_price += 80;
                        }
                        default -> System.out.println("Dessert not available");
                    }
                }

                case "drinks" -> {
                    System.out.println("Drinks: coffee, tea, juice, milkshake, lemonade");
                    System.out.println("Enter drink:");
                    String food_item = sc.next();

                    switch (food_item) {
                        case "coffee" -> {
                            System.out.println("Coffee = 30");
                            all_item_price += 30;
                        }
                        case "tea" -> {
                            System.out.println("Tea = 20");
                            all_item_price += 20;
                        }
                        case "juice" -> {
                            System.out.println("Juice = 50");
                            all_item_price += 50;
                        }
                        case "milkshake" -> {
                            System.out.println("Milkshake = 90");
                            all_item_price += 90;
                        }
                        case "lemonade" -> {
                            System.out.println("Lemonade = 40");
                            all_item_price += 40;
                        }
                        default -> System.out.println("Drink not available");
                    }
                }

                default -> System.out.println("Category not available");
            }

            System.out.println("Do you want to continue ordering? (y/n)");
            vyn = sc.next();

        } while (vyn.equalsIgnoreCase("y"));

        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("Total price: Rs. " + all_item_price);
        System.out.println("Thank you for visiting!");

        sc.close();
    }
}
