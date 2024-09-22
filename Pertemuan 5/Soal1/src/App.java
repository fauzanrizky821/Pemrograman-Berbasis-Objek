import com.Dosen;
import com.Jadwal;
import com.MK;
import com.Mahasiswa;
import com.Ruangan;

public class App {
    public static void main(String[] args) throws Exception {
        Dosen[] dosens = new Dosen[10];

        dosens[0] = new Dosen("001", "Yadhi", "Bandung");
        dosens[1] = new Dosen("002", "Yudi", "Bandung");
        dosens[2] = new Dosen("003", "Suprihanto", "Bandung");
        dosens[3] = new Dosen("004", "Trisna", "Bandung");
        dosens[4] = new Dosen("005", "Prof. Eve", "Malang");
        dosens[5] = new Dosen("006", "Dr. Frank", "Medan");
        dosens[6] = new Dosen("007", "Dr. Grace", "Semarang");
        dosens[7] = new Dosen("008", "Prof. Henry", "Denpasar");
        dosens[8] = new Dosen("009", "Dr. Ivy", "Makassar");
        dosens[9] = new Dosen("010", "Prof. Jack", "Balikpapan");

        Mahasiswa[] mahasiswas = new Mahasiswa[10];

        mahasiswas[0] = new Mahasiswa("Budi", "Bandung", "1901001", "Teknik Informatika");
        mahasiswas[1] = new Mahasiswa("Ani", "Jakarta", "1901002", "Teknik Informatika");
        mahasiswas[2] = new Mahasiswa("Cici", "Surabaya", "1901003", "Teknik Informatika");
        mahasiswas[3] = new Mahasiswa("Dodi", "Yogyakarta", "1901004", "Teknik Informatika");
        mahasiswas[4] = new Mahasiswa("Eka", "Malang", "1901005", "Teknik Informatika");
        mahasiswas[5] = new Mahasiswa("Fani", "Semarang", "1901006", "Teknik Informatika");
        mahasiswas[6] = new Mahasiswa("Gilang", "Denpasar", "1901007", "Teknik Informatika");
        mahasiswas[7] = new Mahasiswa("Hana", "Makassar", "1901008", "Teknik Informatika");
        mahasiswas[8] = new Mahasiswa("Indra", "Medan", "1901009", "Teknik Informatika");
        mahasiswas[9] = new Mahasiswa("Joko", "Balikpapan", "1901010", "Teknik Informatika");

        MK[] mataKuliahList = new MK[10];

        // Mengisi array dengan data dummy mata kuliah
        mataKuliahList[0] = new MK("IF101", "Pemrograman Dasar");
        mataKuliahList[1] = new MK("IF102", "Komputer Grafik");
        mataKuliahList[2] = new MK("IF103", "Matematika Diskrit 2");
        mataKuliahList[3] = new MK("IF104", "Jaringan Komputer");
        mataKuliahList[4] = new MK("IF105", "Algoritma dan Pemrograman");
        mataKuliahList[5] = new MK("IF106", "Sistem Operasi");
        mataKuliahList[6] = new MK("IF107", "Pemrograman Berorientasi Objek");
        mataKuliahList[7] = new MK("IF108", "Manajemen Proyek IT");
        mataKuliahList[8] = new MK("IF109", "Kecerdasan Buatan");
        mataKuliahList[9] = new MK("IF110", "Pengembangan Aplikasi Web");

        Ruangan[] ruanganList = new Ruangan[10];

        // Mengisi array dengan data dummy ruangan
        ruanganList[0] = new Ruangan("R001", "Ruang A");
        ruanganList[1] = new Ruangan("R002", "Ruang B");
        ruanganList[2] = new Ruangan("R003", "Ruang C");
        ruanganList[3] = new Ruangan("R004", "Ruang D");
        ruanganList[4] = new Ruangan("R005", "Ruang E");
        ruanganList[5] = new Ruangan("R006", "Ruang F");
        ruanganList[6] = new Ruangan("R007", "Ruang G");
        ruanganList[7] = new Ruangan("R008", "Ruang H");
        ruanganList[8] = new Ruangan("R009", "Ruang I");
        ruanganList[9] = new Ruangan("R010", "Ruang J");

        Jadwal[] kelasC = new Jadwal[4];

        kelasC[0] = new Jadwal(1, "Senin", mataKuliahList[6], dosens[0], ruanganList[9]);
        kelasC[1] = new Jadwal(2, "Senin", mataKuliahList[1], dosens[1], ruanganList[9]);
        kelasC[2] = new Jadwal(3, "Senin", mataKuliahList[2], dosens[2], ruanganList[9]);
        kelasC[3] = new Jadwal(4, "Senin", mataKuliahList[1], dosens[3], ruanganList[3]);

        System.out.println("List Dosen: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Dosen " + i);
            dosens[i].displayInfo();
        }
        System.out.println();

        System.out.println("List Mahasiwa: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Mahasiwa " + i);
            mahasiswas[i].displayInfo();
        }
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println(String.format("|%-96s|", "JADWAL PERKULIAHAN"));
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            kelasC[i].displayJadwal();
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}
