package com.example.lucas.varzeanews;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class TabEstatisticas extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_estatistica, container, false);

        Persistencia dados = new Persistencia();


        List<Times> times = dados.buscaTodosTimes();


        ListView listaTimes = (ListView) rootView.findViewById(R.id.listaEstatistica);
//
//        AdapterTimesPersonalizado adapter = new AdapterTimesPersonalizado(times, (Activity) rootView.getContext());
//        listaTimes.setAdapter(adapter);

        ArrayAdapter<Times> adapter = new ArrayAdapter<Times>(rootView.getContext(),android.R.layout.simple_list_item_1,times);

        listaTimes.setAdapter(adapter);



        return rootView.getRootView();
    }
}
