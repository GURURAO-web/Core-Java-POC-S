package com.employeemangementsystem;

public abstract class Employee {

    // Encapsulation
    private int employeeId;
    private String name;
    private String email;
    private double baseSalary;

    // final variable
    public static final String COMPANY_NAME = "ABC Technologies";

    // static variable
    private static int employeeCount = 0;

    // Constructor
    public Employee(int employeeId, String name, String email, double baseSalary) {

        // this keyword
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;

        employeeCount++;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Normal method
    public void displayDetails() {

        System.out.println("Company       : " + COMPANY_NAME);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Email         : " + email);
        System.out.println("Base Salary   : " + baseSalary);
    }

    // Static method
    public static void displayEmployeeCount() {

        System.out.println("Total Employees: " + employeeCount);
    }
}