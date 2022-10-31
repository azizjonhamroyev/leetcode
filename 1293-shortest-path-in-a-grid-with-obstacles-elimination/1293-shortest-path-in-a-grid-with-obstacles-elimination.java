class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        Deque<int[]> deque = new LinkedList<>();
        deque.offer(new int[]{0, 0, 0});
        int[][] visited = new int[m][n];

        for (int[] v : visited) {
            Arrays.fill(v, Integer.MAX_VALUE);
        }

        int res = 0;

        while (!deque.isEmpty()) {
            int size = deque.size();

            while (size-- > 0) {
                int[] curr = deque.poll();
                if (curr[0] == m - 1 && curr[1] == n - 1) return res;

                for (int[] d : directions) {
                    int X = curr[0] + d[0];
                    int Y = curr[1] + d[1];

                    if (X < 0 || Y < 0 || X >= m || Y >= n) continue;
                    int K = curr[2] + grid[X][Y];
                    if (K > k || visited[X][Y] <= K) continue;

                    visited[X][Y] = K;
                    deque.offerLast(new int[]{X, Y, K});
                }
            }
            res++;
        }
        return -1;
    }
}