package com.pm.slidingWindow;

import java.util.Arrays;

public class PermutationInString {
    private boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] p1 = new int[26];
        int[] p2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            p1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            p2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(p1, p2)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            p2[s2.charAt(i - s1.length()) - 'a']--;
            p2[s2.charAt(i) - 'a']++;
            if (Arrays.equals(p1, p2)) {
                return true;
            }
        }

        return false;
    }

    public boolean solution() {
        return checkInclusion("abc", "lecaabee");
    }
}
