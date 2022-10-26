package Number_of_Dice_Rolls_With_Target_Sum;

public class Solution {
    final int mod = 1000_000_007;

    public int numRollsToTarget(int n, int k, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int[] newDp = new int[target + 1];
            for (int j = 1; j <= k; j++) {
                for (int l = j; l <= target; l++) {
                    newDp[l] = (newDp[l] + dp[k - j]) % mod;
                }
            }
            dp = newDp;
        }
        return dp[target];
    }
}
