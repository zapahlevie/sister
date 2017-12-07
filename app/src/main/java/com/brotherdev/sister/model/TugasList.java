package com.brotherdev.sister.model;

/**
 * Created by zap on 12/7/2017.
 */

public class TugasList {
    private String tugas;
    private String status;

    public TugasList(String tugas, String status) {
        this.tugas = tugas;
        this.status = status;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
