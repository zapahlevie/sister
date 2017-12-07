package com.brotherdev.sister.adapter;

/**
 * Created by zap on 12/7/2017.
 */

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.brotherdev.sister.R;
import com.brotherdev.sister.model.Materi;

import java.util.ArrayList;

public class DataAdapterMateri extends RecyclerView.Adapter<DataAdapterMateri.ViewHolder> {
    private ArrayList<Materi> arrayList = new ArrayList<Materi>();

    public DataAdapterMateri(ArrayList<Materi> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public DataAdapterMateri.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row_materi, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DataAdapterMateri.ViewHolder viewHolder, final int i) {
        viewHolder.buku.setText(arrayList.get(i).getBuku());
        viewHolder.pengarang.setText(arrayList.get(i).getPengarang());
        Uri uri = Uri.parse("android.resource://com.brotherdev.sister/drawable/"+arrayList.get(i).getGambar());
        viewHolder.gambar.setImageURI(uri);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView buku;
        private TextView pengarang;
        private ImageView gambar;
        public ViewHolder(View view) {
            super(view);
            buku = (TextView)view.findViewById(R.id.buku);
            pengarang = (TextView)view.findViewById(R.id.pengarang);
            gambar = (ImageView)view.findViewById(R.id.cover);
        }
    }

}