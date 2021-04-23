/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

class Antrian {

    private int ukuran;
    private long[] antrian;
    private int belakang;
    private int jumItem;
    private int depan;

    public Antrian(int s) {
        ukuran = s;
        antrian = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumItem = 0;
    }

    public void masuk(long j) {
        if (!isFull()) {
            antrian[++belakang] = j;
            jumItem++;
        }
    }

    public long keluar() {
        long temp = antrian[0];
        if (!isEmpty()) {
            for (int i = 0; i < jumItem; i++) {
                antrian[i] = antrian[i + 1];
            }
            jumItem--;
            belakang--;
        }
        return temp;
    }

    public long peekDepan() {
        return antrian[depan];
    }

    public boolean isEmpty() {
        return (jumItem == 0);
    }

    public boolean isFull() {
        return (belakang == ukuran - 1);
    }

    public int ukuran() {
        return jumItem;
    }

    public void lihat() {
        for (int i = 0; i < jumItem; i++) {
            System.out.print(antrian[i] + " ");
        }
        System.out.println("");
    }

}

public class ApliAntrian {

    public static void main(String[] args) {
        Antrian antrian = new Antrian(10);
        antrian.masuk(13);
        antrian.lihat();
        antrian.masuk(32);
        antrian.lihat();
        antrian.masuk(45);
        antrian.lihat();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.lihat();
        System.out.println("yang diambil dari antrian = " + antrian.keluar());
        antrian.lihat();
    }
}
