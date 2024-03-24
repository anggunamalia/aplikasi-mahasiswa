import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean nextMhs = true;
        Scanner anggun = new Scanner(System.in);
        ArrayList<MataKuliah> listMatkul = new ArrayList<>();

        while (nextMhs) {
            System.out.println("Kartu Hasil Study");
            System.out.println("=================");
            System.out.println();
            System.out.println("Masukan nama: ");
            String nama = anggun.nextLine();
            System.out.println("Masukan NIM");
            String nim = anggun.nextLine();
            Mahasiswa mhs1 = new Mahasiswa(nim, nama);
            mhs1.tambahmhs(mhs1);

            boolean next = true;
            while (next) {
                System.out.println("Masukkan kode:");
                String kode = anggun.nextLine();
                System.out.println("Masukkan nama matkul:");
                String namaMk = anggun.nextLine();
                System.out.println("Masukkan nilai:");
                int nilai = Integer.parseInt(anggun.nextLine());
                MataKuliah mk1 = new MataKuliah(kode, namaMk, nilai);
                listMatkul.add(mk1);

                System.out.println("Ingin tambah matkul lain? (y/n)");
                String lagi = anggun.nextLine();
                if (lagi.equals("n")) next = false;
            }

            System.out.println("Daftar Mata Kuliah:");
            for (MataKuliah matkul : listMatkul) {
                matkul.cetakMatkul();
            }

            System.out.println("Tambah mahasiswa lain? (y/n)");
            String lain = anggun.nextLine();
            if (lain.equals("n")) nextMhs = false;
        }
    }
}