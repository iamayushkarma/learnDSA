package Sorting;

import java.util.Arrays;

public class SortingProblem {

    // > Helper function
    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    // > Q1
    // Given an integer array arr, move all 0's to the end of it while maintaining
    // the relative order of the non-zero elements.

    // bubble sort
    static void q1ViaBubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag)
                return;
        }
        System.out.println(Arrays.toString(arr));

    }

    // > Q2
    // Give an array of names of the fruits; you are supposed to sort it in
    // lexicographical order using the selection sort

    static void sortInLexicographi(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minumIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minumIndex]) < 0) {
                    minumIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minumIndex];
            arr[minumIndex] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        // > Q1
        int[] arr1 = { 5, 0, 8, 6, 0, 0, 1, 2 };
        q1ViaBubbleSort(arr1);

        // > Q2
        String[] arr2 = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
        sortInLexicographi(arr2);
    }
}
