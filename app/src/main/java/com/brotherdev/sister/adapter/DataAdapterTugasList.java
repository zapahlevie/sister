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
import com.brotherdev.sister.model.TugasList;

import java.util.ArrayList;

public class DataAdapterTugasList extends RecyclerView.Adapter<DataAdapterTugasList.ViewHolder> {
    private ArrayList<TugasList> arrayList = new ArrayList<TugasList>();

    public DataAdapterTugasList(ArrayList<TugasList> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public DataAdapterTugasList.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row_tugas_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapterTugasList.ViewHolder viewHolder, int i) {
        viewHolder.tugas.setText(arrayList.get(i).getTugas());
        if(arrayList.get(i).getStatus().equals("Done")){
            viewHolder.status.setText("");
        }
        else{
            viewHolder.status.setText("!");
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tugas;
        private TextView status;
        public ViewHolder(View view) {
            super(view);
            tugas = (TextView)view.findViewById(R.id.tugas);
            status = (TextView)view.findViewById(R.id.status);
        }
    }

}