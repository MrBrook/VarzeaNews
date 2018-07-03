package com.example.lucas.varzeanews;

import android.widget.ImageView;

import java.util.List;

public class Times {


    private int id;
    private String nome;
    private int escudo;
    private int grupo;
    private int pontos;

    Times(int id, String n, int e, int grupo, int pontos){
        this.id = id;
        this.escudo = e;
        this.nome = n;
        this.grupo = grupo;
        this.pontos = pontos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String toString() {
        if(id==-1) return  "       " +  nome;
        else return  "   " +  nome+"    "+ pontos ;
    }
}
