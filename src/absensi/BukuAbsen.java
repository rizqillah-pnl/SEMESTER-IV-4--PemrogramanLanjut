package absensi;
import java.util.Scanner;

public class BukuAbsen{
    public static void main(String[] args) {
        absen mhs = new absen();
        Scanner masukkan = new Scanner(System.in);
        int opsi,noAbsen = 1;
        boolean balik = true;
        System.out.println("-Absensi Mahasiswa-\n");
        while (balik) {
            System.out.print("Silahkan Pilih Opsi :\n"
                    + "\n1.Menambahkan Mahasiswa"
                    + "\n2.Menghapus Data Mahasiwa"
                    + "\n3.Menampilkan Data Mahasiswa"
                    + "\n4.Keluar dari Absensi\n"
                    + "Opsi = ");
            opsi = masukkan.nextInt();
            System.out.println(" ");

            switch (opsi) {
                case 1:
                    System.out.print("---Menambahkan Data---");
                    mhs.addMahasiswa(noAbsen);
                    System.out.println("---Data---");
                    noAbsen++;
                    break;
                case 2:
                    mhs.remove();
                    System.out.println("Data Mahasiswa Telah diHapus");
                    noAbsen--;
                    break;
                case 3:
                    System.out.println("---Menampilkan Data Mahasiswa---");
                    mhs.tampilkan();
                    break;
                case 4:
                    balik = false;
                    break;
                default:
                    System.out.println("Masukkan digit angka dengan Benar");
            }
        }
    }
}
