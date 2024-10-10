import com.Ayam;
import com.Bebek;
import com.Burung;

public class App {
    public static void main(String[] args) throws Exception {
        Ayam ayamKampung = new Ayam("Ayam Jago", "Pendek dan Melengkung", "Coklat dan Hitam", "Biji-bijian dan cacing");

        System.out.println("--- Kelas Ayam ---");
        System.out.println("Nama: " + ayamKampung.getNama());
        System.out.println("jenis makanan: " + ayamKampung.getJenisMakanan());
        System.out.println("jenis paruh: " + ayamKampung.getJenisParuh());
        ayamKampung.caraBerjalan();
        ayamKampung.caraBerenang();
        ayamKampung.caraTerbang();
        ayamKampung.suara();
        System.out.println();

        Bebek bebek = new Bebek("Bebek", "Panjang dan Pipih", "Putih", "Ikan kecil dan Cacing");

        System.out.println("--- Kelas Bebek ---");
        System.out.println("Nama: " + bebek.getNama());
        System.out.println("jenis makanan: " + bebek.getJenisMakanan());
        System.out.println("jenis paruh: " + bebek.getJenisParuh());
        bebek.caraBerjalan();
        bebek.caraBerenang();
        bebek.caraTerbang();
        bebek.suara();
        System.out.println();

        Burung burungPuyuh = new Burung("Burung Puyuh", "Pendek dan Melengkung", "Coklat Tua", "Serangga dan Biji-bijian");

        System.out.println("--- Kelas Burung ---");
        System.out.println("Nama: " + burungPuyuh.getNama());
        System.out.println("jenis makanan: " + burungPuyuh.getJenisMakanan());
        System.out.println("jenis paruh: " + burungPuyuh.getJenisParuh());
        burungPuyuh.caraBerjalan();
        burungPuyuh.caraBerenang();
        burungPuyuh.caraTerbang();
        burungPuyuh.suara();
        System.out.println();
    }
}
