package com;

public class Ayam extends Unggas implements Perilaku  {
    private String nama;

    public Ayam(String nama, String jenisParuh, String warnaBulu, String jenisMakanan) {
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
        System.out.println("Ayam tidak bisa berenang");
        
    }

    @Override
    public void caraBerjalan() {
        System.out.println("Ayam berjalan dengan dua kaki dan berjingkat-jingkat");
        
    }

    @Override
    public void caraTerbang() {
        System.out.println("Ayam tidak bisa terbang");
        
    }

    @Override
    public void suara() {
        System.out.println("Kukuruyuk");
        super.suara();
    }  

}
