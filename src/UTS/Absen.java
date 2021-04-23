/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Absn {

    private String[] nama = new String[100];
    private String[] nim = new String[100];
    private static int mhs;
    private static int index;

    public Absn() {
        mhs = 0;
    }

    public String getName(int index) {
        return nama[index];
    }

    public String getNim(int index) {
        return nim[index];
    }

    public void setName(String Nama, int indek, String Nim) {
        nama[indek] = Nama;
        nim[indek] = Nim;
        mhs++;
    }
}

public class Absen {
    public static void main(String[] args) {
        Absn absensi = new Absn();
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String[] nama = new String[100];
        String[] Nim = new String[100];
        String PIL = "";
        String n = "";

        int no;
        int jumlah = 0;
        do {
            try {
                System.out.println("============ MENU ===========");
                System.out.println("1. MEMASUKAN DATA MAHASISWA     ");
                System.out.println("2. MENAMPILKAN DATA MAHASISWA   ");
                System.out.println("3. KELUAR                       ");
                System.out.println("================================");
                System.out.print("\nMASUKAN PILIHAN [1..3]:");
                try {
                    PIL = dataIn.readLine();
                } catch (IOException e) {
                    System.out.println("Erorr!");
                }

                switch (Integer.parseInt(PIL)) {

                    case 1:
                        System.out.print("Masukkan Jumlah Mahasiswa:");
                        try {
                            n = dataIn.readLine();
                        } catch (IOException e) {
                            System.out.println("Erorr!");
                        }
                        jumlah = Integer.parseInt(n);
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("===========================================");
                            System.out.println("Silahkan Absen No." + (i + 1));
                            System.out.print("Masukkan Nama:");
                            try {
                                nama[i] = dataIn.readLine();
                            } catch (IOException e) {
                                System.out.println("Erorr!");
                            }
                            System.out.print("Masukkan Nim: ");
                            try {
                                Nim[i] = dataIn.readLine();
                            } catch (IOException e) {
                                System.out.println("Erorr!");
                            }
                        }
                        System.out.println("\nBerikut Mahasiswa Yang Telah Absen");
                        for (int i = 0; i < jumlah; i++) {
                            absensi.setName(nama[i], i, Nim[i]);
                            System.out.println("===========================================");
                            System.out.println("Nama                  :" + absensi.getName(i));
                            System.out.println("Nim                   :" + absensi.getNim(i));
                            System.out.println("===========================================");
                        }
                        break;

                    case 2:
                        System.out.print("Berikut Menampilkan Data Mahasiswa Yang Telah Absen:\n");
                        for (int i = 0; i < jumlah; i++) {
                            absensi.setName(nama[i], i, Nim[i]);
                            System.out.println("===================================================================");
                            System.out.println("Nama                  :" + absensi.getName(i));
                            System.out.println("Nim                   :" + absensi.getNim(i));
                            System.out.println("===================================================================");
                        }
                        break;

                    default:
                        System.out.println("Terima Kasih");
                }
            } catch (Exception e) {
                System.out.println("inputTidakValid");
            }
        } while (Integer.parseInt(PIL) != 3);
    }
}
