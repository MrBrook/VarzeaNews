package com.example.lucas.varzeanews;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TabJogos extends Fragment{



    private Button anterior;
    private Button proximo;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab_jogos, container, false);

        final Persistencia dados = new Persistencia();

        final List<Jogos> rodadas =  dados.CriaJogos("22/05/2019");

        final ListView listaJogos = (ListView) rootView.findViewById(R.id.listaJogos);

        ArrayAdapter<Jogos> adapter = new ArrayAdapter<Jogos>(rootView.getContext(),android.R.layout.simple_list_item_1, rodadas);

        listaJogos.setAdapter(adapter);


        anterior = (Button) rootView.findViewById(R.id.button3);
        final ArrayList<Jogos> finalRodadas = (ArrayList<Jogos>) rodadas;
        anterior.setOnClickListener(new View.OnClickListener()  {

            @Override
            public void onClick(View v) {


                ArrayAdapter<Jogos> adapter = new ArrayAdapter<Jogos>(rootView.getContext(),android.R.layout.simple_list_item_1, dados.CriaJogos("22/05/2019"));
                TextView fase = rootView.findViewById(R.id.textView1) ;
                fase.setText("Rodada 1");

                listaJogos.setAdapter(adapter);
            }
        });

        proximo = (Button) rootView.findViewById(R.id.button);
        proximo.setOnClickListener(new View.OnClickListener()  {

            @Override
            public void onClick(View v) {
                ArrayAdapter<Jogos> adapter = new ArrayAdapter<Jogos>(rootView.getContext(),android.R.layout.simple_list_item_1, dados.CriaJogos("28/05/2019"));
                TextView fase = rootView.findViewById(R.id.textView1) ;
                fase.setText("Rodada 2");
                listaJogos.setAdapter(adapter);
            }
        });


        return rootView;
    }



}
