package org.example;

public class Main {
    public static void main(String[] args) {
        int position = 6;
        System.out.println("Iteration result: " + fibonacciIteration(position));
        System.out.println("Recursion result: "+ fibonacciRecursion(position));
        System.out.println("Dynamic result: "+fibonacciDynamic(position));
    }

    // Просторова складність: O(1)
    // Часова складність: O(n)
    public static long fibonacciIteration(int position) {
        long fib1 = 0, fib2 = 1, fib = 0;
        for (int i = 1; i <= position; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib1;
    }

    // Просторова складність: O(n)
    // Часова складність: O(n^2)
    public static long fibonacciRecursion(int position) {
        if (position <= 1) {
            return position;
        }
        return fibonacciRecursion(position - 1) + fibonacciRecursion(position - 2);
    }

    // Просторова складність: O(n)
    // Часова складність: O(n)
    public static int fibonacciDynamic(int position) {
        int[] fib = new int[position + 2];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= position; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[position];
    }
}
