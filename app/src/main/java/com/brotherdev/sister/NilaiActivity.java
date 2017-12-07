package com.brotherdev.sister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.brotherdev.sister.adapter.DataAdapterNilai;
import com.brotherdev.sister.model.Nilai;

import java.util.ArrayList;

public class NilaiActivity extends AppCompatActivity {

    private ArrayList<Nilai> data = new ArrayList<Nilai>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_nilai);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Nilai");
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
        data = new ArrayList<Nilai>();
        data.add(new Nilai("Pendidikan Agama Islam", "95", "Zaenal Oetomo Lc. M.Ag."));
        data.add(new Nilai("Matematika", "90", "Suhartanto S.Pd. M.Pd."));
        data.add(new Nilai("Biologi", "82", "Ummu Salamah S.Pd."));
        data.add(new Nilai("Fisika", "78", "Budi Suhartono M.Pd."));
        data.add(new Nilai("Kimia", "91", "Agung Hariawan S.T. M.Pd."));
        data.add(new Nilai("IPS Terpadu", "100", "Sri Hartini S.E., S.Pd."));
        data.add(new Nilai("Bahasa Inggris", "81", "Putri Kadarisman S.S. S.Pd."));
        data.add(new Nilai("Bahasa Indonesia", "73", "Zaenal Oetomo Lc. M.Ag."));
        data.add(new Nilai("Pendidikan Jasmani & Rohani", "88", "Kris Harianto S.Or"));
        data.add(new Nilai("Kesenian", "90", "Zaenal Oetomo Lc. M.Ag."));
        RecyclerView.Adapter adapter = new DataAdapterNilai(data);
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
