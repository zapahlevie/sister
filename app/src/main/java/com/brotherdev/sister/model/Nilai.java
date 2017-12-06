package com.brotherdev.sister.model;

/**
 * Created by zap on 12/6/2017.
 */

public class Nilai {
    private String nama_mapel;
    private String nilai;

    public Nilai(String nama_mapel, String nilai) {
        this.nama_mapel = nama_mapel;
        this.nilai = nilai;
    }

    public String getNama_mapel() {
        return nama_mapel;
    }

    public void setNama_mapel(String nama_mapel) {
        this.nama_mapel = nama_mapel;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
}
