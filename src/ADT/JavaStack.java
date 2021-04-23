/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaStack {

    private static int[] stack = new int[5];
    private static int counters = 0;

    private static boolean stackStorage() {
        return counters < stack.length;
    }

    private static void createStack() {
        int loopX = 0;
        int alpha = 0;
        while (loopX == 0) {
            System.out.print("Masukkan Data (angka): ");
            Scanner alphaX = new Scanner(System.in);
            try {
                alpha = alphaX.nextInt();
                loopX = 1;
            } catch (InputMismatchException e) {
                System.out.println("Masukan harus berupa Angka!");
                loopX = 0;
            }
        }
        stack[counters] = alpha;
        counters++;
    }

    private static void removeStack() {
        counters--;
        System.out.println("Data terakhir dalam stack sudah dikeluarkan");
    }

    private static void displayDataStack() {
        System.out.print("Data dalam Stack: ");
        for (int i = 0; i < counters; i++) {
            System.out.print(" [" + i + " => " + stack[i] + "]");
        }
        System.out.println("");
    }

    private static void cleanStack() {
        counters = 0;
    }

    private static void quitApp() {
        String quitss = "y";
        System.out.print("Keluar dari Program? (Y/T): ");
        quitss = new Scanner(System.in).nextLine();
        if (quitss.equalsIgnoreCase("y")) {
            System.exit(0);
        } else {
            menuProgram();
        }
    }

    private static void menuChooser(int choosenMenu) {
        switch (choosenMenu) {
            case 1:
                boolean check = stackStorage();
                if (check) {
                    createStack();
                } else {
                    System.out.println("Stack Penuh!, kosongkan satu data terlebih dahulu!");
                }
                break;
            case 2:
                removeStack();
                break;
            case 3:
                System.out.println("Status Storage: ");
                System.out.println("Kapasitas: " + stack.length);
                System.out.println("Terisi   : " + counters);
                break;
            case 4:
                displayDataStack();
                break;
            case 5:
                cleanStack();
                break;
            case 6:
                quitApp();
                break;
        }
        menuProgram();
    }

    private static void menuProgram() {
        int loopX = 0;
        int choosenMenu = 0;
        while (loopX == 0) {
            System.out.println("\nContoh Program Stack dengan Java");
            System.out.println("Menu: ");
            System.out.println("1. Tambah Stack");
            System.out.println("2. Keluarkan 1 data dari Stack");
            System.out.println("3. Status Stack");
            System.out.println("4. Tampilkan data dalam Stack");
            System.out.println("5. Bersihkan Stack");
            System.out.println("6. Keluar dari Program");
            System.out.print("Pilihan Menu (1 - 6) >>> ");
            Scanner menuOption = new Scanner(System.in);
            try {
                choosenMenu = menuOption.nextInt();
                loopX = 1;
            } catch (InputMismatchException e) {
                System.out.println("Masukan harus Angka!");
            }
        }
        System.out.println("");
        menuChooser(choosenMenu);
    }

    public static void main(String[] args) {
        menuProgram();
    }

}
