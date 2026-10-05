package com.javaintroduction;

public class Student {
	int rollno = 1;
	int marks = 80;
	String name = "Siri";
     static {
    	 System.out.println("ASIT");
     }
     {
    	 System.out.println("Student object created");
     }
     void studentDetails() {
    	 System.out.println("Student name: " + name );
    	 System.out.println("Student marks: " + marks);
    	 System.out.println("Student roll no: " + rollno);
     }
     static void display() {
    	 System.out.println("College id : 2h");
     }
     public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.studentDetails();
		display();
		s2.studentDetails();
		
	}

}
