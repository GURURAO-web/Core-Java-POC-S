package com.employeemangementsystem;

public class Developer extends Employee implements BonusEligible {

    private String programmingLanguage;

    // Constructor
    public Developer(int employeeId,
                     String name,
                     String email,
                     double baseSalary,
                     String programmingLanguage) {

        // super keyword
        super(employeeId, name, email, baseSalary);

        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Method overriding
    @Override
    public double calculateSalary() {

        return getBaseSalary() + calculateBonus();
    }

    // Interface method implementation
    @Override
    public double calculateBonus() {

        return 5000;
    }

    // Method overriding
    @Override
    public void displayDetails() {

        System.out.println("------------------------------------");
        System.out.println("Employee Type : Developer");

        // Calling parent method
        super.displayDetails();

        System.out.println("Language      : " + programmingLanguage);
        System.out.println("Bonus         : " + calculateBonus());
        System.out.println("Final Salary  : " + calculateSalary());
        System.out.println("------------------------------------");
    }
}
