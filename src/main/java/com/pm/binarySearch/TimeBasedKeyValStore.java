package com.pm.binarySearch;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedKeyValStore {
    Map<String, TreeMap<Integer, String>> map;
    public TimeBasedKeyValStore() {
        map = new HashMap<>();
    }


    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            TreeMap<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(timestamp, value);
            map.put(key, treeMap);
        } else {
            map.get(key).put(timestamp, value);
        }
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        var timeStamps = map.get(key);
        var entry = timeStamps.floorEntry(timestamp);

        return entry == null ? "" : entry.getValue();
    }
}
