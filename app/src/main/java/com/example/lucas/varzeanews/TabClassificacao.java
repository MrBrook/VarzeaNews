package com.example.lucas.varzeanews;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;


public class TabClassificacao extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_classificacao, container, false);

        Persistencia dados = new Persistencia();


        List<Times> times = dados.buscaTodosTimes();


        ListView listaTimes = (ListView) rootView.findViewById(R.id.listaTimes);
//
//        AdapterTimesPersonalizado adapter = new AdapterTimesPersonalizado(times, (Activity) rootView.getContext());
//        listaTimes.setAdapter(adapter);

        ArrayAdapter<Times> adapter = new ArrayAdapter<Times>(rootView.getContext(),android.R.layout.simple_list_item_1,times);

        listaTimes.setAdapter(adapter);



        return rootView.getRootView();
    }




}
