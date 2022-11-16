package com.example;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Studenti {
    @JsonProperty("stud") private ArrayList<Studente> stud;

    public Studenti() {
        stud = new ArrayList<>();
    }

    public Studente getStudente(int pos) {
        return stud.get(pos);
    }

    public void addStudente(Studente s) {
        stud.add(s);
    }
}
