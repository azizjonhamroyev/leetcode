class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n == 1) return 1;

        int max = 2;

        for (int i = 0; i < n; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++)
                if (i != j)
                    map.merge(Math.atan2(points[j][1] - points[i][1], points[j][0] - points[i][0]), 1, Integer::sum);

            max = Math.max(max, Collections.max(map.values()) + 1);
        }

        return max;
    }
}