package org.example.exercise17;

public class Participant {
    private String name;
    private String fone;


    public Participant() {

    }

    public Participant(String name, String fone) {
        this.name = name;
        this.fone = fone;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }




    @Override
    public String toString() {
        return  "\nname= " + name +
                "    age= " + fone;
    }
}
