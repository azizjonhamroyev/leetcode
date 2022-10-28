import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for (String str : strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String s = String.valueOf(a);
            if (!mp.containsKey(s)) mp.put(s, new ArrayList<>());
            mp.get(s).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}