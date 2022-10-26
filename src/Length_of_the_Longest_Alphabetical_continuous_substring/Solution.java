package Length_of_the_Longest_Alphabetical_continuous_substring;

public class Solution {
    public int longestContinuousSubstring(String s) {
        int res = 1;
        char excepted;
        int curr = 1, max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) + 1 == s.charAt(i + 1)) {
                curr++;
            } else {
                max = Math.max(curr, max);
                curr = 1;
            }
        }
        return Math.max(max, curr);
    }
}
