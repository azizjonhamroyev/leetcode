package time_based_key_value_store;

import kotlin.Pair;

import java.util.*;

public class TimeMap {

    HashMap<String, TreeSet<Map.Entry<Integer, String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeSet<Map.Entry<Integer, String>> pairs = map.get(key);
        if (pairs == null) pairs = new TreeSet<>(Comparator.comparingInt(Map.Entry::getKey));
        pairs.add(Map.entry(timestamp, value));
        map.put(key, pairs);
    }

    public String get(String key, int timestamp) {
        TreeSet<Map.Entry<Integer, String>> pairs = map.get(key);
        if (pairs == null) return "";
        Map.Entry<Integer, String> value = pairs.lower(Map.entry(timestamp + 1, ""));
        return value == null ? "" : value.getValue();
    }
}
