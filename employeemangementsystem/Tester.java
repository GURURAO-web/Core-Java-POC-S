package com.employeemangementsystem;

public class Tester extends Employee {

    private String testingTool;

    // Constructor
    public Tester(int employeeId,
                  String name,
                  String email,
                  double baseSalary,
                  String testingTool) {

        super(employeeId, name, email, baseSalary);

        this.testingTool = testingTool;
    }

    public String getTestingTool() {
        return testingTool;
    }

    public void setTestingTool(String testingTool) {
        this.testingTool = testingTool;
    }

    // Method overriding
    @Override
    public double calculateSalary() {

        return getBaseSalary() + 3000;
    }

    // Method overriding
    @Override
    public void displayDetails() {

        System.out.println("------------------------------------");
        System.out.println("Employee Type : Tester");

        super.displayDetails();

        System.out.println("Testing Tool  : " + testingTool);
        System.out.println("Bonus         : 3000");
        System.out.println("Final Salary  : " + calculateSalary());
        System.out.println("------------------------------------");
    }
}
