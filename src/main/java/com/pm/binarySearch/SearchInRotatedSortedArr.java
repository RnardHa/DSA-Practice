package com.pm.binarySearch;

public class SearchInRotatedSortedArr {
    private int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int pivot = left;
        int l = 0;
        int r = nums.length - 1;
        if (nums[pivot] <= target && target <= nums[r]) {
            l = pivot;
        } else if (nums[l] <= target && target <= nums[pivot]) {
            r = pivot;
        }

        while (l <= r) {
            int mid = (l + r) >>> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public int solution() {
        return search(new int[]{3,4,5,6,1,2}, 1);
    }

}
