package com;

public class Jadwal {
    int jamKe;
    String hari;
    MK mataKuliah;
    Dosen dosenPengampu;
    Ruangan ruanganKuliah;

    public Jadwal(int jamKe, String Hari, MK mataKuliah, Dosen dosenPengampu, Ruangan ruanganKuliah) {
        this.jamKe = jamKe;
        this.hari = Hari;
        this.mataKuliah = mataKuliah;
        this.dosenPengampu = dosenPengampu;
        this.ruanganKuliah = ruanganKuliah;
    }

    public int getJamKe() {
        return this.jamKe;
    }

    public void setJamKe(int jamKe) {
        this.jamKe = jamKe;
    }

    public String getHari() {
        return this.hari;
    }

    public void setHari(String Hari) {
        this.hari = Hari;
    }

    public MK getMataKuliah() {
        return this.mataKuliah;
    }

    public void setMataKuliah(MK mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Dosen getDosenPengampu() {
        return this.dosenPengampu;
    }

    public void setDosenPengampu(Dosen dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    public Ruangan getRuanganKuliah() {
        return this.ruanganKuliah;
    }

    public void setRuanganKuliah(Ruangan ruanganKuliah) {
        this.ruanganKuliah = ruanganKuliah;
    }
    
    public void displayJadwal() {
        System.out.println(String.format("| %-7s | %-3s | %-10s | %-35s | %-6s | %-10s | %-5s |",
        this.hari,
        this.jamKe,
        this.mataKuliah.getKodeMk(),
        this.mataKuliah.getNamaMk(),
        this.dosenPengampu.getNip(),
        this.dosenPengampu.getNama(),
        this.ruanganKuliah.getKodeRuangan()
    ));
    }
}
