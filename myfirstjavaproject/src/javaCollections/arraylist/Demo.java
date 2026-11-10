package javaCollections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("virat");
		names.add("shreyas");
		names.add("Rohit");
		names.add("sky");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		List<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.remove(2);// removes the index
		number.remove(Integer.valueOf(40));// removes the object
		System.out.println(number);

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("apple");
		fruits.add("orange");
		if (fruits.contains("Mango")) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}

		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(10);
		num.add(15);
		num.add(20);
		int sum = 0;
		for (int i = 0; i < num.size(); i++) {
			sum = sum + num.get(i);
		}
		System.out.println("Sum: " + sum);

		ArrayList<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		// if you want to set or change value then you have use set method
		// inside set give index which you want to change and what value you give
		colors.set(1, "yellow");

		// if you don't know the index ahead of time, find it first with indexOf
		int pos = colors.indexOf("red");
		colors.set(pos, "pink");
		System.out.println("Colors: " + colors);

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(45);
		numbers.add(7);
		numbers.add(89);
		numbers.add(23);
		int count = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > 20) {
				count++;
			}
		}
		System.out.println("count: " + count);
       
	    
	}

}
