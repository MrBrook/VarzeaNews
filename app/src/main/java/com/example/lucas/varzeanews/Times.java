package com.example.lucas.varzeanews;

import java.util.List;

public class Times {

    private String nome;
    private String escudo;

    Times(String n,String e){
        this.escudo = e;
        this.nome = n;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String toString() {
        return "Curso: " + nome + " Escudo: " +
                escudo ;
    }
}
