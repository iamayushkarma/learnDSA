package Fundamentals;

import java.util.Arrays;

public class ArrayQuestions {
    //> Q 1 Find the total number of pairs in the Array whose sun is equal to the give vlaue x
    public static void findSum(int arr[], int x) {
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    //> Q 2 Count the numbers of triplets whose sum is equal to the given value x
    public static void countTriplet(int arr[], int x) {
        int count = 0;
        for(int i = 0; i<arr.length-2; i++){
            for(int j = i+1; j <arr.length-1; j++){
                for(int k = j+1; k <arr.length; k++){
                    int triplets = arr[i] + arr[j] + arr[k];
                    if(triplets == x){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total triplets are: " + count);
    }

    //> Q 3 Find the unique element
    static int findUniqueElement(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                arr[i] = -1;
                arr[j] = -1;
            }
        }
        }
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 ){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //> Q1 
        // int arr_Q1[] = {4,6,3,5,8,2};
        // int target = 7;
        // findSum(arr_Q1, target);

        //> Q2
        // int arr_Q2[] = {1,4,5,6,3};
        // int target2 = 12;
        // countTriplet(arr_Q2, target2);  
        
        //> Q3
        int arr_Q3[] = {1,2,2,1,3};
        System.out.println(findUniqueElement(arr_Q3));
    }
}
