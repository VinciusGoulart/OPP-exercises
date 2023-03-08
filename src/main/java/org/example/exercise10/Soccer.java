package org.example.exercise10;

import org.example.exercise8.Calendario;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Soccer {

    private String name;
    private String position;
    private String nationality;

    private double hight;
    private double weight;

    private Calendario birthday;

    public Soccer() {

    }

    public static void ss(){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Calendario dd = new Calendario(LocalDate.of(1999,5,7));

        Soccer player = new Soccer("kleber",dd,"Atacante","Brasileiro",1.4,85);

        System.out.println(player);

    }


    public Soccer(String name, Calendario birthday, String position, String nationality, double hight, double weight) {
        this.name = name;
        this.birthday = birthday;
        this.position = position;
        this.nationality = nationality;
        this.hight = hight;
        this.weight = weight;
    }

    public int age() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(this.birthday.getDate(), currentDate);
        return period.getYears();
    }

    public int retiree() {
        int re = 0;
        if (this.position.equals("Atacante")) {
            re = 35 - this.age();
        } else if (this.position.equals("Meio-campo")) {
            re = 38 - this.age();
        } else if (this.position.equals("Defesa")) {
            re = 40 - this.age();
        }
        return re;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Calendario getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendario birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Soccer:\n" +
                "Name: " + name +
                "\nPosition:" + position +
                "\nNationality: " + nationality +
                "\nHight: " + hight + "kg" +
                "\nWeight: " + weight + "m" +
                "\nBirthday " + birthday +
                "\nAge :" + age() + " years old" +
                "\nYears to retiree: " + retiree();

    }


}
