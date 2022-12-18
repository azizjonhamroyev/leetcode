public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length], all = new int[101];
        ans[ans.length - 1] = 0;
        all[temperatures[temperatures.length - 1]] = temperatures.length - 1;
        for (int i = temperatures.length - 2; i >= 0; i--) {
            all[temperatures[i]] = i;
            int min = Integer.MAX_VALUE;
            for (int j = temperatures[i] + 1; j <= 100; j++) if (all[j] != 0) min = Math.min(min, all[j]);
            ans[i] = min == Integer.MAX_VALUE ? 0 : min - i;
        }
        return ans;
    }
}