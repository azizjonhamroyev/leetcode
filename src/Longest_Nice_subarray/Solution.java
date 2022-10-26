package Longest_Nice_subarray;

public class Solution {
    public int longestNiceSubarray(int[] nums) {
        int a = 0, b = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            while ((a & nums[i]) > 0) {
                a ^= nums[b++];
            }
            a |= nums[i];
            res = Math.max(res, i - b + 1);
        }
        return res;
    }
}
