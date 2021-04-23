/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.*;
class absenMahasiswa {
    private String nama, nim;
    private int hadir, noAbsen;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setHadir(int hadir) {
        this.hadir = hadir;
    }

    public void setNoAbsen(int noAbsen) {
        this.noAbsen = noAbsen;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getHadir() {
        return hadir;
    }

    public int getNoAbsen() {
        return noAbsen;
    }

    public absenMahasiswa(String nama, String nim, int hadir, int noAbsen) {
        setNama(nama);
        setNim(nim);
        setHadir(hadir);
        setNoAbsen(noAbsen);
    }

    public void print() {
        String dataHadir;
        if (hadir == 1) {
            dataHadir = "Hadir";
        } else if (hadir == 2) {
            dataHadir = "Sakit";
        } else {
            dataHadir = "Alpa";
        }
        System.out.println("============================================");
        System.out.println("\nNo\t: " + noAbsen + "\nNama\t: " + nama
                + "\nNIM\t: " + nim + "\nAbsensi\t: " + dataHadir + "\n");
        System.out.println("============================================");
    }

    public boolean isNim(String nim) {
        return this.nim.equals(nim);
    }
}

class Absensi {
    LinkedList mahasiswa = new LinkedList();
    Scanner input = new Scanner(System.in);

    public boolean addOrang(int noAbsen) {
        String nama, nim;
        int hadir;
        System.out.println("\n==========================================");
        System.out.print("Input Nama : ");
        nama = input.nextLine();
        System.out.print("Input NIM : ");
        nim = input.next();
        System.out.print("Pilih :\n1.Hadir\n2.Sakit\n3.Alpa\nPilih Absensi : ");
        hadir = input.nextInt();
        input.nextLine();
        System.out.println("==========================================");

        absenMahasiswa mahasiswa = new absenMahasiswa(nama, nim, hadir, noAbsen);
        if (cekData(nim) == false) {
            this.mahasiswa.add(mahasiswa);
            System.out.println("Absen Berhasil!");
            return true;
        } else {
            System.out.println("Data yang diinput telah ada!");
            return false;
        }

    }

    public boolean cekData(String nim) {
        for (int i = 0; i < mahasiswa.size(); i++) {
            absenMahasiswa mhs = (absenMahasiswa) mahasiswa.get(i);
            if (mhs.isNim(nim)) {
                return true;
            }
        }
        return false;
    }

    public void cariMahasiswa(int noAbsen) {
        for (int i = 0; i < mahasiswa.size(); i++) {
            absenMahasiswa m = (absenMahasiswa) mahasiswa.get(i);
            if (noAbsen == m.getNoAbsen()) {
                m.print();
            }
        }
    }

    public void remove() {
        mahasiswa.removeLast();
    }

    public void display() {
        for (int i = 0; i < mahasiswa.size(); i++) {
            absenMahasiswa m = (absenMahasiswa) mahasiswa.get(i);
            m.print();
        }
    }
}

public class BukuAbsensiMahasiswa {
    public static void main(String[] args) {
        Absensi ab = new Absensi();
        Scanner input = new Scanner(System.in);
        int cs, noAbsen = 1;
        boolean ulang = true;
        System.out.println("============ SELAMAT DATANG DI APLIKASI ============\n"
                + "================= ABSENSI MAHASISWA ================");
        while (ulang) {
            System.out.print("\nPilih Operasi :\n1.Tambah Data"
                    + "\n2.Cari Mahasiswa\n3.Hapus Data Terakhir"
                    + "\n4.View Data\n5.Exit\nInput : ");
            cs = input.nextInt();
            System.out.println("");
            switch (cs) {
                case 1:
                    System.out.print("============== TAMBAH DATA ===============");
                    if (ab.addOrang(noAbsen)) {
                        noAbsen++;
                    } else {
                        break;
                    }
                    System.out.println("============= DATA DITAMBAH ==============\n");
                    break;
                case 2:
                    System.out.println("============== CARI MAHASISWA ===============");
                    System.out.print("Input nomor absen Mahasiswa : ");
                    int noAbs = input.nextInt();
                    ab.cariMahasiswa(noAbs);
                    System.out.println("============ DATA TELAH TAMPIL ===============");
                    break;
                case 3:
                    ab.remove();
                    System.out.println("=========== DATA BERHASIL DIHAPUS ===========");
                    noAbsen--;
                    break;
                case 4:
                    System.out.println("================ VIEW DATA =================");
                    ab.display();
                    System.out.println("============== AKHIR VIEW ==================");
                    break;
                case 5:
                    ulang = false;
                    break;
                default:
                    System.out.println("Inputan Salah!!");
                    break;
            }
        }
        System.out.println("Terima Kasih Banyak!");
    }
}
