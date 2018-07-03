package com.example.lucas.varzeanews;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.math.BigDecimal;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class TabClassificacao extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_classificacao, container, false);



        List<Times> cursos = todosOsCursos();
        ListView listaTimes = (ListView) rootView.findViewById(R.id.listaTimes);

        ArrayAdapter<Times> adapter = new ArrayAdapter<Times>(rootView.getContext(),android.R.layout.simple_list_item_1,cursos);

        listaTimes.setAdapter(adapter);




        return rootView;
    }

    private List<Times> todosOsCursos() {

        List<Times> times = new ArrayList<>();
        Times times1 = new Times("a","B");

        for(int i=0;i<25;i++){
            times1.setNome(i+"");
            times.add(times1);
        }

        return times ;
    }


}
