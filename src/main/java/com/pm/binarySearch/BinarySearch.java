package com.pm.binarySearch;

public class BinarySearch {
    private int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                 right = mid - 1;
            }
        }

        return -1;
    }

    public int solution() {
        return search(new int[]{-1,0,2,4,6,8}, 4);
    }
}
