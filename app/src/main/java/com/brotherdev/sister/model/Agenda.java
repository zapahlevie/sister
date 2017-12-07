package com.brotherdev.sister.model;

/**
 * Created by zap on 12/6/2017.
 */

public class Agenda {
    private String agenda;
    private String jam;
    private String tanggal;
    private String notif;

    public Agenda(String agenda, String jam, String tanggal, String notif) {
        this.agenda = agenda;
        this.jam = jam;
        this.tanggal = tanggal;
        this.notif = notif;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNotif() {
        return notif;
    }

    public void setNotif(String notif) {
        this.notif = notif;
    }
}
