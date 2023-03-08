package org.example.exercise17;

import java.time.LocalDate;

public class Commitiment {

    private String name;
    private LocalDate date;
    private Participant participant;

    public Commitiment(){

    }

    public Commitiment(String name, LocalDate date, Participant participant) {
        this.name = name;
        this.date = date;
        this.participant = participant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "\nTask: " + name +
                ", date: " + date +
                ", participant: " + participant;
    }
}
