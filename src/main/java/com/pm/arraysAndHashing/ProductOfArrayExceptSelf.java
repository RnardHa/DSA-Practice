package com.pm.arraysAndHashing;

public class ProductOfArrayExceptSelf {
    private int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for (int i = 0; i < nums.length; i++) {
            pre[i] = prefix;
            prefix *= nums[i];

            post[nums.length - 1 - i] = postfix;
            postfix *= nums[nums.length - 1 - i];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre[i] * post[i];
        }

        return result;
    }

    public int[] solution() {
        return productExceptSelf(new int[]{1,2,3,4});
    }
}
