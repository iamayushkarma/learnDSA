package Recursion;

public class RecursionProblems {
    // > Q1 Find Factorial
    static int findFactorial(int a) {
        if (a == 1 || a == 0)
            return a;
        return a * findFactorial(a - 1);
    }

    // > Q2 Find the nth number of Fibonacci series
    static int findFabonacciNumber(int b) {
        if (b == 1 || b == 0)
            return b;
        return findFabonacciNumber(b - 1) + findFabonacciNumber(b - 2);
    }

    // > Q3 Given an integer, find out the sum of its digits using recursion.
    static int sumOfDigits(int c) {
        if (c >= 0 && c <= 9)
            return c;
        return sumOfDigits(c / 10) + c % 10;
    }

    // > Q4 Given two numbers p & q, find the value p^q using a recursive function.
    static int power(int d, int e) {
        if (e == 0)
            return 1;

        // return power(d, e - 1) * d;

        // - Solution with less time complexity
        int ans = power(d, e / 2);
        if (e % 2 == 0) {
            return ans * ans;
        }
        return ans * ans * d;
    }

    // > Q5 Given a number num and a value k. Print k multiples of num.
    static void printMultiple(int f, int g) {
        if (g == 1) {
            System.out.print(f + " ");
            return;
        }
        printMultiple(f, g - 1);
        System.out.print(f * g + " ");
    }

    // > Q6 Given a number n. Find the sum of natural numbers till n but with
    // > alternate signs.
    static int seriesSum(int h) {
        if (h == 0)
            return 0;
        if (h % 2 == 0)
            return seriesSum(h - 1) - h;
        return seriesSum(h - 1) + h;
    }

    // > Q7 Calculate GCD for two give numbers
    static int calGCD(int i, int j) {
        // while (i % j != 0) {
        // int remender = i % j;
        // i = j;
        // j = remender;
        // }

        // > Elucid's algorithm ( gcd (x, y) = gcd (y, x % y))
        if (j == 0)
            return i;
        return calGCD(j, i % j);
    }

    // > Q8 Print all value of an array recursively
    static void printRecursive(int[] k, int idx) {
        if (k.length == idx)
            return;

        System.out.print(k[idx] + " ");
        printRecursive(k, idx + 1);
    }

    // > Q9 Find maximum number in an array
    static int findMax(int[] l, int idx) {
        if (idx == l.length - 1)
            return l[idx];

        return Math.max(l[idx], findMax(l, idx + 1));

    }

    // > Q10 Find sum of all elements in array
    static int findSum(int[] m, int idx) {
        if (idx == m.length)
            return 0;

        return m[idx] + findSum(m, idx + 1);
    }

    // > Q11 Given an array of n integers and a target value x. Print whether x
    // > exists in the array or not.
    static int findValue(int[] n, int value, int idx) {
        if (idx == n.length)
            return -1;

        if (n[idx] == value)
            return idx;
        return findValue(n, value, idx + 1);
    }

    // > Q 12 Given an array arr of size N and an integer X. The task is to find all
    // > the indices of the integer X in the array.

    static void findAllIndices(int[] o, int value, int idx) {
        if (idx == o.length)
            return;
        if (o[idx] == value) {
            System.out.print(idx + " ");
        }
        findAllIndices(o, value, idx + 1);

    }

    // > Q 13 Frog jump
    // There are N stones, numbered from 0, 1, 2...,n-i. For each i (O<=i<N), the
    // height of Stone i is hi. There is a frog who is initially on Stone 0. He will
    // repeat the following action some number of times to reach Stone N-1 :
    // If the frog is currently on Stone i, jump to Stone i+l or Stone i+2.
    // Here, a cost of |hi - hj| I is incurred, where j is the stone to land on.

    // Find the minimum possible total cost incurred before the frog reaches Stone N
    // Input n = 4
    // arr[] = 10 30 40 20
    // Output= 30

    static int frogJump(int[] arr, int n, int idx) {
        if (idx == n - 1)
            return 0;

        int opt1 = Math.abs(arr[idx] - arr[idx + 1]) + frogJump(arr, n, idx + 1);
        if (idx == n - 2)
            return opt1;
        int opt2 = Math.abs(arr[idx] - arr[idx + 2]) + frogJump(arr, n, idx + 2);

        return Math.min(opt1, opt2);
    }

    // > Q14
    // Given a string containing digits from 2-9 inclusive, return all
    // possible letter combinations that the number could represent.Return the
    // answer in any order.

    static void keypadCombinations(String digits, String[] kp, String result) { // "23"

        if (digits.length() == 0) {
            System.out.print(result + " ");
            return;
        }
        int currentNumber = digits.charAt(0) - '0'; // 2
        String currentChar = kp[currentNumber]; // "abc"

        for (int i = 0; i < currentChar.length(); i++) {
            keypadCombinations(digits.substring(1), kp, result + currentChar.charAt(i));
        }
    }

    public static void main(String[] args) {
        // > Q1
        int a = 5;
        System.out.println(a + "! = " + findFactorial(a));

        // > Q2
        int b = 10;
        System.out.println(b + "th fabonacci number is: " + findFabonacciNumber(b));
        for (int i = 0; i <= b; i++) {
            System.out.print(findFabonacciNumber(i) + " ");
        }
        System.out.println();

        // > Q3
        int c = 152679;
        System.out.println("Sum of the digits of " + c + " is: " + sumOfDigits(c));

        // > Q4
        int d = 2;
        int e = 5;
        System.out.println(d + "^" + e + " = " + power(d, e));

        // > Q5
        int f = 2;
        int g = 5;
        System.out.print(g + " multiples of " + f + " are: ");
        printMultiple(f, g);
        System.out.println();

        // > Q6
        int h = 5;
        System.out.println("Series sum of " + h + " is: " + seriesSum(h));

        // > Q7
        int i = 21;
        int j = 14;
        int gcd = calGCD(i, j);
        int lcm = (i * j) / gcd;
        System.out.println("GCD for " + i + " and " + j + " is: " + gcd + ", and their LCM"
                + " is: " + lcm);

        // > Q8
        int arr1[] = { 1, 3, 5, 6, 8 };
        printRecursive(arr1, 0);

        // > Q9
        int arr2[] = { 1, 3, 5, 6, 8 };
        System.out.println("Maximum number in array is " + findMax(arr2, 0));

        // > Q10
        int arr3[] = { 1, 3, 5, 6, 8, 55, 100 };
        System.out.println("Sum of the array is " + findSum(arr3, 0));

        // > Q11
        int arr4[] = { 1, 3, 5, 6, 8, 55, 100 };
        System.out.println("at index: " + findValue(arr4, 1010, 0));

        // > Q12
        int arr5[] = { 1, 3, 5, 6, 8, 55, 100, 8, 8 };
        int value = 8;
        System.out.print(value + " found at index ");
        findAllIndices(arr5, value, 0);
        System.out.println();

        // > Q13
        int[] arr = { 10, 30, 40, 20 };
        int n = arr.length;
        System.out.println(
                "Minimum possible total cost incurred before the frog reaches Stone N is: " + frogJump(arr, n, 0));

        // > Q14
        String str = "23";
        String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        System.out.print("Keypad combinations for " + str + " is: ");
        keypadCombinations(str, keypad, "");

    } // end of main function
}
