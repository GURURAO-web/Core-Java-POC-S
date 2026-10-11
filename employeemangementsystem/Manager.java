package com.employeemangementsystem;

public class Manager extends Employee implements BonusEligible {

    private int teamSize;

    // Constructor
    public Manager(int employeeId,
                   String name,
                   String email,
                   double baseSalary,
                   int teamSize) {

        super(employeeId, name, email, baseSalary);

        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Method overriding
    @Override
    public double calculateSalary() {

        return getBaseSalary() + calculateBonus();
    }

    // Interface method implementation
    @Override
    public double calculateBonus() {

        return teamSize * 1000;
    }

    // Method overriding
    @Override
    public void displayDetails() {

        System.out.println("------------------------------------");
        System.out.println("Employee Type : Manager");

        super.displayDetails();

        System.out.println("Team Size     : " + teamSize);
        System.out.println("Bonus         : " + calculateBonus());
        System.out.println("Final Salary  : " + calculateSalary());
        System.out.println("------------------------------------");
    }
}
