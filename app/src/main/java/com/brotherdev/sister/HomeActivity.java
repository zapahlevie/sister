package com.brotherdev.sister;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button materi = (Button)findViewById((R.id.btn_materi));
        Button tugas = (Button)findViewById((R.id.btn_tugas));
        Button absensi = (Button)findViewById((R.id.btn_absensi));
        Button agenda = (Button)findViewById((R.id.btn_agenda));
        Button jadwal = (Button)findViewById((R.id.btn_jadwal));
        Button nilai = (Button)findViewById((R.id.btn_nilai));
        Button profil = (Button)findViewById((R.id.btn_profil));
        Button help = (Button)findViewById((R.id.btn_bantuan));
        Button logout = (Button)findViewById(R.id.btn_logout);

        materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(MateriActivity.class);
            }
        });
        tugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(TugasActivity.class);
            }
        });
        absensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(AbsensiActivity.class);
            }
        });
        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(AgendaActivity.class);
            }
        });
        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(JadwalActivity.class);
            }
        });
        nilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(NilaiActivity.class);
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(UserActivity.class);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(HelpActivity.class);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click(LoginActivity.class);
            }
        });
    }

    private void click(Class<?> activityClass) {
        Intent intent = new Intent(HomeActivity.this, activityClass);
        startActivity(intent);
    }
}
