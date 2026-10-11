package com.employeemangementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Parent class reference
        Employee[] employees = new Employee[10];

        int count = 0;

        while (true) {

            System.out.println();
            System.out.println("====================================");
            System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Developer");
            System.out.println("2. Add Tester");
            System.out.println("3. Add Manager");
            System.out.println("4. Display All Employees");
            System.out.println("5. Display Total Employees");
            System.out.println("6. Search Employee");
            System.out.println("7. Exit");
            System.out.println("====================================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    if (count >= employees.length) {
                        System.out.println("Employee storage is full.");
                        break;
                    }

                    System.out.println("\n--- Add Developer ---");

                    System.out.print("Enter Employee ID: ");
                    int developerId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String developerName = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String developerEmail = scanner.nextLine();

                    System.out.print("Enter Base Salary: ");
                    double developerSalary = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Programming Language: ");
                    String language = scanner.nextLine();

                    // Runtime polymorphism
                    employees[count] = new Developer(
                            developerId,
                            developerName,
                            developerEmail,
                            developerSalary,
                            language
                    );

                    count++;

                    System.out.println("Developer added successfully.");

                    break;

                case 2:

                    if (count >= employees.length) {
                        System.out.println("Employee storage is full.");
                        break;
                    }

                    System.out.println("\n--- Add Tester ---");

                    System.out.print("Enter Employee ID: ");
                    int testerId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String testerName = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String testerEmail = scanner.nextLine();

                    System.out.print("Enter Base Salary: ");
                    double testerSalary = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Testing Tool: ");
                    String testingTool = scanner.nextLine();

                    employees[count] = new Tester(
                            testerId,
                            testerName,
                            testerEmail,
                            testerSalary,
                            testingTool
                    );

                    count++;

                    System.out.println("Tester added successfully.");

                    break;

                case 3:

                    if (count >= employees.length) {
                        System.out.println("Employee storage is full.");
                        break;
                    }

                    System.out.println("\n--- Add Manager ---");

                    System.out.print("Enter Employee ID: ");
                    int managerId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String managerName = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String managerEmail = scanner.nextLine();

                    System.out.print("Enter Base Salary: ");
                    double managerSalary = scanner.nextDouble();

                    System.out.print("Enter Team Size: ");
                    int teamSize = scanner.nextInt();
                    scanner.nextLine();

                    employees[count] = new Manager(
                            managerId,
                            managerName,
                            managerEmail,
                            managerSalary,
                            teamSize
                    );

                    count++;

                    System.out.println("Manager added successfully.");

                    break;

                case 4:

                    System.out.println("\n====================================");
                    System.out.println("        ALL EMPLOYEE DETAILS");
                    System.out.println("====================================");

                    if (count == 0) {
                        System.out.println("No employees available.");
                    } else {

                        for (int i = 0; i < count; i++) {

                            // Runtime polymorphism
                            employees[i].displayDetails();
                        }
                    }

                    break;

                case 5:

                    System.out.println();
                    Employee.displayEmployeeCount();

                    break;

                case 6:

                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].getEmployeeId() == searchId) {

                            System.out.println("\nEmployee Found!");

                            // Runtime polymorphism
                            employees[i].displayDetails();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 7:

                    System.out.println("Thank you for using Employee Management System.");

                    scanner.close();

                    return;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}