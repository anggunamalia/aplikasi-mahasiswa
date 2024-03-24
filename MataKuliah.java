
import java.util.ArrayList;

public class MataKuliah {

    private String kode;
    private String namaMk;
    private int nilai;

    // Konstruktor untuk menginisialisasi mata kuliah
    public MataKuliah(String kode, String namaMk, int nilai) {
        this.kode = kode;
        this.namaMk = namaMk;
        this.nilai = nilai;
    }

    // Metode getter untuk mengambil nilai dari kode, nama, dan nilai mata kuliah
    public String getKode() {
        return kode;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public int getNilai() {
        return nilai;
    }

    // Metode untuk menentukan nilai huruf berdasarkan nilai mata kuliah
    public String nilaih() {
        String nilaih;
        if (nilai > 80) {
            nilaih = "A";
        } else if (nilai <= 80 && nilai > 75) {
            nilaih = "B+";
        } else if (nilai <= 75 && nilai > 69) {
            nilaih = "B";
        } else if (nilai <= 69 && nilai > 60) {
            nilaih = "C+";
        } else if (nilai <= 60 && nilai > 55) {
            nilaih = "C";
        } else if (nilai <= 55 && nilai > 50) {
            nilaih = "D+";
        } else if (nilai <= 50 && nilai > 44) {
            nilaih = "D";
        } else {
            nilaih = "E";
        }
        return nilaih;
    }

    // Metode untuk menampilkan data mata kuliah
    public void cetakMatkul() {
        System.out.println("Kode: " + getKode() + ", Nama Mata Kuliah: " + getNamaMk() + ", Nilai: " + getNilai() + ", Nilai Huruf: " + nilaih());
    }
}