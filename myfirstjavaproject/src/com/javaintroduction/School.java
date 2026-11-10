package com.javaintroduction;

public class School {
    String name;
    int admissionYear;
    String location;
    double fee;
    
    School() {
    	name = "unknown";
    	admissionYear = 2022;
    	location = "unknown";
    	fee = 50000;
    }
    
    School(String name, int admissionYear, String location, Double fee){
    	this.name = name;
    	this.admissionYear = admissionYear;
    	this.location = location;
    	this.fee = fee;
    	
    }
	public static void main(String[] args) {
		School s = new School();
	    s.display();
	    School s1 = new School("Sri Chaitanya", 2025, "Nellore", 45000.00);
	    s1.display();
	    School s2 = new School("Narayana", 2022, "Tirupati", 55000.00);
	    s2.display(); 
        
	}
	 void display() {
		System.out.println("School Name: " + name);
		System.out.println("Admission Year: " + admissionYear);
		System.out.println("School Location: " + location);
		System.out.println("School fee: " + fee);
	}

}
