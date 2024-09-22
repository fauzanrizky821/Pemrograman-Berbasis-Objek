package com;

public class Dosen extends Person{
    private String nip;

    public Dosen (String nip, String nama, String alamat) {
        super(nama, alamat);
        this.nip = nip;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIP\t:" + this.nip);
    }
}