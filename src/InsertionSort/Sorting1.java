/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

public class Sorting1 {
    void insertionSort(Object array[], int startIdx, int endIdx) {
        for (int i = startIdx; i < endIdx; i++) {
            int k = i;
            for (int j = i + 1; j < endIdx; j++) {
                if (((Comparable) array[k]).compareTo(array[j]) > 0) {
                    k = j;
                }
            }
            swap(array[i], array[k]);
        }
    }

    void selectionSort(Object array[], int startIdx, int endIdx) {
        int min;
        for (int i = startIdx; i < endIdx; i++) {
            min = i;
            for (int j = i + 1; j < endIdx; j++) {
                if (((Comparable) array[min]).compareTo(array[j]) > 0) {
                    min = j;
                }
            }
            swap(array[min], array[i]);
        }
    }

    void mergeSort(Object array[], int startIdx, int endIdx) {
        if (array.length != 1) {
            //Membagi rangkaian data, rightArr dan leftArr
            mergeSort(leftArr, startIdx, midIdx);
            mergeSort(rightArr, midIdx + 1, endIdx);
            combine(leftArr, rightArr);
        }
    }

    void quickSort(Object array[], int leftIdx, int rightIdx) {
        int pivotIdx;
        /* Kondisi Terminasi */
        if (rightIdx > leftIdx) {
            pivotIdx = partition(array, leftIdx, rightIdx);
            quickSort(array, leftIdx, pivotIdx - 1);
            quickSort(array, pivotIdx + 1, rightIdx);
        }
    }


}
