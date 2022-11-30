import java.util.HashMap;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) mp.put(i, mp.getOrDefault(i, 0) + 1);
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        for (int i : mp.values()) mp2.put(i, mp2.getOrDefault(i, 0) + 1);
        for (int i : mp2.values()) if (i != 1) return false;
        return true;
    }
}