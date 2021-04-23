/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursif;

import java.util.*;

public class CekKataPolindrom {

    static boolean cek(String kata) {
        int left = 0;
        int right = kata.length() - 1;

        while (left < right) {
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = input.next();

        int panjang = kata.length();

        if (cek(kata)) {
            System.out.println(kata + " adalah kata Palindrome.");
        } else {
            System.out.println(kata + " Bukan kata Palindrome.");
        }
    }

}
