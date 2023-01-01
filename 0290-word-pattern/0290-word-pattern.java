import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        String[] split = s.split(" ");
        if (split.length !=pattern.length()) return false;
        for (int i = 0; i < split.length; i++) {
            String s1 = map.get(pattern.charAt(i));
            Character s2 = map2.get(split[i]);
            if (s1 == null) map.put(pattern.charAt(i), split[i]);
            else if (!stringCompare(s1, split[i])) return false;

            if (s2==null) map2.put(split[i],pattern.charAt(i));
            else if (pattern.charAt(i) != s2) return false;
        }
        return true;
    }

    public boolean stringCompare(String str1, String str2) {

        int l1 = str1.length();

        if (l1 != str2.length()) return false;
        for (int i = 0; i < l1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}