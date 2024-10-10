package com;

public class Burung extends Unggas implements Perilaku{
    private String nama;

    public Burung(String nama, String jenisParuh, String warnaBulu, String jenisMakanan) {
        super(jenisParuh, warnaBulu, jenisMakanan);
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void caraBerenang() {
        System.out.println("Burung tidak bisa berenang");
        
    }

    @Override
    public void caraBerjalan() {
        System.out.println("Burung berjalan dengan dua kaki");
        
    }

    @Override
    public void caraTerbang() {
        System.out.println("Burung terbang dengan kedua sayapnya");
        
    }

    @Override
    public void suara() {
        System.out.println("Citcitcit");
        super.suara();
    }
}
