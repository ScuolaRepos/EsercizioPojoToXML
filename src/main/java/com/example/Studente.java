package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Studente {
    @JsonProperty("id") private int id;
    @JsonProperty("cognome") private String cognome; 
    @JsonProperty("nome") private String nome;
    @JsonProperty("datanascita") private String datanascita;
    @JsonProperty("votoesame") private int votoesame;

    public Studente() {
    }

    public Studente(int id, String cognome, String nome, String datanascita, int votoesame) {
        this.id = id;
        this.cognome = cognome;
        this.nome = nome;
        this.datanascita = datanascita;
        this.votoesame = votoesame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public int getVotoesame() {
        return votoesame;
    }

    public void setVotoesame(int votoesame) {
        this.votoesame = votoesame;
    }

    public String getDatanascita() {
        return datanascita;
    }

    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }
}
