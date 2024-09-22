package com;

public class Person {
    private String nama;
    private String alamat;

    public Person(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void displayInfo() {
        System.out.println("Nama\t:" + this.nama);
        System.out.println("Alamat\t:" + this.alamat);
    }
}
