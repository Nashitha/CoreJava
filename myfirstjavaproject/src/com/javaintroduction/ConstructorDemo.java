package com.javaintroduction;

public class ConstructorDemo {
    static int count = 0;
    
	ConstructorDemo() {
		System.out.println("Constructor called");
		count++;
	}
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
        System.out.println("Object count: " + count);
	}

}
