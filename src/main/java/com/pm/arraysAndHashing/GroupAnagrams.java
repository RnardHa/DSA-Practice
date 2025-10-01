package com.pm.arraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> solution() {
        return groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    private List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sorted = Arrays.toString(s);

            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            } else {
                map.get(sorted).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}
