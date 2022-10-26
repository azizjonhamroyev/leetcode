package Remove_Letter_To_Equalize_Frequency;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        if (map.size() == 1) return true;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int value : map.values()) counts.put(value, counts.getOrDefault(value, 0) + 1);
        if (counts.size() == 1 && counts.containsKey(1)) return true;
        if (counts.size() == 2) {
            int[] arr = new int[4];
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                arr[i++] = entry.getKey();
                arr[i++] = entry.getValue();
            }
            return arr[0] == 1 && arr[1] == 1 || arr[2] == 1 && arr[3] == 1 || arr[1] == 1 && arr[0] - arr[2] == 1 || arr[3] == 1 && arr[2] - arr[0] == 1;
        }
        return false;
    }
}
