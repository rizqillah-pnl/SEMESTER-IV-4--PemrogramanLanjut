
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursif;

import java.util.Scanner;
public class PalindromeRekursif {
    public static void main(String[] args) {
        String hasilS;
        Scanner input = new Scanner(System.in);
        System.out.print("Input kata yang akan di cek : ");
        String kata = input.nextLine();
        String kata2 = kata;
        kata = kata
                .toLowerCase().replaceAll("\\s+", "").replaceAll("-", "");
        //memanggil fungsi cekPalindrome dan memberi parameter variabel kata
        boolean hasil = cekPalindrome(kata);

        if (hasil) {
            hasilS = "Betul!";
        } else {
            hasilS = "Salah!";
        }
        System.out.println("Apakah \"" + kata2 + "\" adalah Palindrome? : " + hasilS);
    }

    private static boolean cekPalindrome(String kata) {
        //Cek apakah kata yang dimasukkan cuma 1 huruf
        if (kata.length() == 1) {
            return true;
        }
        //Mengisi nilai awal dengan huruf pertama pada variabel kata
        String awal = kata.substring(0, 1);
        //Mengisi nilai akhir dengan huruf akhir pada variabel kata
        String akhir = kata.substring(kata.length() - 1, kata.length());

        //Melakukan pengecekan apakah nilai awal dan akhir tidak sama
        if (!awal.equals(akhir)) {
            return false;
            //jika kata awal dan akhir sama, maka akan memanggil fungsi rekursif
        } else {
            return cekPalindrome(kata.substring(1, kata.length() - 1));
        }
    }
}
