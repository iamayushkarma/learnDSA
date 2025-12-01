package Recursion;

import java.util.HashSet;

public class RecursionProblems {
    // //> Print factorial
    // public static int printFactorial(int n) {
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
    //     int fact_nm1 = printFactorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = printFactorial(n);
    //     System.out.println(ans);
    // }


    //> Fabonacci sequence
    // public static void printFib(int a, int b, int n) {
    //     if (n == 0) return;
    //     int c = a + b;
    //     System.out.print(" " + c);
    //     printFib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //     int a = 0;
    //     int b = 1;
    //     System.out.print(a + " ");
    //     System.out.print(b);
    //     int n = 7;
    //     printFib(a, b, n-2);
    // }


    //> Print x^n (stack height = n)
    // public static int calPower(int x, int n) {
    //     if (n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }
    //     int xPownm1 = calPower(x, n-1);
    //     int xpown = x*xPownm1;
    //     return xpown;
    // }
    // public static void main(String[] args) {
    //     int x = 2, n = 5;
    //     int ans = calPower(x,n);
    //     System.out.println(ans);
    // }


    //> Print x^n (stack height = logn)
    // public static int calPower(int x, int n) {
    //     if (n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }
    //     // if n is even
    //     if(n % 2 == 0){
    //         return calPower(x, n/2) * calPower(x, n/2);
    //     }
    //     // if n is odd
    //     else {
    //         return calPower(x, n/2) * calPower(x, n/2) * x;
    //     }
    // }
    // public static void main(String[] args) {
    //     int x = 2, n = 5;
    //     int ans = calPower(x,n);
    //     System.out.println(ans);
    // }


    //> Tower of Hanoi 
    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if(n == 1){
    //         System.out.println("Transfer disk  "+ n + " from " + src + " to " + dest);
    //         return; 
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("Transfer disk  "+ n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    //     int n = 3;
    //     towerOfHanoi(n, "S", "H", "D");
    // }


    //> Print string in reverse
    // public static void printRev(String str, int idx) {
    //     if(idx == 0){
    //         System.out.print(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx));
    //     printRev(str, idx -1);
    // }
    // public static void main(String[] args) {
    //     String str = "iamayushkarma";
    //     printRev(str, str.length()-1);

    // }


    //> Find first and last occurance of an element in string
    
    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccur(String str, int idx, char element) {
    //     if(idx == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == element){
    //         if(first == -1){
    //             first = idx;
    //         }else {
    //             last = idx;
    //         }
    //     }
    //     findOccur(str, idx+1, element);
    // }
    // public static void main(String[] args) {
    //     String str = "iamayushkarma";
    //     findOccur(str, 0, 'a');
    // }


    //> Check if an array is sorted (Strictly incresing)

    // public static boolean isSorted(int arr[], int idx){
    //     if(idx == arr.length-1){
    //         return true;
    //     }
    //     if(arr[idx] >= arr[idx+1]){
    //         // array is unsorted till now 
    //         return false;
    //     }
    //     return isSorted(arr, idx+1);
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1, 2, 6};
    //     System.out.println(isSorted(arr, 0));
    // }


    //> Move all "x" to the end of the string

    // public static void moveToEnd(String str, int idx, int count, String newString){
    //     if(idx == str.length()){
    //         for(int i = 0; i< count; i++){
    //             newString += "x";
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == 'x'){
    //         count++;
    //         moveToEnd(str, idx+1, count, newString);
    //     }else{
    //         newString += currChar;
    //          moveToEnd(str, idx+1, count, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "axbcxxd";
    //     moveToEnd(str, 0, 0, "");
    // }


    //> Remove dupilcate characters from string
    // public static boolean[]  map = new boolean[26];
    // public static void removeDuplicates(String str, int idx, String newString) {
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currentChar = str.charAt(idx);
    //     if(map[currentChar - 'a']){
    //         removeDuplicates(str, idx+1, newString);
    //     }else{
    //         newString += currentChar;
    //         map[currentChar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abbccda";
    //     removeDuplicates(str, 0, "");
    // }

    //> Print all the subsequences of a string (IMP)

    // public static void subSequences(String str, int idx, String newString) {
        
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar=str.charAt(idx);
    //     // to be
    //     subSequences(str, idx+1, newString+currChar);
    //     //or not to be
    //     subSequences(str, idx+1, newString);
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     subSequences(str, 0, "");
    // }


    //> Print all the unique subsequences of a string (IMP)

    // public static void subSequences(String str, int idx, String newString, HashSet<String> set ) {
        
    //     if(idx == str.length()){
    //         if(set.contains(newString)){
    //             return;
    //         }else{
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
    //     }
    //     char currChar=str.charAt(idx);
    //     // to be
    //     subSequences(str, idx+1, newString+currChar, set);
    //     //or not to be
    //     subSequences(str, idx+1, newString, set);
    // }
    // public static void main(String[] args) {
    //     String str = "aaa";
    //     HashSet<String> set = new HashSet<>();
    //     subSequences(str, 0, "",set);
    // }


    //> Keypad combination

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void printCombintaions(String str, int idx, String combination) {
        
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for( int i= 0; i<mapping.length(); i++){
            printCombintaions(str, idx+1, combination + mapping.charAt(i));

        }
    }
    public static void main(String[] args) {
        String str = "4";
        printCombintaions(str, 0, "");
    }
}
