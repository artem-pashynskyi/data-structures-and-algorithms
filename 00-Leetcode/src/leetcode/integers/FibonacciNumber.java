package leetcode.integers;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fi2b(6));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static int fi2b(int n) {
        if(n <= 1) {
            return n;
        }
        return fi2b(n - 1) + fi2b(n - 2);
    }
}