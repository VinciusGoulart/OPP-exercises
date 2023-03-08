package org.example.exercise8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Calendario {

    private LocalDate date;

    public Calendario() {

    }
    public static void dd(){
        Locale.setDefault(Locale.US);
        Calendario data = new Calendario(LocalDate.of(2019,11,10));

        System.out.println(data);
        System.out.println(data.compare());
        System.out.println(data.getDia());
        System.out.println(data.getMes());
        System.out.println(data.getMesExtenso());
        System.out.println(data.getAno());
        System.out.println(data.isBissexto());
        data.clone();
        System.out.println(data.clone());
    }


    public Calendario(LocalDate date) {
        this.setDate(date);
    }

    public int compare() {
        if (LocalDateTime.now().equals(date)) {
            return 0;
        } else if (LocalDateTime.now().compareTo(date.atStartOfDay()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return date.getDayOfMonth();
    }

    public int getMes() {
        return date.getMonthValue();
    }

    public String getMesExtenso() {

        return date.format(DateTimeFormatter.ofPattern("MMMM"));
    }

    public int getAno() {
        return date.getYear();
    }

    public boolean isBissexto() {
        if (getAno() % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public Calendario clone() {
        Calendario clon = new Calendario(date);
        return clon;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



    @Override
    public String toString() {
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Data:" + date.format(forma);

    }

}
