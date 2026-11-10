package com.javaintroduction;



import java.util.Scanner;

public class POC1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Job Eligibility Checker =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter your passed-out year: ");
        int passedOutYear = sc.nextInt();

        System.out.print("Enter your qualification: ");
        String qualification = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
        } else if (!qualification.equalsIgnoreCase("Btech")) {
            System.out.println("Not eligible: B.Tech qualification required.");
        } else if (passedOutYear != 2026) {
            System.out.println("Not eligible: Only 2026 graduates can apply.");
        } else if (age < 18) {
            System.out.println("Not eligible: Minimum age is 18.");
        } else if (cgpa < 0 || cgpa > 10) {
            System.out.println("Invalid CGPA. Enter a value between 0 and 10.");
        } else if (cgpa < 8.0) {
            System.out.println("Not eligible: Minimum CGPA required is 8.0.");
        } else {
            System.out.println("\n===== Application Details =====");
            System.out.println("Name: " + name);
            System.out.println("Qualification: " + qualification);
            System.out.println("Passed-out Year: " + passedOutYear);
            System.out.println("Age: " + age);
            System.out.println("CGPA: " + cgpa);
            System.out.println("Congratulations! You are eligible.");
            System.out.println("You can apply for the job role.");
        }
        System.out.println("===== Job Role Selection =====");
        System.out.println("1. Java Developer");
        System.out.println("2. Frontend Developer");
        System.out.println("3. SQL Developer");
        System.out.println("4. Backend Developer");

        System.out.print("Choose your job role (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Selected: Java Developer");
                System.out.println("Required skills: Java, OOP, Collections");
                break;

            case 2:
                System.out.println("Selected: Frontend Developer");
                System.out.println("Required skills: HTML, CSS, JavaScript, React");
                break;

            case 3:
                System.out.println("Selected: SQL Developer");
                System.out.println("Required skills: SQL, Joins, Window Functions");
                break;

            case 4:
            	System.out.println("Selected: Backend Developer");
                System.out.println("Required skills: Java, Spring Boot, REST APIs");
                break;

            default:
                System.out.println("Invalid job role selection.");
        }

        sc.close();
    }
}
