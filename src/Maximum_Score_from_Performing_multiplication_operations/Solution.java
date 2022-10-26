package Maximum_Score_from_Performing_multiplication_operations;

public class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        int[][] dp = new int[multipliers.length + 1][multipliers.length + 1];

        for (int i = multipliers.length - 1; i >= 0; i--) {
            for (int l = i; l >= 0; l--) {
                dp[i][l] = Math.max(multipliers[i] * nums[l] + dp[i + 1][l + 1], multipliers[i] * nums[nums.length - 1 - i + l] + dp[i + 1][l]);
            }
        }
        return dp[0][0];
    }
}
