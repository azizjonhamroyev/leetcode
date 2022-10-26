package the_number_of_weak_characters_in_the_game;

import java.util.Arrays;

public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        int res = 0, max = 0;

        for (int[] p : properties) {
            if (p[1] < max) {
                res++;
            }
            max = Math.max(max, p[1]);
        }
        return res;
    }
}
