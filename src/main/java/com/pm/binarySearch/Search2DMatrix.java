package com.pm.binarySearch;

public class Search2DMatrix {
    private boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = (matrix.length * matrix[0].length) - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (matrix[mid/matrix[0].length][mid%matrix[0].length] == target) {
                return true;
            } else if (matrix[mid/matrix[0].length][mid%matrix[0].length] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public boolean solution() {
        return searchMatrix(new int[][]{{1,2,4,8},{10,11,12,13},{14,20,30,40}}, 10);
    }
}
