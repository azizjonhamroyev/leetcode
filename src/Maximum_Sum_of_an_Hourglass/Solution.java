package Maximum_Sum_of_an_Hourglass;

public class Solution {
    public int maxSum(int[][] grid) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                max = Math.max(max, grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]);
            }
        }
        return max;
    }
}
