package Soal2.com.polban.jtk.inventory;

public class Inventori {

    private Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    public Barang[] getBarangs() {
        return this.barangs;
    }

    public void setBarangs(Barang[] barangs) {
        this.barangs = barangs;
    }

    void showBarang() {
        System.out.println(barangs[0].getNama_barang() + "("
                + barangs[0].getNama_barang() + ")");
        System.out.println(barangs[1].getNama_barang() + "("
                + barangs[1].getNama_barang() + ")");
    }

    public void pengadaan() {
        initBarang();
         //dikali juga bisa dong??
        barangs[0].setStok(barangs[0].getStok() + 30);
        barangs[1].setStok(barangs[1].getStok() + 30);
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}


