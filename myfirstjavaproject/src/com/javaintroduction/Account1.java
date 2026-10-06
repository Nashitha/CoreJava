package com.javaintroduction;

public class Account1 {
     static int balance = 1000;
     int amount = 500;
     void deposit() {
    	 System.out.println(balance + amount);
     }
     void withdraw() {
    	 System.out.println(balance - amount);
     }
     public static void main(String[] args) {
    	 Account1 ac = new Account1();
    	
    	 ac.deposit();
    	 ac.withdraw();
	}
     
}
