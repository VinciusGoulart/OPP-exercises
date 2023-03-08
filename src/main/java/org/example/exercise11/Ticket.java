package org.example.exercise11;

import java.util.Locale;
import java.util.Scanner;

public class Ticket {
    private double price;

    public static void tt(){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Ticket tct = new Ticket(50);
        TicketVip tctv = new TicketVip(100);

        tct.print();
        tctv.print();
    }

    public Ticket(double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print(){
        System.out.printf("%.2f$%n ", price);

    }
}
