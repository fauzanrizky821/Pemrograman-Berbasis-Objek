package com;

public class Bebek extends Unggas implements Perilaku{
    private String nama;

    public Bebek(String nama, String jenisParuh, String warnaBulu, String jenisMakanan) {
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
        System.out.println("Bebek berenang menggunakan kedua kakinya yang berselaput");
        
    }

    @Override
    public void caraBerjalan() {
        System.out.println("Bebek berjalan dengan dua kaki");
        
    }

    @Override
    public void caraTerbang() {
        System.out.println("Bebek tidak bisa terbang");
        
    }

    @Override
    public void suara() {
        System.out.println("Wekwekwek");
        super.suara();
    }
}
