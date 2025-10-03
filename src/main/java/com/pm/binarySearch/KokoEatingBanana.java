package com.pm.binarySearch;

import java.util.stream.IntStream;

public class KokoEatingBanana {
    private int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = IntStream.of(piles).max().getAsInt();

        while (left < right) {
            int mid = (left + right) >>> 1;
            double eatingTime = 0;
            for (int p : piles) {
                eatingTime += Math.ceil((double)p / mid);
            }

            if (eatingTime > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int solution() {
        return minEatingSpeed(new int[]{1,4,3,2}, 9);
    }
}
