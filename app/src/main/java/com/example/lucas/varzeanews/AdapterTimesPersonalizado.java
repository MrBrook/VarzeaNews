package com.example.lucas.varzeanews;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


class AdapterTimesPersonalizado extends BaseAdapter {

    private final List<Times> times;
    private final Activity act;

    public AdapterTimesPersonalizado(List<Times> cursos, Activity act) {
        this.times = cursos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public Object getItem(int position) {
        return times.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_curso_personalizada, parent, false);

        Times time = times.get(position);

        TextView nome = (TextView) view.findViewById(R.id.lista_curso_personalizada_nome);
        TextView descricao = (TextView) view.findViewById(R.id.lista_curso_personalizada_descricao);
        ImageView imagem = (ImageView) view.findViewById(R.id.lista_curso_personalizada_imagem);

        nome.setText(time.getNome());
        //descricao.setText(time.getNome());
        imagem.setImageResource(R.drawable.a);

        return view;
    }
}