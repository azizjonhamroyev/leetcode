package Count_Subarrays_With_Fixed_Bounds;

public class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int[][] dp = new int[nums.length][nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            int min = nums[i], max = nums[i];
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
            res++;
        }
        return res;
    }
}
