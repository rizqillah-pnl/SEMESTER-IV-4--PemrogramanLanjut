/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
public class InsertionSortInt {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Sebelum Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("Setelah Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
