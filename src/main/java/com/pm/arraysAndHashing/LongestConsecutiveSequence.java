package com.pm.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LongestConsecutiveSequence {
    private int longestConsecutive(int[] nums) {
        //for each number find out if it can be the first number
        //put the init number into a set to get rid duplicate and also find if exist
        Set<Integer> set = new HashSet<>(IntStream.of(nums).boxed().toList());
        int longest = 0;

        for (int num : nums) {
            int count = 1;
            if (!set.contains(num - 1)) {
                while (set.contains(num + count)) {
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public int solution() {
        return longestConsecutive(new int[]{2,20,4,10,3,4,5});
    }
}
