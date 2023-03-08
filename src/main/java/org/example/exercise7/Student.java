package org.example.exercise7;

import java.util.Locale;

public class Student {
    private int registration;
    private String name;

    private double grade1;
    private double grade2;
    private double homeWork;

    public Student() {

    }

    public static void std() {
        Locale.setDefault(Locale.US);

        Student std = new Student(24, "Vladimir", 2, 4, 1);

        System.out.println(std);

    }


    public Student(int registration, String name, double grade1, double grade2, double homeWork) {
        this.registration = registration;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.homeWork = homeWork;
    }

    public double finalGrade() {

        if (average() >= 5.) {
            return 0;
        } else {
            return 10 - average();
        }
    }

    public double average() {
        return (grade1 * 2.5 + grade2 * 2.5 + homeWork * 2) / 7;

    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(double homeWork) {
        this.homeWork = homeWork;
    }

    @Override
    public String toString() {
        return "Student:" +
                "\nRegistration = " + registration +
                "\nName = " + name +
                String.format("Grade 1 = %.2f%n", grade1) +
                String.format("Grade 2 = %.2f%n", grade2) +
                String.format("Homework = %.2f%n", homeWork) +
                String.format("Average = %.2f%n", average()) +
                String.format("required points to final grade = %.2f%n", finalGrade());
    }
}
