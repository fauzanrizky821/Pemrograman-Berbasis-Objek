package com;

public class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;

    public Ruangan(String kodeRuangan, String namaRuangan) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
    }


    public String getKodeRuangan() {
        return this.kodeRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public String getNamaRuangan() {
        return this.namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }
    
}
