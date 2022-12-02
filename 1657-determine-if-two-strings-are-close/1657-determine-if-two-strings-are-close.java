class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);

        for (char c : word2.toCharArray()) {
            if (!map1.containsKey(c)) return false;
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int value : map1.values())
            counts.put(value, counts.getOrDefault(value, 0) + 1);

        for (int value : map2.values()) {
            if (!counts.containsKey(value) || counts.get(value) < 1) return false;
            counts.put(value, counts.get(value) - 1);
        }

        return true;
    }
}
