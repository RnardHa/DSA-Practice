package com.pm.twoPointers;

public class ContainerWithMostWater {
    private int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int area = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public int solution() {
        return maxArea(new int[]{1,7,2,5,4,7,3,6});
    }
}
