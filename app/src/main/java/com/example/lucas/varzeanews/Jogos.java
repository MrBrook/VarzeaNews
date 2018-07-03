package com.example.lucas.varzeanews;

public class Jogos {

    private String timeA;
    private String timesb;
    private String dataJogo;
    private String local;


    public Jogos(String timeA, String timesb, String dataJogo, String local) {
        this.timeA = timeA;
        this.timesb = timesb;
        this.dataJogo = dataJogo;
        this.local = local;
    }

    public String getTimeA() {
        return timeA;
    }

    public void setTimeA(String timeA) {
        this.timeA = timeA;
    }

    public String getTimesb() {
        return timesb;
    }

    public void setTimesb(String timesb) {
        this.timesb = timesb;
    }

    public String getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(String dataJogo) {
        this.dataJogo = dataJogo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String toString() {
        return  " " +
                timeA +" X "+ timesb +" " +dataJogo+" "+local;
    }
}
