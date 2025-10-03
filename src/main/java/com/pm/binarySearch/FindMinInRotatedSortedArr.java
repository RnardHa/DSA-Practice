package com.pm.binarySearch;

public class FindMinInRotatedSortedArr {
    private int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }

    public int solution() {
        return findMin(new int[]{3,4,5,6,1,2});
    }
}
