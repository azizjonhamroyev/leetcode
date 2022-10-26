package Largest_Positive_Integer_That_Exists_With_Its_Negative;

import java.util.HashSet;

public class Solution {
    public int findMaxK(int[] nums) {
        int res = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(-num)) {
                res = Math.max(res, Math.abs(num));
            }
            set.add(num);
        }
        return res;
    }
}
