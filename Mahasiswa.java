
import java.util.ArrayList;

public class Mahasiswa {

    private ArrayList <Mahasiswa> listMahasiswa;
    private String NIM;
    private String Nama;

    // Konstruktor untuk menginisialisasi mahasiswa
    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.listMahasiswa = new ArrayList<>();
    }

    // Metode getter untuk mengambil nilai dari NIM dan nama mahasiswa
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    // Metode untuk menambahkan mahasiswa ke dalam listMahasiswa
    public void tambahmhs(Mahasiswa mhs){
        listMahasiswa.add(mhs);
    }
}