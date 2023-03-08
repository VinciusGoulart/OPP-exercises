package org.example.exercise12;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Schedule {

    private List<Person> person = new ArrayList<>();


    public static void play(){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Schedule array = new Schedule();
        array.addPessoa(new Person("kleber",24,1.4));
        array.addPessoa(new Person("predu",24,1.4));
        array.addPessoa(new Person("abacaxi",24,1.4));
        System.out.println(array);

        array.remover("predu");

        System.out.println(array);

        System.out.println(array.getIndex("abacaxi"));

        array.addPessoa(new Person("azul",24,1.4));
        System.out.println(array);



    }


    public Schedule() {
    }

    public Schedule(List<Person> persons) {

        this.person = persons;
    }

    public void remover(String name) {

        Person pessoa = getPerson(name);
        this.person.remove(pessoa);
    }


    public Person getPerson(String name){
       return this.person.stream().filter(person -> person.getName().equals(name)).findFirst().get();
    }
    public int getIndex(String name){
        Person person = getPerson(name);
        return  this.person.indexOf(person);

    }
    public List<Person> getPerson() {
        return person;
    }

    public void addPessoa(Person person) {

        this.person.add(person);
    }

    @Override
    public String toString() {
        return "\n" + person;
    }
}

