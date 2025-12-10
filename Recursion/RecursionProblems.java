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

    } // end of main function
}
