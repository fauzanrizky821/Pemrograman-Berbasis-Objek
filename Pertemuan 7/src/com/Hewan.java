package com;

public abstract class Hewan {
        protected String nama;
        protected Reproduksi jenisReproduksi;
        protected PelindungTubuh jenisPelindungTubuh;


    public Hewan() {
        this.nama = "";
        this.jenisReproduksi = Reproduksi.NULL;
        this.jenisPelindungTubuh = PelindungTubuh.NULL;
    }


    public Hewan(String nama, Reproduksi jenisReproduksi, PelindungTubuh jenisPelindungTubuh) {
        this.nama = nama;
        this.jenisReproduksi = jenisReproduksi;
        this.jenisPelindungTubuh = jenisPelindungTubuh;
    }


    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Reproduksi getJenisReproduksi() {
        return this.jenisReproduksi;
    }

    public void setJenisReproduksi(Reproduksi jenisReproduksi) {
        this.jenisReproduksi = jenisReproduksi;
    }

    public PelindungTubuh getJenisPelindungTubuh() {
        return this.jenisPelindungTubuh;
    }

    public void setJenisPelindungTubuh(PelindungTubuh jenisPelindungTubuh) {
        this.jenisPelindungTubuh = jenisPelindungTubuh;
    }

    protected abstract void suara();
    
    protected String deskripsi() {
        return this.nama + " adalah hewan dengan jenis reproduksi " + this.jenisReproduksi + 
               " dan pelindung tubuh " + this.jenisPelindungTubuh + ".";
    }
}
