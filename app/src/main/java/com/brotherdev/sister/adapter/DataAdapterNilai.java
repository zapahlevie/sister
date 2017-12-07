package com.brotherdev.sister.adapter;

/**
 * Created by zap on 12/7/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brotherdev.sister.R;
import com.brotherdev.sister.model.Nilai;

import java.util.ArrayList;

public class DataAdapterNilai extends RecyclerView.Adapter<DataAdapterNilai.ViewHolder> {
    private ArrayList<Nilai> arrayList = new ArrayList<Nilai>();

    public DataAdapterNilai(ArrayList<Nilai> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public DataAdapterNilai.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row_nilai, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapterNilai.ViewHolder viewHolder, int i) {
        viewHolder.mapel.setText(arrayList.get(i).getNama_mapel());
        viewHolder.guru.setText(arrayList.get(i).getGuru());
        viewHolder.nilai.setText(arrayList.get(i).getNilai());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mapel;
        private TextView guru;
        private TextView nilai;
        public ViewHolder(View view) {
            super(view);
            mapel = (TextView)view.findViewById(R.id.mapel);
            guru = (TextView)view.findViewById(R.id.guru);
            nilai = (TextView)view.findViewById(R.id.nilai);
        }
    }

}