package com.brotherdev.sister.adapter;

/**
 * Created by zap on 12/7/2017.
 */

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.brotherdev.sister.R;
import com.brotherdev.sister.model.Agenda;

import java.util.ArrayList;

public class DataAdapterAgenda extends RecyclerView.Adapter<DataAdapterAgenda.ViewHolder> {
    private ArrayList<Agenda> arrayList = new ArrayList<Agenda>();

    public DataAdapterAgenda(ArrayList<Agenda> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public DataAdapterAgenda.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row_agenda, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DataAdapterAgenda.ViewHolder viewHolder, final int i) {
        viewHolder.agenda.setText(arrayList.get(i).getAgenda());
        viewHolder.date_time.setText(arrayList.get(i).getJam()+" WIB - "+arrayList.get(i).getTanggal());
        if(arrayList.get(i).getNotif().equals("on")){
            viewHolder.notif.setImageResource(R.drawable.ic_notifications_active_black_24dp);
        }
        else{
            viewHolder.notif.setImageResource(R.drawable.ic_notifications_off_black_24dp);
        }
        viewHolder.notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arrayList.get(i).getNotif().equals("on")){
                    viewHolder.notif.setImageResource(R.drawable.ic_notifications_off_black_24dp);
                    arrayList.get(i).setNotif("off");
                    Toast.makeText(v.getContext(), "Notification Off", Toast.LENGTH_SHORT).show();
                }
                else{
                    viewHolder.notif.setImageResource(R.drawable.ic_notifications_active_black_24dp);
                    arrayList.get(i).setNotif("on");
                    Toast.makeText(v.getContext(), "Notification On", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView agenda;
        private TextView date_time;
        private ImageButton notif;
        public ViewHolder(View view) {
            super(view);
            agenda = (TextView)view.findViewById(R.id.agenda);
            date_time = (TextView)view.findViewById(R.id.date_time);
            notif = (ImageButton)view.findViewById(R.id.notif);
        }
    }

}