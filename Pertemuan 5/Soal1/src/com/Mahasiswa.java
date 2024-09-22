package com;

public class Mahasiswa extends Person {
    private String nim;
    private String jurusan;

    public Mahasiswa (String nama, String alamat, String nim, String jurusan){
        super(nama, jurusan);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIM\t:" + this.nim);
        System.out.println("Jurusan\t:" + this.jurusan);
    }
}
