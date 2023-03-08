package org.example.exercise17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Schedule {

    private List<Commitiment> commitiments = new ArrayList<>();

    public Schedule() {

    }

    public Schedule(List<Commitiment> comit) {
        this.commitiments = comit;
    }


                // FUNCTIONS
    public void removeCommit(String name){
        Commitiment commit = getCommit(name);
        this.commitiments.remove(commit);

    }
    public Commitiment getCommitBydate(LocalDate date){
        return this.commitiments.stream().filter(commitiment -> commitiment.getDate().equals(date)).findFirst().get();
    }

    public Commitiment getCommit( String name){
        return  this.commitiments.stream().filter(commitiment -> commitiment.getParticipant().getName().equals(name)).findFirst().get();

    }
    public void changeCommit(String name,Commitiment novo){
        Commitiment commit = getCommit(name);
        commit.setName(novo.getName());
        commit.setDate(novo.getDate());
        commit.getParticipant().setName(novo.getParticipant().getName());
        commit.getParticipant().setFone(novo.getParticipant().getFone());
    }





          //GETTER AND ADD LIST
    public List<Commitiment> getCommitiments() {
        return commitiments;
    }

    public void addCommitiments(Commitiment commitiments) {
        this.commitiments.add(commitiments);
    }
    @Override
    public String toString() {
        return "" + commitiments + "\n";
    }
}
