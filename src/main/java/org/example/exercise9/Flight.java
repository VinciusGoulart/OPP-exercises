package org.example.exercise9;

import org.example.exercise8.Calendario;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Flight {

    private int flight;
    private String name;
    private Calendario data;
    private int passengers;

    public Flight() {

    }

    public static void ff() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int i = 0;
        int j = 0;
        int[][] seat = new int[6][20];

        Calendario data = new Calendario(LocalDate.of(02, 04, 20));


        Flight flt = new Flight(1489, "BRA-JAP", data, 89);

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 20; j++) {
                seat[i][j] = (int) Math.floor(Math.random() * 2);
            }

        }

        System.out.println();
        for (i = 0; i < 6; i++) {
            System.out.print(i + "- ");
            for (j = 0; j < 20; j++) {
                System.out.print(seat[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
            if (i % 2 != 0) {
                System.out.println();
            }
        }
        System.out.println(flt);
        flt.nearSeat(seat);
        System.out.println("To check a seat, please show me a LINE and COlUMN");
        flt.verifi(seat, 5, 2);
        flt.occup(seat, 5, 2);
        System.out.println("Total of free seats: " + flt.freeSeats(seat));


    }


    public Flight(int flight, String name, Calendario data, int passengers) {
        this.flight = flight;
        this.name = name;
        this.data = data;
        this.passengers = passengers;
    }

    public void nearSeat(int seat[][]) {
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[0].length; j++) {
                if (seat[i][j] == 0) {
                    System.out.println("Near free seat is :L= " + i + " C= " + j);
                    i = 6;
                    j = 20;

                }
            }

        }
    }


    public boolean verifi(int[][] seat, int i, int j) {

        if (seat[i][j] == 0) {
            System.out.println("This seat is free");
            return true;
        } else {
            System.out.println("This seat is occupied");
        }
        return false;

    }

    public boolean occup(int[][] seat, int i, int j) {
        if (seat[i][j] == 0) {
            seat[i][j] = 1;
            System.out.println("Seat claimed");
            return true;
        }
        return false;

    }

    public int freeSeats(int[][] seat) {
        int freeSeats = 0;
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[0].length; j++) {

                if (seat[i][j] == 0) {
                    freeSeats++;
                }
            }
        }
        return freeSeats;
    }

    public int getFlight() {
        return this.flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    public String toString() {
        return "Flight: " + flight +
                "\nName: " + name +
                "\n" + data +
                "\nPassengers: " + passengers;
    }
}
