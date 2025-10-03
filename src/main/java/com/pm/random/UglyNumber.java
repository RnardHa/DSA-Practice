package com.pm.random;

public class UglyNumber {
    private boolean uglyNumber(int n) {
        if (n < 0) {
            return false;
        }

        for (int factor : new int[]{2,3,5}) {
            n = divide(n, factor);
        }

        return n == 1;
    }

    private int divide(int n, int factor) {
        while (n % factor == 0) {
            n /= factor;
        }

        return n;
    }

    public boolean solution() {
        return uglyNumber(6);
    }
}
