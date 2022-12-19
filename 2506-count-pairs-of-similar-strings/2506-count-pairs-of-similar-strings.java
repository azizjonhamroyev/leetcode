public class Solution {
    public int similarPairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            HashSet<Character> set = new HashSet<>();
            for (char c : word.toCharArray())
                set.add(c);


            StringBuilder stringBuilder = new StringBuilder();
            for (Character character : set)
                stringBuilder.append(character);

            String s = stringBuilder.toString();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int res = 0;

        for (int value : map.values())
            res += value * (value - 1) / 2;

        return res;
    }

}