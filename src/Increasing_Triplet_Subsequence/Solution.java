package Increasing_Triplet_Subsequence;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            prefix[i] = min;
            max = Math.max(max, nums[nums.length - i - 1]);
            suffix[nums.length - i - 1] = max;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (prefix[i - 1] < nums[i] && nums[i] < suffix[i + 1]) return true;
        }
        return false;
    }
}
