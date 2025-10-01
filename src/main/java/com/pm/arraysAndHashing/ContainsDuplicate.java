package com.pm.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public boolean solution() {
        return containsDuplicate(new int[]{1,2,3,3});
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(IntStream.of(nums).boxed().toList());

        return nums.length != set.size();
    }
}
