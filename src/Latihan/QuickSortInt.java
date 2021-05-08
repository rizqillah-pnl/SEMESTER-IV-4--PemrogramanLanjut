/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
public class QuickSortInt {
    static void quickSort(int[] array, int startIdx, int endIdx) {
        // startIdx adalah index bawah
        // endIdx is index atas
        // dari array yang akan diurutkan
        int i = startIdx, j = endIdx, h;
        //pilih elemen pertama sebagai pivot
        int pivot = array[i];

        // memilah
        do {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > array[startIdx]) {
                j--;
            }
            if (i <= j) {
                h = array[i];
                array[i] = array[j];
                array[j] = h;
                i++;
                j--;
            }
        } while (i <= j);

        // rekursi
        if (startIdx < j) {
            quickSort(array, startIdx, j);
        }
        if (i < endIdx) {
            quickSort(array, i, endIdx);
        }
    }

    public static void main(String args[]) {
        int numArr[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numArr[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Before Sorting");
        for (int i : numArr) {
            System.out.print(i + " ");
        }

        quickSort(numArr, 0, numArr.length - 1);
        System.out.println("\nAfter Sorting");
        for (int i : numArr) {
            System.out.print(i + " ");
        }
    }
}
