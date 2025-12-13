package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    static void SelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minumNum = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minumNum] > arr[j]) {
                    minumNum = j;
                }
            }
            swap(arr, minumNum, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 2, 3, 7, 9, 8 };
        SelectionSort(arr);
    }
}
