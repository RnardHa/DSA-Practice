package com.pm.twoPointers;

public class SortedTwoSum {
    private int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                 left++;
            }
        }

        return new int[0];
    }

    public int[] solution() {
        return twoSum(new int[]{1,2,3,4}, 3);
    }
}
