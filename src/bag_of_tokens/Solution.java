package bag_of_tokens;

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int l = 0, r = tokens.length - 1, score = 0;
        Arrays.sort(tokens);

        while (l <= r) {
            if (tokens[l] <= power) {
                score++;
                power -= tokens[l++];
            } else if (score > 0 && l < r - 1) {
                score--;
                power += tokens[r--];
            } else break;
        }
        return score;
    }
}
