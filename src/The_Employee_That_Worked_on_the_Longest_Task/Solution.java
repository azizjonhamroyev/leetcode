package The_Employee_That_Worked_on_the_Longest_Task;

public class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int res = logs[0][0], max = logs[0][1];
        for (int i = 1; i < logs.length; i++) {
            int diff = logs[i][1] - logs[i - 1][1];
            if (diff > max) {
                res = logs[i][0];
                max = diff;
            } else if (diff == max) res = Math.min(res, logs[i][0]);
        }
        return res;
    }
}
