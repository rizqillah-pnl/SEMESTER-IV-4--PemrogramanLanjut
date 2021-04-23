/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursif;

import java.util.Scanner;
public class ReturnValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Nilai 1 : ");
        int a = input.nextInt();
        System.out.print("Input Nilai 2 : ");
        int b = input.nextInt();
        System.out.println(Tambah(a, b));
    }

    public static int Tambah(int a, int b) {
        return a + b;
    }

}
