class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        for (String word : words)
            if (word.charAt(0) == word.charAt(1))
                map1.put(word, map1.getOrDefault(word, 0) + 1);
            else
                map.put(word, map.getOrDefault(word, 0) + 1);

        int res = 0;

        for (String s : map.keySet()) {
            String reversed = new StringBuilder(s).reverse().toString();
            if (map.containsKey(reversed)) res += Math.min(map.get(s), map.get(reversed)) * 2;
        }

        boolean isHave = false;
        for (Integer value : map1.values()) {
            if (value % 2 == 1) isHave = true;
            res += value % 2 == 0 ? value * 2 : (value - 1) * 2;
        }
        if (isHave) res += 2;
        return res;
    }
}