package com.pm.random;

import java.util.ArrayList;
import java.util.List;

public class SortIntByNoOf1Bits {
    private int[] sortByBits(int[] arr) {
        List<Integer>[] count = new List[32];
        for (int i = 0; i < count.length; i++) {
            count[i] = new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int bitCount = Integer.bitCount(arr[i]);
            count[bitCount].add(arr[i]);
        }

        int[] res = new int[arr.length];
        int index = 0;
        for (var list : count) {
            if (!list.isEmpty()) {
                for (int num : list) {
                    res[index++] = num;
                }
            }
        }
        return res;
    }

    public int[] solution() {
        return sortByBits(new int[]{0,1,2,3,4,5,6,7,8});
    }
}
