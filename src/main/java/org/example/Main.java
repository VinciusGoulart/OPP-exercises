package org.example;

import org.example.exercise17.Commitiment;
import org.example.exercise17.Participant;
import org.example.exercise17.Schedule;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Schedule schedule = new Schedule();
        Participant par1 = new Participant("Kleber","(69) 69696969");
        LocalDate date1 = LocalDate.of(2023,03,10);
        schedule.addCommitiments(new Commitiment("Payment",date1,par1));
        Participant par2 = new Participant("joaozin","(69) 69696969");
        LocalDate date2 = LocalDate.of(2023,04,10);
        schedule.addCommitiments(new Commitiment("Payment",date2,par2));

        System.out.println(schedule);

        System.out.println("searching by name");
        System.out.println(schedule.getCommit("joaozin"));
        System.out.println();
        System.out.println("searching by date");
        System.out.println(schedule.getCommitBydate(LocalDate.of(2023,03,10)));
        System.out.println();

        Participant par3 = new Participant("Predu","63636363");
        LocalDate date3 = LocalDate.of(2020,07,14);
        schedule.changeCommit("joaozin",new Commitiment("Meeting",date3,par3));



        System.out.println(schedule);

    }

}





