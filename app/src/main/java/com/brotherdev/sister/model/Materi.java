package com.brotherdev.sister.model;

/**
 * Created by zap on 12/8/2017.
 */

public class Materi {
    private String buku;
    private String pengarang;
    private String gambar;

    public Materi(String buku, String pengarang, String gambar) {
        this.buku = buku;
        this.pengarang = pengarang;
        this.gambar = gambar;
    }

    public String getBuku() {
        return buku;
    }

    public void setBuku(String buku) {
        this.buku = buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
