package com.pm.slidingWindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    private int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            int len = right - left + 1;
            int maxCount = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
            if (len - maxCount <= k) {
                max = Math.max(maxCount, len);
            } else {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return max;
    }

    public int solution() {
        return characterReplacement("XYYX", 2);
    }
}
