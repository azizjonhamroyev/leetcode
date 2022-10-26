package Optimal_Partition_of_String;

public class Solution {
    public int partitionString(String s) {
        int res = 0, n = s.length();
        boolean[] chars = new boolean[26];
        for (int i = 0; i < n; i++) {
            if (chars[s.charAt(i) - 'a']) {
                res++;
                chars = new boolean[26];
            }
            chars[s.charAt(i) - 'a'] = true;
        }
        return res + 1;
    }
}
