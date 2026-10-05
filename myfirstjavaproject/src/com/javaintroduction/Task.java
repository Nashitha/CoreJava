package com.javaintroduction;

public class Task {
	  int rollno;
	  String name;
	  String course;
	  int sub1Marks;
	  int sub2Marks;
	  int sub3Marks;
	  
	  
      void displayStudentDetails() {
    	 System.out.println("Student rollno : " + rollno);
    	 System.out.println("Student Name : " + name);
    	 System.out.println("Student Course : " + course);
      }
      int total;
      void calculateTotal() {
    	  total = sub1Marks + sub2Marks + sub3Marks;
    	   System.out.println(total);
      }
      int avg;
      void calculateAverage() {
    	  avg = total / 3;
    	  System.out.println(avg);
      }
      public static void main(String[] args) {
		Task t = new Task();
		t.rollno = 101;
		t.name = "Nashitha";
		t.course = "JFS";
		t.sub1Marks = 20;
		t.sub2Marks = 18;
		t.sub3Marks = 15;
		t.displayStudentDetails();
		t.calculateTotal();
		t.calculateAverage();
	}
}
