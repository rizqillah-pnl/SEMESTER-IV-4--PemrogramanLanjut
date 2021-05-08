/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;
public class QuickSort {
    public static int partition(int arr[], int beg, int end) {
        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while (flag != 1) {
            while ((arr[loc] <= arr[right]) && (loc != right)) {
                right--;
            }
            if (loc == right) {
                flag = 1;
            } else if (arr[loc] > arr[right]) {
                temp = arr[loc];
                arr[loc] = arr[right];
                arr[right] = temp;
                loc = right;
            }
            if (flag != 1) {
                while ((arr[loc] >= arr[left]) && (loc != left)) {
                    left++;
                }
                if (loc == left) {
                    flag = 1;
                } else if (arr[loc] < arr[left]) {
                    temp = arr[loc];
                    arr[loc] = arr[left];
                    arr[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }

    static void quickSort(int arr[], int beg, int end) {
        int loc;
        if (beg < end) {
            loc = partition(arr, beg, end);
            quickSort(arr, beg, loc - 1);
            quickSort(arr, loc + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8};
        System.out.println("Array Before Sorted:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nArray After Sorted:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
