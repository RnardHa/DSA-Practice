package com.pm.slidingWindow;

public class BestTimeToBuyAndSellStock {
    private int maxProfit(int[] prices) {
        int left = 0;
        int right = left + 1;
        int max = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                max = Math.max(max, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }

        return max;
    }

    public int solution() {
        return maxProfit(new int[]{10,1,5,6,7,1});
    }}
