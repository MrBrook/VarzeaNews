package com.example.lucas.varzeanews;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Persistencia {

    public  List<Times> buscaTodosTimes()  {

        return new ArrayList<>(Arrays.asList(new Times(-1,"Grupo A",R.drawable.a,0,5)
                ,new Times(0,"America MG",R.drawable.a,0,5)
                ,new Times(1,"Democrata", R.drawable.a,0,2)
                ,new Times(2,"Ipatinga", R.drawable.a,0,0)
                ,new Times(3,"Caldense", R.drawable.a,0,6)
                ,new Times(4,"CAP Uberlandia",R.drawable.a,0,5)
                ,new Times(-1,"Grupo B",R.drawable.a,-1,-1)
                ,new Times(5,"Uberaba",R.drawable.a,1,5)
                ,new Times(6,"Internacional de Minas", R.drawable.a,1,5)
                ,new Times(7,"Araxa EC", R.drawable.a,1,5)
                ,new Times(8,"CAP Uberlandia", R.drawable.a,1,5)
                ,new Times(9,"Boa Esporte", R.drawable.a,1,5)
                ,new Times(-1,"Grupo C",R.drawable.a,-1,-1)
                ,new Times(10,"Patrocinence", R.drawable.a,1,5)
                ,new Times(11,"EC Mamore", R.drawable.a,1,5)
                ,new Times(12,"Guarani", R.drawable.a,1,5)
                ,new Times(13,"Social FC", R.drawable.a,1,5)
                ,new Times(14,"Tombence", R.drawable.a,1,5)
                ,new Times(-1,"Grupo D",R.drawable.a,-1,-1)
                ,new Times(15,"Tupi",R.drawable.a,1,5)
                ,new Times(16,"Tupynambаs",R.drawable.a,1,5)
                ,new Times(17,"Uberlandia",R.drawable.a,1,5)
                ,new Times(18,"URT",R.drawable.a,1,5)
                ,new Times(19,"Villa Nova",R.drawable.a,1,5) ));

    }


    public List<Jogos> CriaJogos(String data){

        List<Jogos> jogos = new ArrayList<>();
        Persistencia dados = new Persistencia();

        List<Times> times = dados.buscaTodosTimes();

        jogos.add(new Jogos(times.get(1).getNome(),times.get(9).getNome(),data,"Poços de Caldas"));
        jogos.add(new Jogos(times.get(2).getNome(),times.get(3).getNome(),data,"Poços de Caldas"));
        jogos.add(new Jogos(times.get(4).getNome(),times.get(7).getNome(),data,"Poços de Caldas"));
        jogos.add(new Jogos(times.get(8).getNome(),times.get(9).getNome(),data,"Poços de Caldas"));



        return jogos;
    }


}
