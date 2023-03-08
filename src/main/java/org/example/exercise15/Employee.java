package org.example.exercise15;

public class Employee {

    private String name;
    private String lastName;
    private double salary;

    private static int allEmployees = 0;


    public Employee() {

    }




    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.setSalary(salary);
        allEmployees++;
    }

    public static int AllEmployees(){
        return allEmployees;
    }

    public void salaryIncrease() {
        this.salary *= 1.1;
        System.out.println("Updated data: ");
    }

    public double annualSalary() {
        return salary * 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    @Override
    public String toString() {
        return "Employee: \n" +
                " Name: " + name +
                ".\n LastNam: " + lastName +
                String.format("%n Salary: $%.2f.%n",  salary ) +
                String.format(" Annual salary: $%.2f.%n",  annualSalary() ) ;

    }

}

