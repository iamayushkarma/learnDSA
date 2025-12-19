package Searching;

public class BinarySearchProblem {

    // > Q1
    // Find the first occurrence of a given element x, given that the given array is
    // sorted. If no occurrence of x is found then return -1.

    static int firstOccurance(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int f = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                f = mid;
                end = mid - 1;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return f;
    }

    // > Q2
    // Find the square root of the given non negative value x. Round it off to the
    // nearest floor integer value.
    static int sqrt(int x) {
        int start = 0, end = x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long val = mid * mid;
            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // > Q3
    // A rotated sorted array is a sorted array on which rotation operation has been
    // performed some number of times. Given a rotated sorted array, find the index
    // of the minimum element in the array. Follow 0-based indexing. It is
    // guaranteed that all the elements in the array are unique.

    static int findMinimum(int[] arr) {
        int ans = -1;
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    // > Q4
    // Given the rotated sorted array of integers, which contains distinct elements,
    // and an integer target, return the index of target ifit is in the array.
    // Otherwise return -1.

    static int searchForNumber(int[] arr, int target) {
        int ans = -1;
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < arr[j]) {
                if (target > arr[mid] && target <= arr[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            } else {
                if (target >= arr[i] && target < arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        // > Q1
        int[] arr1 = { 1, 2, 2, 2, 3, 5, 5, 4, 8 };
        System.out.println("Target at index: " + firstOccurance(arr1, 2));

        // > Q2
        int x = 25;
        System.out.println(sqrt(x));

        // > Q3
        int[] arr3 = { 3, 4, 5, 6, 7, 8, 1, 2 };
        System.out.println("Minimum element is at index: " + findMinimum(arr3));

        // > Q4
        int[] arr4 = { 3, 4, 5, 6, 7, 8, 1, 2 };
        System.out.println("Target element is at index: " + searchForNumber(arr4, 7));
    }
}
