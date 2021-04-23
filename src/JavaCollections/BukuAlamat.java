/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.*;

// CLAS INFOORANG
class InfoOrang {
    private String nama, alamat, nohp;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public InfoOrang(String nama, String alamat, String nohp) {
        setNama(nama);
        setAlamat(alamat);
        setNohp(nohp);
    }

    public void print() {
        System.out.println("============================================");
        System.out.println("\nNama : " + nama + "\nAlamat : " + alamat + "\nNo HP : " + nohp + "\n");
        System.out.println("============================================");
    }
}

// CLASS ADDRESSBOOK
class AddressBook {
    LinkedList orang;
    Scanner input = new Scanner(System.in);

    public AddressBook() {
        orang = new LinkedList();
    }

    public void addOrang() {
        System.out.println("\n==========================================");
        System.out.print("Input Nama : ");
        String nama = input.nextLine();
        System.out.print("Input Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Input No Hp : ");
        String nohp = input.nextLine();
        System.out.println("==========================================");

        InfoOrang orang = new InfoOrang(nama, alamat, nohp);
        this.orang.add(orang);
    }

    public void hapusOrang(String nama) {
        for (int i = 0; i < orang.size(); i++) {
            InfoOrang o = (InfoOrang) orang.get(i);
            if (nama.equals(o.getNama())) {
                o.print();
                orang.remove(i);
            }
        }
    }

    public void pop() {
        orang.pop();
    }

    public void display() {
        for (int i = 0; i < orang.size(); i++) {
            InfoOrang o = (InfoOrang) orang.get(i);
            o.print();
        }
    }
}

public class BukuAlamat {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        Scanner input = new Scanner(System.in);
        int cs;
        boolean ulang = true;
        while (ulang) {
            System.out.print("\nPilih Operasi :\n1.Tambah (ADD/Enqueue)"
                    + "\n2.Hapus Berdasarkan Nama\n3.Hapus(POP)"
                    + "\n4.View Data\n5.Exit\nInput : ");
            cs = input.nextInt();
            System.out.println("");
            switch (cs) {
                case 1:
                    System.out.print("============== TAMBAH DATA ===============");
                    ab.addOrang();
                    System.out.println("============= DATA DITAMBAH ==============\n");
                    break;
                case 2:
                    System.out.println("=============== HAPUS DATA =================");
                    System.out.print("Input nama yang akan dihapus : ");
                    String nama = input.next();
                    ab.hapusOrang(nama);
                    System.out.println("=========== DATA TELAH DIHAPUS =============");
                    break;
                case 3:
                    ab.pop();
                    System.out.println("=========== DATA BERHASIL DIPOP =============");
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
    }
}
