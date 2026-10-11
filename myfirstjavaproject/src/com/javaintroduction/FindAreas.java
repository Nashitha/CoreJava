package com.javaintroduction;

import java.util.Scanner;

//program to calculate area of triangle, square, circle and Rectangle
public class FindAreas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Base:");
		double base = sc.nextDouble();
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		double  triRes = findAreaOfTriangle(base, height);
		System.out.println("Area of Triangle is : " + triRes);
		
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		double cirRes = findAreaOfCircle(radius);
		System.out.println("Area of circle is: " + cirRes);
		
		System.out.println("Enter side:");
		double side = sc.nextDouble();
		double squareRes = findAreaOfCircle(side);
		System.out.println("Area of square is: " + squareRes);
		
		
		System.out.println("Enter length:");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double rectangleRes = findAreaOfRectangle(length, width);
		System.out.println("Area of Rectangle is: " + rectangleRes);
	}
	
    // finding area of triangle
	static double findAreaOfTriangle(double base, double height) {
		double triArea = 0.5 * base * height;
		return triArea;
	}
	
	//finding area of circle
	static double findAreaOfCircle(double radius) {
		double cirArea = Math.PI * radius * radius;
		return cirArea;
	}
	
	//finding area of square
	static double findAreaOfSquare(double side) {
		double squareArea = side * side;
		return squareArea;
	}
	
	//finding area of rectangle
	static double findAreaOfRectangle(double len, double width) {
		double squareArea = len * width;
		return squareArea;
	}
	

}
