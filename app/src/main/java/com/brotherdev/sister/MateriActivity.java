package com.brotherdev.sister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.brotherdev.sister.adapter.DataAdapterMateri;
import com.brotherdev.sister.model.Materi;

import java.util.ArrayList;

public class MateriActivity extends AppCompatActivity {

    private ArrayList<Materi> data = new ArrayList<Materi>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_materi);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Materi");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        initViews();
    }

    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        data = new ArrayList<Materi>();
        data.add(new Materi("Biologi", "Herni Budiati", "cover1"));
        data.add(new Materi("Sejarah", "Dwi Ari Listiyani", "cover2"));
        data.add(new Materi("Pendidikan Agama Islam", "Hendariyadi, Dewi Mulyani", "cover3"));
        data.add(new Materi("Pendidikan Kewarganegaraan", "Joko Mumpuni, Titik Sumarni", "cover4"));
        data.add(new Materi("Kimia", "Irvan Permana", "cover5"));
        data.add(new Materi("Fisika", "Tri Widodo, Suparno", "cover6"));
        RecyclerView.Adapter adapter = new DataAdapterMateri(data);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

            });
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {

                View child = rv.findChildViewUnder(e.getX(), e.getY());
                if(child != null && gestureDetector.onTouchEvent(e)) {
                    int position = rv.getChildAdapterPosition(child);
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }
}
