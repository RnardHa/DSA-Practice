package com.pm.twoPointers;

public class TrappingRainWater {
    public int solution() {
        return trappingRainWater(new int[]{0,2,0,3,1,0,1,3,2,1});
    }

    private int trappingRainWater(int[] height) {
        int size = height.length;
        int[] maxLeft = new int[size];
        int[] maxRight = new int[size];
        int[] minLeftRight = new int[size];
        int left = 0;
        int right = 0;
        for (int i = 0; i < size; i++) {
            maxLeft[i] = left;
            left = Math.max(left, height[i]);

            int j = size - 1 - i;
            maxRight[j] = right;
            right = Math.max(right, height[j]);
        }

        for (int i = 0; i < size; i++) {
            minLeftRight[i] = Math.min(maxLeft[i], maxRight[i]);
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            int diff = minLeftRight[i] - height[i];
            if (diff > 0) {
                sum += diff;
            }
        }
        return sum;
    }
}
