package EMPLOYEE;

public class Employee {
    private double salary;

    // Constructor to initialize the salary
    public Employee(double initialSalary) {
        this.salary = initialSalary;
    }

    // Method to increase the salary
    public void increase(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    // Method to get the current salary
    public double getPay() {
        return this.salary;
    }
}