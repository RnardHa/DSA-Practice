package com.pm.arraysAndHashing;

public class ValidAnagram {
    public boolean solution() {
        return isAnagram("anagram", "nagaram");
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] alphabets = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            alphabets[s1.charAt(i) - 'a']++;
            alphabets[s2.charAt(i) - 'a']--;
        }

        for (int i : alphabets) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
