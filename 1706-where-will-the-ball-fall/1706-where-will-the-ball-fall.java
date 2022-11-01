public class Solution {
    public int[] findBall(int[][] A) {
        int n = A.length, m = A[0].length;
        int[] res = new int[m];

        Arrays.fill(res, -1);
        for (int i = 0; i < m; i++) {
            int x = 0, y = i;
            while (true) {
                if (x >= n) {
                    res[i] = y >= 0 && y < m ? y : -1;
                    break;
                } else if (y + 1 < m && A[x][y] == 1 && A[x][y + 1] == 1) {
                    x++;
                    y++;
                } else if (y - 1 >= 0 && A[x][y] == -1 && A[x][y - 1] == -1) {
                    x++;
                    y--;
                } else break;
            }
        }

        return res;
    }
}
