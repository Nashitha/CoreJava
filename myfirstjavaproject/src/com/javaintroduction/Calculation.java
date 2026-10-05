package com.javaintroduction;

public class Calculation {
       void sum() {
    	   int a = 10;
    	   int b = 20;
    	   System.out.println(a + b);
       }
       void sub() {
    	   int c = 12;
    	   int d = 5;
    	   System.out.println(c - d);
       }
       void multiply() {
    	   int m = 20;
    	   int n = 30;
    	   System.out.println(m * n);
       }
       void div() {
    	   int x = 100;
    	   int y = 50;
    	   System.out.println(x / y);
       }
       public static void main(String[] args) {
	   Calculation c = new Calculation();
	   c.sum();
	   c.sub();
	   c.multiply();
	   c.div();
	   
	}
}
