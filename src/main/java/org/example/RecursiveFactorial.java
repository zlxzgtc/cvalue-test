package org.example;

public class RecursiveFactorial {
    public static void main(String[] args) {
        long factorial = calculateFactorial(5);
        System.out.println(factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
