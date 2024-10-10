package com;

public abstract class Unggas extends Hewan {
    protected String jenisParuh;
    protected String warnaBulu;
    protected String jenisMakanan;


    public Unggas() {
        super("", Reproduksi.OVIPAR, PelindungTubuh.BULU);
        this.jenisParuh = "";
        this.warnaBulu = "";
        this.jenisMakanan = "";
    }

    public Unggas(String jenisParuh, String warnaBulu, String jenisMakanan) {
        super("", Reproduksi.OVIPAR, PelindungTubuh.BULU);
        this.jenisParuh = jenisParuh;
        this.warnaBulu = warnaBulu;
        this.jenisMakanan = jenisMakanan;
    }

    

    public String getJenisParuh() {
        return this.jenisParuh;
    }

    public void setJenisParuh(String jenisParuh) {
        this.jenisParuh = jenisParuh;
    }

    public String getWarnaBulu() {
        return this.warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    public String getJenisMakanan() {
        return this.jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }



    @Override
    public void suara(){

    }
}

