package org.example.exercise15;

import java.util.Locale;

public class EmployeeTest {
    public static void emp(){
        Locale.setDefault(Locale.US);

        Employee emp1 = new Employee("Jão","Gomes",444);
        Employee emp2 = new Employee("Niltinho","Ferrary",333);

        System.out.println(emp1);
        System.out.println(emp2);

        emp1.salaryIncrease();
        System.out.println(emp1);

        emp2.salaryIncrease();
        System.out.println(emp2);
        System.out.println(Employee.AllEmployees());;

    }
}
